import java.util.ArrayList;
import java.util.Date;

public interface IBank {
    void addAccount(Account newAccount);
    void sendMoney(String senderIBAN, String receiverIBAN, double ammount) throws Exception;
    ArrayList<Action> filterActions(Date initialDate, Date finalDate);
}
