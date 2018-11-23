package zadaniadomowe.daty;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;

public class Wydarzenie {

    String nazwaWydarzenia;
    MojaData dataWydarzenia;
    public Wydarzenie(String nazwaWydarzenia, MojaData dataWydarzenia){
        this.nazwaWydarzenia = nazwaWydarzenia;
        this.dataWydarzenia = dataWydarzenia;
    }

    public  long ilePozostaloLat(){
        long between = YEARS.between(LocalDate.now(),LocalDate.of(dataWydarzenia.getYear(),dataWydarzenia.getMonth(), dataWydarzenia.getDay()));
        return between;
    }
    public long ilePozostaloMiesiecy(){
        long between = MONTHS.between(LocalDate.now(),LocalDate.of(dataWydarzenia.getYear(), dataWydarzenia.getMonth(), dataWydarzenia.getDay()));
        return between;
    }
    public long ilePozostaloDni() {
        long between = DAYS.between(LocalDate.now(), LocalDate.of(dataWydarzenia.getYear(), dataWydarzenia.getMonth(), dataWydarzenia.getDay()));
        return between;
    }

    public static void main(String[] args) {
        Wydarzenie wydarzenie = new Wydarzenie("Certyfikat SDA", new MojaData(15,12,2019));
        System.out.println(wydarzenie.ilePozostaloLat());
        System.out.println(wydarzenie.ilePozostaloMiesiecy());
        System.out.println(wydarzenie.ilePozostaloDni());
    }

}
