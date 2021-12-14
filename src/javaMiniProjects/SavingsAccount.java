package javaMiniProjects;

public class SavingsAccount {

    int balance;

        public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    //Check balance:
        public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
        }
    //Deposit:
        public void deposit(int amountToDeposit){
            balance = balance + amountToDeposit;
        System.out.println("You just deposited "+ balance);
        }
    //Withdrawing:
        public void withdraw(int amountToWithdraw){
            balance = balance - amountToWithdraw;
        System.out.println("You just withdrew" + balance);
        }
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);
        savings.checkBalance();
        savings.deposit(savings.balance);
        savings.withdraw(savings.balance);
    }
}
