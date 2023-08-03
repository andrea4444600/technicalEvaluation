import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class CheckoutTest {


    @Test
    public void testBasket1() {
        Checkout checkoutSystem = new Checkout();

        checkoutSystem.scan("GR1");
        checkoutSystem.scan("SR1");
        checkoutSystem.scan("GR1");
        checkoutSystem.scan("GR1");
        checkoutSystem.scan("CF1");

        double expectedPrice = 22.45;
        assertEquals(expectedPrice, checkoutSystem.getTotalPrice(), 0.001);
    }

    @Test
    public void testBasket2() {
        Checkout checkoutSystem = new Checkout();

        checkoutSystem.scan("GR1");
        checkoutSystem.scan("GR1");

        double expectedPrice = 3.11;
        assertEquals(expectedPrice, checkoutSystem.getTotalPrice(), 0.001);
    }

    @Test
    public void testBasket3() {
        Checkout checkoutSystem = new Checkout();

        checkoutSystem.scan("SR1");
        checkoutSystem.scan("SR1");
        checkoutSystem.scan("SR1");
        checkoutSystem.scan("GR1");

        double expectedPrice = 16.61;
        assertEquals(expectedPrice, checkoutSystem.getTotalPrice(), 0.001);
    }

    @Test
    public void testBasket4() {
        Checkout checkoutSystem = new Checkout();

        checkoutSystem.scan("GR1");
        checkoutSystem.scan("CF1");
        checkoutSystem.scan("SR1");
        checkoutSystem.scan("CF1");
        checkoutSystem.scan("CF1");

        double expectedPrice = 30.57;
        assertEquals(expectedPrice, checkoutSystem.getTotalPrice(), 0.001);
    }
}
