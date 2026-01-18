package stratergy;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(1000);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(500);


    }
}

