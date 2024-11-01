public class CustomerManager {
    public void add(){
        System.out.println("Eklendi");
        DataBaseLogger logger = new DataBaseLogger();
        logger.log("Log mesaji");
    }
}
