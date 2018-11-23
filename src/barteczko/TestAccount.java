package barteczko;

import java.util.Scanner;

public class TestAccount {

    public static void main(String[] args) {
        Account konto = new Account(2000,2400,1800,10);
        System.out.println(konto);
        double cel = 10000;
        int m = konto.getMonthToBalance(cel);
        System.out.println("\nIle czasu potrzeba, aby uzbierać " + cel + "zł");
        System.out.println("Miesiące: " + m);
        System.out.printf("Stan konta: %.2f \n",konto.getBalance());
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę miesięcy, aby zobaczyć stan konta po tym czasie");
        int n = klawiatura.nextInt();
        System.out.println("Stan konta po " + n + " miesiącach");
        System.out.println(konto.getBalanceAfter(n));

    }

}
