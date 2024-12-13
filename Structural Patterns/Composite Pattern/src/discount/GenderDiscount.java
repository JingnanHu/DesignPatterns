package discount;

import model.User;

public class GenderDiscount extends DiscountRule{
    public double getMaleDiscount() {
        return maleDiscount;
    }

    public void setMaleDiscount(double maleDiscount) {
        this.maleDiscount = maleDiscount;
    }

    public double getFemaleDiscount() {
        return femaleDiscount;
    }

    public void setFemaleDiscount(double femaleDiscount) {
        this.femaleDiscount = femaleDiscount;
    }

    private double maleDiscount;

    public GenderDiscount(double maleDiscount, double femaleDiscount) {
        this.maleDiscount = maleDiscount;
        this.femaleDiscount = femaleDiscount;
    }

    private double femaleDiscount;



    @Override
    public double calculateDiscount(User user) {
        return "male".equals(user.getGender()) ? femaleDiscount : maleDiscount;
    }
}
