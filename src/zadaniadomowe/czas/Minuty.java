package zadaniadomowe.czas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Minuty {
    public static void main(String[] args) {
        LocalDateTime teraz = LocalDateTime.now();
        String wzorCzasu = "mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(wzorCzasu);
        String minuty = formatter.format(teraz);
        int jakaMinuta = Integer.parseInt(minuty);
        if(jakaMinuta%2 == 0){
            System.out.println("Minuta parzysta: " + jakaMinuta);
        } else {
            System.out.println("Minuta nieparzysta: " + jakaMinuta);
        }
    }
}
