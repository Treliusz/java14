package a.sda.weekend3.sobota.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        Kolo kolo = new Kolo();
        kwadrat.obliczPole(5);
        System.out.println("Pole kwadratu: " + kwadrat.pole);
        kwadrat.obliczObwod(5);
        System.out.println("Obwód kwadratu: " + kwadrat.obwod);

        kolo.obliczObwod(5);
        System.out.printf("\nObwód koła: %.4f", kolo.obwod);
        kolo.obliczPole(5);
        System.out.printf("\nPole koła: %.4f\n", kolo.pole);
    }
}
