package a.sda.weekend3.sobota.test;

public class Test {
    static int zwieksz(int liczba){
        liczba++;
        return liczba;
    }
}

class Main{
    public static void main(String[] args) {
        int a = 5;
        a = Test.zwieksz(a);
        System.out.println(a);
    }
}
