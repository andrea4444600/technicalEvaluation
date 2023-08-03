public class CofeeStrategy implements PricingStrategy {

    private double discountPercentage;

    public CofeeStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotalPrice(Product product, int quantity) {
        if (quantity >= 3) {
            return quantity * product.getPrice() * (1 - discountPercentage);
        } else {
            return quantity * product.getPrice();
        }

    }
}
