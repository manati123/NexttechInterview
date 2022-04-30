import java.util.ArrayList;
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

    public void sendMoney(String senderIBAN, String receiverIBAN,double amount) throws Exception {
        this.bank.sendMoney(senderIBAN,receiverIBAN,amount);
    }

    public ArrayList<Action> filterActions(Date initialDate, Date finalDate) {
        return this.bank.filterActions(initialDate,finalDate);
    }

    @Override
    public void addMoney(String IBAN, double amount) {
        this.bank.getAccounts().get(IBAN).addMoney(amount);
    }
}
