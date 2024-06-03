package patterns.factory;

public class CoffeeFactory {

    public static Coffee createCoffee(String type) {

        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }

    }
}

