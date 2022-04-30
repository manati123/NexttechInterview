import java.util.Date;

public class Service implements IService{
    IBank bank;

    public Service(IBank bank) {
        this.bank = bank;
    }


    public void addAccount(String IBAN, double currentAmmount, Currency currency) {
        Account a = new Account(IBAN, currentAmmount, currency);
        this.bank.addAccount(a);
    }

    public void sendMoney(String senderIBAN, String receiverIBAN) throws Exception {

    }

    public void filterActions(Date initialDate, Date finalDate) {

    }
}
