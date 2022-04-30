import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@NoArgsConstructor
public class Bank implements IBank{
//    ArrayList<Account> accounts;
    HashMap<String, Account> accounts;
    ArrayList<Action> actions;
    public void addAccount(Account newAccount) {
        this.accounts.put(newAccount.IBAN, newAccount);
    }

    public void sendMoney(String senderIBAN, String receiverIBAN, double ammount) throws Exception {
        if(accounts.get(senderIBAN).currentAmmount - ammount > 0)
        {
            accounts.get(senderIBAN).currentAmmount -= ammount;
            accounts.get(receiverIBAN).currentAmmount += ammount;
        }
        else throw new Exception("Insufficient funds!");
    }

    public ArrayList<Action> filterActions(Date initialDate, Date finalDate) {
        ArrayList<Action> result = new ArrayList<Action>();
        for(var act:actions){
            if(act.happenedIn.after(initialDate) && act.happenedIn.before(finalDate))
                result.add(act);
        }
        return result;
    }
}
