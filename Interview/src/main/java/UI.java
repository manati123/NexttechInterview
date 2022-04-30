//import lombok.var;

import java.io.Reader;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UI implements iUI{
    Scanner scanner;
    public UI(IService service) {
        this.service = service;
//        this.scanner = new Scanner();
    }

    IService service;


    @Override
    public void run() {
        while(1 == 1){
            String input;
            input = scanner.next();
            if(input.equals("0"))
                return;
            else{
                switch(input){
                    case "1":
                        addAmmount();
                        break;
                    case "2":
                        transfer();
                        break;
                    case "3":
                        filterOnlyByDate();
                        break;
                    case "4":
                        filterByActorAndDate();
                        break;
                    case "5":
                        filterByTypeAndDate();
                        break;
                }
            }




        }
    }

    @Override
    public void addAmmount() {
//        Scanner scanner = new Scanner();
        double amount = scanner.nextDouble();
        String iban = scanner.next();
        this.service.addMoney(iban,amount);

    }

    @Override
    public void transfer() {
        String iban1, iban2;
        iban1 = scanner.next();
        iban2 = scanner.next();
        double amount = scanner.nextDouble();
        try {
            this.service.sendMoney(iban1, iban2, amount);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void retrieveAmmount() {

    }

    @Override
    public void filterOnlyByDate() {
        Date date1, date2;
        date1 = new Date(scanner.next().toString());
        date2 = new Date(scanner.next().toString());
        var results = this.service.filterActions(date1,date2);
        for(var x: results)
            System.out.println(x);
    }

    @Override
    public void filterByActorAndDate() {
        Date date1, date2;
        date1 = new Date(scanner.next().toString());
        date2 = new Date(scanner.next().toString());
        String actor = scanner.next();
        var results = this.service.filterActions(date1,date2);
        for(var x: results)
            if(x.actorIBAN == actor)
                System.out.println(x);
    }

    @Override
    public void filterByTypeAndDate() {
        Date date1, date2;
        date1 = new Date(scanner.next().toString());
        date2 = new Date(scanner.next().toString());
        String type = scanner.next();
        var results = this.service.filterActions(date1,date2);
        for(var x: results)
            if(x.type.toString().equals(type.toUpperCase(Locale.ROOT)))
                System.out.println(x);
    }
}
