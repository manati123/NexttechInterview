import java.util.ArrayList;
import java.util.Date;

public interface IService {
    void addAccount(String IBAN, double currentAmmount, Currency currency);
    void sendMoney(String senderIBAN, String receiverIBAN, double amount) throws Exception;
    ArrayList<Action> filterActions(Date initialDate, Date finalDate);
    void addMoney(String IBAN, double amount);
}
