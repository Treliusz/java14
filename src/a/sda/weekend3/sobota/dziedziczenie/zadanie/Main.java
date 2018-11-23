package a.sda.weekend3.sobota.dziedziczenie.zadanie;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 45, 6800, "Wyższe");
        System.out.println(pracownik.getWyksztalcenie());
        System.out.println(pracownik.getNazwisko());

        Student student = new Student("Anna", "Zaradna", 21, 588587, "Informatyka");
        System.out.println(student.getImie() + "\n" +  student.getKierunekStudiow());

        System.out.println(student.toString());
        System.out.println(pracownik.toString());
}
    }
