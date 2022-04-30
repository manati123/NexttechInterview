import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account implements IAccount{
    public Account(String IBAN, double currentAmmount, Currency currency) {
        this.IBAN = IBAN;
        this.currentAmmount = currentAmmount;
        this.currency = currency;
    }

    String IBAN;
    double currentAmmount;
    Currency currency;
    public void addMoney(double value) {
        this.currentAmmount += value;
    }

    public void retrieveMoney(double value) throws Exception {
        if(currentAmmount - value > 0)
            currentAmmount -= value;
        else
            throw new Exception("Not enough money!");
    }


}
