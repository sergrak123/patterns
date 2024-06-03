package patterns.singleton;

public class LoggerDemo {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        class TestClass {}
        logger.classLogg(new TestClass(), "Some info");

    }
}
