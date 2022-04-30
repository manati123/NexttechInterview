import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public interface IBank {
    void addAccount(Account newAccount);
    void sendMoney(String senderIBAN, String receiverIBAN, double ammount) throws Exception;
    ArrayList<Action> filterActions(Date initialDate, Date finalDate);
    HashMap<String,Account> getAccounts();
}
