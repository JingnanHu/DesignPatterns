package discount;

import model.User;

public class MaritalStatusDiscount extends DiscountRule{
    private double marriedDiscount;

    public double getMarriedDiscount() {
        return marriedDiscount;
    }

    public void setMarriedDiscount(double marriedDiscount) {
        this.marriedDiscount = marriedDiscount;
    }

    public double getSingleDiscount() {
        return singleDiscount;
    }

    public void setSingleDiscount(double singleDiscount) {
        this.singleDiscount = singleDiscount;
    }

    public MaritalStatusDiscount(double marriedDiscount, double singleDiscount) {
        this.marriedDiscount = marriedDiscount;
        this.singleDiscount = singleDiscount;
    }

    private double singleDiscount;



    @Override
    public double calculateDiscount(User user) {
        return "single".equalsIgnoreCase(user.getMaritalStatus()) ? singleDiscount : marriedDiscount;
    }
}
