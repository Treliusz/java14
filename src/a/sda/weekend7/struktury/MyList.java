package a.sda.weekend7.struktury;

// Interfejs opisujący operacje dla listy typu String

public interface MyList {
    // Operacja dodawania elementu tyu String do listy
    boolean add(String element);

    // Operacja usuwania elementu po nazwie (np. po nazwisku)
    boolean remove(String element);
    // Operacja usuwania po pozycji ("usuń trzeci element")
    String remove(int index);
    // Odpowiada na pytanie czy lista pusta
    String removeFirst();

    String removeLast();

    boolean isEmpty();
    // Zwraca pozycje szykanego elementu
    // Jeśli elementu nie ma na liście to zwracamy -1
    int indexOf(String element);
    // Odpowiada na pytanie czy element jest na liście
    boolean contains(String element);
    // Usuwa wszystkie elementy z listy
    void clear();
}
