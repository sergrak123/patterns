package patterns.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLogg(Object obj, String info) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy");
        String currentDate = formatter.format(new Date());

        String className = obj.getClass().getSimpleName();

        System.out.println("Log info: " + currentDate + " - " + className + " - " + info);
    }
}
