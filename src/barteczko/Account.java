package barteczko;

public class Account {

    private double balance;
    double monthIncome;
    double montExpend;
    double interest;

    public Account(double balance, double monthIncome, double montExpend, double interest){
        this.balance = balance;
        this.monthIncome = monthIncome;
        this.montExpend = montExpend;
        this.interest = interest;
    }
    public double getBalance(){
        return balance;
    }
    public double getBalanceAfter(int n){
        for(int i=1; i<=n; i++){
            balance *= (1 +(interest/100/12));
            balance += monthIncome - montExpend;
        }
        return balance;
    }

    public int getMonthToBalance(double targetBalance){
        int n = 0;
        double diff = targetBalance - balance;
        while (diff > 0){
            n++;
            balance *= (1 + (interest/100)/12);
            balance += monthIncome - montExpend;
            double prevDiff = diff;
            diff = targetBalance - balance;
            if (prevDiff <= diff) return -1;
        }
        return n;
    }

    @Override
    public String toString() {
        return  "\nbalance = " + balance +
                "\nmonthIncome = " + monthIncome +
                "\nmontExpend = " + montExpend +
                "\ninterest = " + interest;
    }
}
