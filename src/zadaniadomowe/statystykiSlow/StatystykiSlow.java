package zadaniadomowe.statystykiSlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StatystykiSlow {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj tekst wielowyrazowy:");
        String lancuch = klawiatura.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(lancuch);

        System.out.println("Ilość słów w tekście: " + stringTokenizer.countTokens());

        List<String> listaSlow = new ArrayList<String>();
        while (stringTokenizer.hasMoreTokens()){
            listaSlow.add(stringTokenizer.nextToken());
        }
        int dlugosc = 0;
        for (int i=0; i<listaSlow.size(); i++){
            dlugosc += listaSlow.get(i).length();
        }
        double sredniaDlugosc = (double) dlugosc/listaSlow.size();
        System.out.printf("średnia długość słowa to: %.2f\n", sredniaDlugosc);

        String najczestszeSlowo = "";
        int najwiekszyLicznik = 0;
        for(int i=0; i<listaSlow.size(); i++){
            int tymczasowyLicznik = 0;
            String tymczasoweSlowo = listaSlow.get(i);
            for(int j=0; j<listaSlow.size(); j++){
                if(listaSlow.get(j).equals(tymczasoweSlowo)){
                    tymczasowyLicznik++;
                }
                if(tymczasowyLicznik>najwiekszyLicznik){
                    najwiekszyLicznik = tymczasowyLicznik;
                    najczestszeSlowo = tymczasoweSlowo;
                }
            }

        }
        String najrzadszeSlowo = listaSlow.get(0);
        int najmniejszyLicznik = najwiekszyLicznik;
        for(int i=0; i<listaSlow.size(); i++){
            int tymczasowyLicznik = 0;
            String tymczasoweSlowo = listaSlow.get(i);
            for(int j=0; j<listaSlow.size(); j++){
                if(listaSlow.get(j).equals(tymczasoweSlowo)){
                    tymczasowyLicznik++;
                }
            }
            if(tymczasowyLicznik<najmniejszyLicznik){
                najrzadszeSlowo = tymczasoweSlowo;
                najmniejszyLicznik = tymczasowyLicznik;
            }
        }

        System.out.println("Najczęstsze słowo to: " + najczestszeSlowo);
        System.out.println("Ilość wystąpień: " + najwiekszyLicznik);
        System.out.println("Najrzadsze słowo to: " + najrzadszeSlowo);
        System.out.println("ilość wystąpień: " + najmniejszyLicznik);

    }
}
