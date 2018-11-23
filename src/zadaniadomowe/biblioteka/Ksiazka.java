package zadaniadomowe.biblioteka;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;
    private boolean wypozyczona;

    public Ksiazka(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        wypozyczona = false;
    }

    @Override
    public String toString() {
        return "\"" + tytul + "\", " + autor + ", " + rokWydania;
    }

    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Historia pszczół", "Maja Lunde", 2015);
        Ksiazka ksiazka2 = new Ksiazka("Czysty kod", "Robert C. Martin", 2014);
        Ksiazka ksiazka3 = new Ksiazka("The rules of work", "Richard Templar", 2015);
        System.out.println(ksiazka1);
        System.out.println(ksiazka2);
        System.out.println(ksiazka3 + "\n");
        Biblioteka biblioteka = new Biblioteka();
        biblioteka.listaKsiazek.add(ksiazka1);
        biblioteka.listaKsiazek.add(ksiazka2);
        biblioteka.listaKsiazek.add(ksiazka3);
        biblioteka.czyKsiazkaDostepna("Historia pszczół");
        biblioteka.wypozyczKsiazke("Historia pszczół");
        System.out.println("\n");
        biblioteka.drukujWypozyczoneKsiazki();
        biblioteka.drukujDostepneKsiazki();

    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public boolean isWypozyczona() {
        return wypozyczona;
    }

    public void setWypozyczona(boolean wypozyczona) {
        this.wypozyczona = wypozyczona;
    }
}
