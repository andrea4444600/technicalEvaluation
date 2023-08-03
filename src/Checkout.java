import java.util.HashMap;
import java.util.Map;

public class Checkout {

        private Map<String, Product> products = new HashMap<>();
        private Map<String, Integer> cart = new HashMap<>();

        public Checkout() {
            // Initialize products
            Product greenTea = new Product("Green tea",3.11 , "GR1");
            Product strawberries = new Product("Strawberries", 5.00, "SR1");
            Product coffee = new Product("Coffee",11.23 ,"CF1" );

            // Set pricing strategies for each product
            greenTea.setPricingStrategy(new OneAndOneFree());
            strawberries.setPricingStrategy(new BulkDiscountStrategy(4.50, 3));
            coffee.setPricingStrategy(new CofeeStrategy((1.0 / 3.0)));

            // Add products to the checkout system
            products.put(greenTea.getBarcode(), greenTea);
            products.put(strawberries.getBarcode(), strawberries);
            products.put(coffee.getBarcode(), coffee);

    }




    public void scan(String productCode) {
        if (!products.containsKey(productCode)) {
            throw new IllegalArgumentException("Product with code " + productCode + " not found.");
        }

        cart.put(productCode, cart.getOrDefault(productCode, 0) + 1);
    }

    //Not in the requirement, but I think it can be useful
    public void removeProduct(String productCode, int quantityToRemove) {
        if (!cart.containsKey(productCode)) {
            throw new IllegalArgumentException("Product with code " + productCode + " not found in cart.");
        }

        int currentQuantity = cart.get(productCode);
        if (currentQuantity > quantityToRemove) {
            cart.put(productCode, currentQuantity - quantityToRemove);
        } else {
            cart.remove(productCode);
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0.00;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String productCode = entry.getKey();
            int quantity = entry.getValue();
            Product product = products.get(productCode);
            totalPrice += product.calculateTotalPrice(quantity);
        }
        return totalPrice;
    }
}
