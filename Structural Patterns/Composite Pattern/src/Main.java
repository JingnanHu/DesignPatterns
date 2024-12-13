import discount.*;
import model.User;

public class Main {
    public static void main(String[] args) {
        DiscountRule genderDiscount = new GenderDiscount(10, 15); // 男10%，女15%
        DiscountRule ageDiscount = new AgeDiscount(25, 20, 10); // 小于等于25岁20%，否则10%DiscountRule maritalStatusDiscount = new MaritalStatusDiscount(5, 10); //
        DiscountRule maritalStatusDiscount = new MaritalStatusDiscount(5, 10); // 单身5%，已婚10%

        CompositeDiscountRule combinedRule = new CompositeDiscountRule();
        combinedRule.addRule(genderDiscount);
        combinedRule.addRule(ageDiscount);
        combinedRule.addRule(maritalStatusDiscount);


        User user = new User("female", 22, "single", "student");

        // 计算总折扣
        double totalDiscount = combinedRule.calculateDiscount(user);
        System.out.println("Total Discount for user: " + totalDiscount + "%");



    }
}
