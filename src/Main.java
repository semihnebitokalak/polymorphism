//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmailLogger logger = new EmailLogger();
        logger.log("Log mesajı");
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();

    }
}