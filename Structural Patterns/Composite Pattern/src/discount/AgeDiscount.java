package discount;

import model.User;

public class AgeDiscount extends DiscountRule{
    private int ageThreshold;

    public AgeDiscount(int ageThreshold, double youthDiscount, double adultDiscount) {
        this.ageThreshold = ageThreshold;
        this.youthDiscount = youthDiscount;
        this.adultDiscount = adultDiscount;
    }

    public double getYouthDiscount() {
        return youthDiscount;
    }

    public void setYouthDiscount(double youthDiscount) {
        this.youthDiscount = youthDiscount;
    }

    public int getAgeThreshold() {
        return ageThreshold;
    }

    public void setAgeThreshold(int ageThreshold) {
        this.ageThreshold = ageThreshold;
    }

    public double getAdultDiscount() {
        return adultDiscount;
    }

    public void setAdultDiscount(double adultDiscount) {
        this.adultDiscount = adultDiscount;
    }

    private double youthDiscount;
    private double adultDiscount;


    @Override
    public double calculateDiscount(User user) {
        return user.getAge() <= ageThreshold ? youthDiscount : adultDiscount;
        // 这个不是箭头函数而是比较大小
    }
}
