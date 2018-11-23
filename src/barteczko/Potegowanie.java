package barteczko;

import java.util.Scanner;

public class Potegowanie {
    double podstawaPotegi;
    int wykladnikPotegi;
    double wynik = 1;
    public Potegowanie(double podstawaPotegi, int wykladnikPotegi){
        this.podstawaPotegi = podstawaPotegi;
        this.wykladnikPotegi = wykladnikPotegi;
    }
    public double potegujLiczbe(){
        if(wykladnikPotegi<0){
            System.out.println("Niewłaściwy wykładnik potęgi");
        }
        else {
            for(int i=0; i<wykladnikPotegi; i++){
                wynik *= podstawaPotegi;
            }
        }
        return wynik;
    }
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj postawę potęgi:");
        double podstawaPotegi = klawiatura.nextDouble();
        System.out.println("Podaj wykładnik potęgi:");
        int wykladnikPotegi = klawiatura.nextInt();
        Potegowanie potegowanie = new Potegowanie(podstawaPotegi, wykladnikPotegi);
        System.out.println(potegowanie.potegujLiczbe());
    }
}
