
public class Main {
    public static void main(String[] args) {
        IBank bank = new Bank();
        IService service = new Service(bank);
        iUI ui = new UI(service);
        ui.run();
    }
}
