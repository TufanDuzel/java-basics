public class DatabaseLogger extends BaseLogger {
    //overriding
    public void Log(String message) {
        System.out.println("Logged to database: " + message);
    }
}
