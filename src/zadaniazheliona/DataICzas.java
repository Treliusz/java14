package zadaniazheliona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataICzas {
    public static void main(String[] args) {
        String wzorDaty = "MM/dd/yy";
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern(wzorDaty);
        System.out.println(formatDaty.format(LocalDate.of(2018,11,8)));

        String wzorCzasu = "HH:mm:ss";
        DateTimeFormatter formatCzasu = DateTimeFormatter.ofPattern(wzorCzasu);
        System.out.println(formatCzasu.format(LocalTime.of(23,41,25)));

        LocalDateTime teraz = LocalDateTime.now();
        String wzorDatyICzasu = "dd.MM.yyyy HH:mm:ss";
        DateTimeFormatter formatDatyICzasu = DateTimeFormatter.ofPattern(wzorDatyICzasu);
        System.out.println(formatDatyICzasu.format(teraz));
        System.out.println(teraz.format(formatDatyICzasu));


    }
}
