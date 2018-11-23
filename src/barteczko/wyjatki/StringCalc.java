package barteczko.wyjatki;

import javax.swing.*;

public class StringCalc {
    public String sum(String s1, String s2){
        int sum = 0;
        int sumLenght = 0;
        try {
            sum = Integer.parseInt(s1) + Integer.parseInt(s2);
            sumLenght = s1.length() + s2.length();
        } catch (NullPointerException exp){
            return "Któryś z napisów jest null";
        } catch (NumberFormatException exp) {
            return "Któryś z napisów nie jest liczną";
        } catch (Exception exp) {
            return "Wystąpił błąd";
        } finally {
            JOptionPane.showMessageDialog(null,"Jestem finalny");
        }
        return "Suma: " + sum + "\nSuma długości: " + sumLenght;
    }

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,"Podaj pierwszą licznę");
        String s2 = JOptionPane.showInputDialog(null, "Podaj drugą licznę");
        StringCalc calc = new StringCalc();
        JOptionPane.showMessageDialog(null, calc.sum(s1, s2));
    }
}
