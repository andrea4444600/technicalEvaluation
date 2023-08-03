public class BulkDiscountStrategy implements PricingStrategy {

    private double bulkPrice;
    private int bulkQuantity;

    public BulkDiscountStrategy(double bulkPrice, int bulkQuantity) {
        this.bulkPrice = bulkPrice;
        this.bulkQuantity = bulkQuantity;
    }

    @Override
    public double calculateTotalPrice(Product product, int quantity) {
        if (quantity >= bulkQuantity) {
            return quantity * bulkPrice;
        } else {
            return quantity * product.getPrice();
        }

    }
}
