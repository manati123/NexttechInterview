import java.util.Date;

public interface IService {
    void addAccount(String IBAN, double currentAmmount, Currency currency);
    void sendMoney(String senderIBAN, String receiverIBAN) throws Exception;
    void filterActions(Date initialDate, Date finalDate);
}
