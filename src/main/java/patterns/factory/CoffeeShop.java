package patterns.factory;

public class CoffeeShop {

    public static void main(String[] args) {
        // Создаем эспрессо
        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.prepare();

        // Создаем американо
        Coffee americano = CoffeeFactory.createCoffee("americano");
        americano.prepare();
    }
}
