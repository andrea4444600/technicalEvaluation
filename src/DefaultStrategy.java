public class DefaultStrategy implements PricingStrategy{

    @Override
    public double calculateTotalPrice(Product product, int quantity) {
        return  product.getPrice() * quantity;
    }
}
