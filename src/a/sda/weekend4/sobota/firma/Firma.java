package a.sda.weekend4.sobota.firma;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Firma {
    private String name;
    private List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
    public static final String PATH_TO_FILE = "C:\\Users\\vmtr0\\OneDrive\\Programowanie\\Java\\SDA\\lista.txt";
    private static final int MAX_EMPLOYEES_COUNT = 2;
    private int licznik = 0;

    public Firma(String name) {
        this.name = name;
        // this.pracownicy =  new  Pracownik[MAX_EMPLOYEES_COUNT];
    }
    public boolean dodajPracownika(Pracownik pracownik){
        if(licznik<MAX_EMPLOYEES_COUNT){
            listaPracownikow.add(pracownik);
            licznik++;
        } else System.out.println("Odmowa zatrudnienia - brak wolnych etatów\n");
        return false;
    }
    public boolean usunPracownika(Pracownik pracownik){
        if (licznik!=0){
            int tempLicznik = licznik;
            for (int i=0; i<licznik; i++){
                if((listaPracownikow.get(i).getImie().equals(pracownik.getImie())) && (listaPracownikow.get(i).getNazwisko().equals(pracownik.getNazwisko()))){
                    listaPracownikow.remove(i);
                    System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko() + " zostal zwolniony");
                    licznik--;

                }
            } if (tempLicznik == licznik){
                System.out.println("Nie zatrudniamy takiego pracownika\n");
            }
        } else System.out.println("Obecnie nikogo nie zatrudniamy\n");
        return false;
    }
    public boolean usunPracownika(int id){
        //todo implementacja
        return false;
    }
    public void wyswietlPracownikow(){
        if(licznik != 0) {
            System.out.println("Lista pracownikow:\n");
            for (int i = 0; i < licznik; i++) {
                System.out.println(listaPracownikow.get(i));
            }
        } else System.out.println("Firma jeszcze nikogo nie zatrudniła");
    }
    public void wczytajPlik(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE ));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException exp){
            System.out.println("Wyjątek " + exp.getLocalizedMessage());
            System.out.println("\nPlik nie istnieje");
        } catch (Exception exp){
            exp.printStackTrace();
        }
    }
    public void zapiszDoPliku(){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_FILE))){
            if(licznik != 0) {
                for (int i = 0; i < licznik; i++) {
                    writer.write(listaPracownikow.get(i).toString());
                }
            } else System.out.println("Firma jeszcze nikogo nie zatrudniła");
        } catch (IOException e) {
            System.out.println("Nie udało osie zapisać do pliku");
        }
    }

}
