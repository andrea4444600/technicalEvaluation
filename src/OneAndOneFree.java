public class OneAndOneFree implements PricingStrategy {


    //TODO riscriverla
    @Override
    public double calculateTotalPrice(Product product, int quantity) {
        int freeItemCount = quantity / 2;
        int paidItemCount = quantity - freeItemCount;
        return paidItemCount * product.getPrice();    }
}
