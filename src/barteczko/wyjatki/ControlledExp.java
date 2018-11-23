package barteczko.wyjatki;

public class ControlledExp {
    public void printWaitAndPrint() throws InterruptedException{
        System.out.println("Za 2 sekundy kolejny napis");
        Thread.sleep(2000);
        System.out.println("Wlaśnie minęły 2 sekundy");
    }

    public static void main(String[] args) {
        try {
            new ControlledExp().printWaitAndPrint();
        } catch (InterruptedException exp){
            exp.printStackTrace();
        }
    }
}
