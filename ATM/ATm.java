package ATM;

public class ATm {
    private double balance;
    private int code;

    public ATm(int code,double balance){
        this.balance = balance;
        this.code = code;
    }

    public boolean ValidatePIN(int code){
        return this.code == code;

    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("Deposit should be positive");
            return;
        }
        balance+=amount;
        System.out.println("Deposit of "+amount +" is successful");
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficcient funds");
            return;
        }
        balance -= amount;
        System.out.println("withdrawal successful");
    }

}
