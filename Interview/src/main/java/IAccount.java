import java.util.Date;

public interface IAccount {
    void addMoney(double value);
    void retrieveMoney(double value) throws Exception;
//    void sendMoney(String IBAN);
//    void filterActions(Date initialDate, Date finalDate);
}
