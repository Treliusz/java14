package barteczko.wyjatki;

import javax.swing.*;

public class ZlyFormat {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Podaj pierwszą licznę:");
        if(s1 != null){
            String s2 = JOptionPane.showInputDialog("Podaj drugą licznę:");
            if(s2 != null){
                int n1, n2;
                try {
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s2);
                }catch (NumberFormatException exp){
                    System.out.println("Błędne dane - kończę działanie");
                    return;
                }
                JOptionPane.showMessageDialog(null,"Suma: " + (n1 + n2));
            }
        }
    }
}
