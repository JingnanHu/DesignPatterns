package discount;

import model.User;

public abstract class DiscountRule {
    public abstract double calculateDiscount(User user);
}
