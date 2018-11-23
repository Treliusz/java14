package zadaniadomowe.biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    List<Ksiazka> listaKsiazek = new ArrayList<Ksiazka>();

    public boolean czyKsiazkaDostepna(String tytul){
        for(int i=0; i<listaKsiazek.size(); i++){
            if(listaKsiazek.get(i).getTytul().equals(tytul)){
                if(listaKsiazek.get(i).isWypozyczona()==false){
                } else {
                    System.out.println("Książka: " + listaKsiazek.get(i) + " = jest wypożyczona");
                    return false;
                }
            }
        }
        return true;
    }
    public Ksiazka wypozyczKsiazke(String tytul){
        if(czyKsiazkaDostepna(tytul)){
            for (int i=0; i<listaKsiazek.size(); i++){
                if(listaKsiazek.get(i).getTytul().equals(tytul)){
                    listaKsiazek.get(i).setWypozyczona(true);
                    System.out.println("Wypożyczyłeś książkę: " + listaKsiazek.get(i));
                }
            }
        }
        return null;
    }
    public void drukujWypozyczoneKsiazki(){
        System.out.println("Wypożyczone ksiązki:");
        for(int i=0; i<listaKsiazek.size(); i++){
            if(listaKsiazek.get(i).isWypozyczona()==true){
                System.out.println(listaKsiazek.get(i));
            }
        }
        System.out.println("\n");
    }
    public void drukujDostepneKsiazki(){
        System.out.println("Dostępne książki:");
        for(int i=0; i<listaKsiazek.size(); i++){
            if(listaKsiazek.get(i).isWypozyczona()==false){
                System.out.println(listaKsiazek.get(i));
            }
        }
    }
}
