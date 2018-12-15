package a.sda.weekend7.struktury;


import java.util.Arrays;

// Własna implementacja listy z wykorzystaniem tablicy ("ArrayList")
// Zakładamy, że jest to lista na elementy String

public class ArrayList implements MyList{

    // tablica z elementami - w tej implewentacji chcemy opakować tablice tak,
    // wygladała jak lista
    private String[] elements;
    private static int DEFAULT_CAPACITY = 10;
    private int index = 0;

    //konstruktor bezparametrowy utworzy listę z początkową wielkością 10
    public ArrayList() {
        this.elements = new String[DEFAULT_CAPACITY];
    }
    // drugi konstruktor z opcją ustawienia startowej wielkości listy
    // efektywne rozwiązanie gdy znamy z góry liczbę elementów
    public ArrayList(int initialSize) {
        this.elements = new String[initialSize];
    }

    @Override
    public boolean add(String element) {
        if (index == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[index] = element;
        index++;
        return true;
    }

    @Override
    public boolean remove(String element) {

        return false;
    }

    @Override
    public String remove(int position) {
        String toRemove = elements[position];
        if (position >= index || position < 0) {
            return "Nieprawidłowa pozycja";
        } else {
            for (int i = position; i < index; i++) {
                elements[position] = elements[position + 1];
                position++;
            }
            index--;
            elements[index] = null;
        }
        return toRemove;
    }

    @Override
    public String removeFirst() {
//        String temp = elements[0];
//        for (int i = 0; i < index; i++) {
//            elements[i] = elements[i + 1];
//        }
//        elements[index] = null;
//        index--;
        return remove(0);
    }

    @Override
    public String removeLast() {
//        if (isEmpty()) {
//
//        }else {
//            String temp = elements[index - 1];
//            elements[index - 1] = null;
//            index--;
//            return temp;
//        }
//        return null;
        return remove(index-1);
    }

    @Override
    public boolean isEmpty() {
        // Lista jest pusta, gdy index wskazuje na 0 element
        return index==0;
    }

    @Override
    public int indexOf(String element) {
        //zwróć index elementu jeśli występuje bądź -1 gdy go nie ma
        for (int i = 0; i < index; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(String element) {
        return  (indexOf(element) >= 0);
    }

    @Override
    public void clear() {
        for (int i = 0; i < index; i++) {
            elements[i] =null;
        }
        index = 0;

    }

    public int getIndex() {
        return index;
    }

    public String[] getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
             sb.append((elements[i]) + "\n");
        }
        return sb.toString();
    }
}
