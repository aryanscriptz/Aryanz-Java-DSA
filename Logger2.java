class Logger {

    static void print(String message) {
        System.out.println("Plain Log: " + message);
    }
}

class JSONLogger extends Logger {

    static void print(String message) {
        System.out.println("{\"message\":\"" + message + "\"}");
    }
}

public class Logger2{

    public static void main(String[] args) {

        Logger logger = new JSONLogger();

        logger.print("Hello World");

        JSONLogger jsonLogger = new JSONLogger();

        jsonLogger.print("Hello World");
    }
}