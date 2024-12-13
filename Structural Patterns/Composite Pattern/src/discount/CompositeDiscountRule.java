package discount;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class CompositeDiscountRule extends DiscountRule {
    private List<DiscountRule> rules = new ArrayList<>();
    public void addRule(DiscountRule rule) {
        rules.add(rule);
    }
    @Override
    public double calculateDiscount(User user) {
        return rules.stream()
                .mapToDouble(rule -> rule.calculateDiscount(user))
                .sum();
    }
}
