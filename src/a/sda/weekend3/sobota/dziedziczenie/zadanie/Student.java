package a.sda.weekend3.sobota.dziedziczenie.zadanie;

public class Student extends Person {

    int nrIndeksu;
    String kierunekStudiow;

    public Student(String imie, String nazwisko, int wiek, int nrIndeksu, String kierunekStudiow){
        super(imie, nazwisko, wiek);
        this.nrIndeksu = nrIndeksu;
        this.kierunekStudiow = kierunekStudiow;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", kierunekStudiow='" + kierunekStudiow + '\'' +
                '}';
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public String getKierunekStudiow() {
        return kierunekStudiow;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public void setKierunekStudiow(String kierunekStudiow) {
        this.kierunekStudiow = kierunekStudiow;
    }
}
