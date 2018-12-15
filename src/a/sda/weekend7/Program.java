package a.sda.weekend7;

import a.sda.weekend7.struktury.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("Pierszy element");
        arrayList.add("Drugi");
        arrayList.add("Trzeci");
        arrayList.add("Czwarty");
        arrayList.add("Piąty");
        arrayList.add("Ala");
        arrayList.add("kot");
        for (int i = 0; i < arrayList.getIndex(); i++) {
            System.out.println(arrayList.getElements()[i]);
        }
        System.out.println("\nWielkość tablicy " + arrayList.getIndex());
        System.out.println("Index of: " + arrayList.indexOf("Ala"));
        System.out.println("Zawiera \"kot\"? " + arrayList.contains("kot"));
        System.out.println("Zawiera \"pies\"? " + arrayList.contains("pies"));
        System.out.println("\nUsuwanie pierwszego elementu:");
        arrayList.removeFirst();
        System.out.println(arrayList);
        System.out.println("\nUsuwanie ostatniego elementu:");
        arrayList.removeLast();
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println("\n" + arrayList);
    }
}
