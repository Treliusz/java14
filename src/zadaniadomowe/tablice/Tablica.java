package zadaniadomowe.tablice;

public class Tablica {

    public static void main(String[] args) {
        int[] tablica = {2,5,1,-3,5,22,21,66,21,54};
        drukujOpisTablicy(tablica);

    }

    public static void drukujOpisTablicy(int[] tablica){
        System.out.println();
        int min = tablica[0];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] < min)
                min = tablica[i];
        }
        System.out.println("Min wartość: " + min);

        int max = tablica[0];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > max)
                max = tablica[i];
        }
        System.out.println("Max wartość: " + max);

        double srednia = 0;
        for (int i = 0; i < tablica.length; i++){
            srednia = srednia + tablica[i];
        }
        srednia /= tablica.length;
        System.out.println("Średnia wartość: " + srednia);
        System.out.println("Iość elementów: " + tablica.length);
        System.out.println();

    }
}
