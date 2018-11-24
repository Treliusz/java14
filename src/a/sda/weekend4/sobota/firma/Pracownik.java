package a.sda.weekend4.sobota.firma;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double pensja;
    private String email;
    private int id;


    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Pracownik(String imie, String nazwisko, double pensja) {
        this(imie, nazwisko);
        this.pensja = pensja;
    }

    public Pracownik(String imie, String nazwisko, double pensja, String email, int id) {
        this(imie, nazwisko, pensja);
        this.email = email;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return  "imie: " + imie +
                "\nnazwisko: " + nazwisko +
                "\npensja: " + pensja +
                "\nemail: " + email +
                "\nid: " + id ;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
