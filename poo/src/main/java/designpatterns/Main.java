package designpatterns;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();

        //Test Factory
        Animal sparky = AnimalFactory.getAnimal("dog");
        sparky.scream();
        Animal russo = AnimalFactory.getAnimal("cat");
        russo.scream();

        //Test Strategy
        Cart cart = new Cart(new CartStrategy());
        cart.pay(500);

        Cart cart1 = new Cart(new PayPalStrategy());
        cart1.pay(700);
    }
}
