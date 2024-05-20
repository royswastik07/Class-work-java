package ttransaction;

import java.util.*;
import java.time.LocalDate;

class trans{
    int bal;
    String r;
    String cash_det(int amt,int cash_rec){
        Random random = new Random(1234);
        int randomNumber = 1000 + random.nextInt(9000);
        bal=cash_rec-amt;
        LocalDate dt = LocalDate.now();
        String c=String.valueOf(randomNumber)+","+String.valueOf(dt)+","+String.valueOf(bal)+","+String.valueOf(amt)+","+String.valueOf(cash_rec);
        return c;
    }
    String card_det(int amt,String cardno, String name){
        Random randomm = new Random(1234);
        LocalDate dte = LocalDate.now();
        if(cardno == null) {
            return "NULL";
        }
        String crd= cardno.replaceAll("[^-](?=.{4})", "x");
        String d=String.valueOf(randomm)+","+String.valueOf(dte)+","+String.valueOf(crd)+","+String.valueOf(amt)+","+String.valueOf(name);
        return d;

    }

}

public class transaction{
    trans tr=new trans();
    public String cash_trnsctn(int amt,int rec){
        
        // int amt=amt;
        // int rec=rec;
        String c=tr.cash_det(amt,rec);
        System.out.println(c);
        return c;
    }

    public String card_trnsctn(int amt,String cardno,String name){
        String d=tr.card_det(amt,cardno,name);
        System.out.println(d);
        return d;
    }
}