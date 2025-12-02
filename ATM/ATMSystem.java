package ATM;
import java.util.*;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATm myATM = new ATm(1111, 50000.34);

        System.out.print("Enter your CODE : ");

        int inputcode = sc.nextInt();

        if(!myATM.ValidatePIN(inputcode)){
            System.out.println("Incorrect PIN");
            return;
        }


        while (true) {
            System.out.println("Select the operation to be performed");
            System.out.println("1.Display Balance");
            System.out.println("2.Deposit Amount");
            System.out.println("3.Withdraw Amount");
            System.out.println("4.Exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1 -> {
                    System.out.println(myATM.getBalance());
                }

                case 2 -> {
                    System.out.println("Enter the amount to be deposited : ");
                    double amount = sc.nextDouble();
                    myATM.deposit(amount);
                }

                case 3 -> {
                    System.out.println("Enter the amount to withdraw");
                    double amount = sc.nextDouble();
                    myATM.withdraw(amount);
                }

                case 4 ->{
                    System.out.println("Thank you for using the ATM Machine");
                    return;
                }
            }
        }
    }
}