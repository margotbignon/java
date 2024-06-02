package designpatterns;

public class CartStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by card.");
    }
}
