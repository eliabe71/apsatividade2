package enties.repositories;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Teste{
    public static void main(String[] args){
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d2.set(2020, 11, 12);

        Location l = new Location("",3,d1,d2); 
        System.out.println(l.calcularMulta());
    }
}