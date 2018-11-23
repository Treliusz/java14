package zadaniadomowe.daty;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.IllegalFormatException;
import java.util.InvalidPropertiesFormatException;

public class MojaData {

    int day, month, year;
    public MojaData(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void wyswietlDate() {
        String wzorDaty1 = "d.MM.yyyy";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(wzorDaty1);
        String wzorDaty2 = "dd MM yyyy";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(wzorDaty2);
        String wzorDaty3 = "d MMM yyyy";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern(wzorDaty3);
        String wzorDaty4 = "d MMMM yyyy";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern(wzorDaty4);

        try {
            System.out.println(formatter1.format(LocalDate.of(year, month, day)));
            System.out.println(formatter2.format(LocalDate.of(year, month, day)));
            System.out.println(formatter3.format(LocalDate.of(year, month, day)));
            System.out.println(formatter4.format(LocalDate.of(year, month, day)));

        } catch (IllegalFormatException exp) {
            System.out.println("Niewłaściwy format daty");
            return;
        } catch (Exception exp) {
            System.out.println("Niezidentyfikowany błąd");
            return;
        }
    }
    public static void main(String[] args) {
        int day=1, month=1, year=1900;

        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj dzień w postaci liczby"));
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj miesiąc w postaci liczby"));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj rok"));

        MojaData mojaData = new MojaData(day,month,year);
        mojaData.wyswietlDate();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
