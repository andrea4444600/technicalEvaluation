public class Product {
    private String name;
    private double price;
    private String barcode;
    private PricingStrategy pricingStrategy;


    public Product(String name, double price, String barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.pricingStrategy = new DefaultStrategy();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotalPrice(int quantity) {
        return pricingStrategy.calculateTotalPrice(this, quantity);
    }

}
