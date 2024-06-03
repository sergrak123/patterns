package patterns.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        // Создаем прокси для базы данных
        Database dbProxy = new DatabaseProxy("myDatabase", "localhost", 5432);

        // Подключаемся к базе данных через прокси
        dbProxy.connect();
    }
}
