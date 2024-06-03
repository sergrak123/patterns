package patterns.proxy;

public class DatabaseProxy implements Database {

    private RealDatabase realDatabase;
    private String dbName;
    private String host;
    private int port;

    public DatabaseProxy(String dbName, String host, int port) {
        this.dbName = dbName;
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect() {
        if (realDatabase == null) {
            realDatabase = new RealDatabase(host + ":" + port + "/" + dbName);
        }
        realDatabase.connect();
    }
}

