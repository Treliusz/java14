package barteczko.wyjatki;

public class ReportExp {
    public ReportExp(){
        wykonaj();
    }

    public void wykonaj() {
        try {
            int num = Integer.parseInt("lalala");
        } catch (NumberFormatException exp){
            System.out.println("\nCo podaje getMessage");
            System.out.println(exp.getMessage());
            System.out.println("\nCo podaje toString:");
            System.out.println(exp.toString());
            System.out.println("\nWydruk śladu stosu, kolejność wywołań metod");
            exp.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new ReportExp();
    }
}
