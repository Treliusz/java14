package zadaniadomowe.enumy.piwo;

import java.util.Random;

public class Impreza {

    static GatunekPiwa[] tablica = new GatunekPiwa[2];

    public Impreza(){
        for(int i=0; i<tablica.length; i++){
            tablica[i] = losujPiwo();
            if(tablica[0].equals(tablica[1])){
                i--;
            }
        }
    }
    public static GatunekPiwa losujPiwo(){
        Random random = new Random();
        return GatunekPiwa.values()[random.nextInt(GatunekPiwa.values().length)];
    }
    public static void wyswietlPiwo(){
        for(int i=0; i<tablica.length; i++){
            GatunekPiwa.opiszPiwo(tablica[i]);
        }
    }
    public static void main(String[] args) {
        Impreza impreza = new Impreza();
        wyswietlPiwo();
    }
}