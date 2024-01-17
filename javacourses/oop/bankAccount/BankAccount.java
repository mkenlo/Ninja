import java.util.Random;

public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int accounts = 0;
    private static double totalMoney = 0;

    private String accountNumber ;

    public BankAccount() {
        accountNumber = generateAccountNumber();
        accounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }

    public boolean deposit(String accountType, double amount) {
        totalMoney += amount;
        if (accountType.equalsIgnoreCase("checking")) {
            this.checkingBalance += amount;
            System.out.println(".... Depositing in checking account");
        } else if (accountType.equalsIgnoreCase("saving")){
            this.savingsBalance += amount;
            System.out.println(".... Depositing in saving account");
        }else{
            System.out.println("no deposit done");
            return false;
        }
        return true;
    }

    public boolean withdraw(String accountType, double amount) throws Exception {
        if (accountType.equalsIgnoreCase("checking") && this.checkingBalance > amount){
            this.checkingBalance -= amount;
            System.out.println(".... Withdrawing in checking account");
        }else if (accountType.equalsIgnoreCase("saving") && this.savingsBalance > amount) {
            this.savingsBalance -= amount;
            System.out.println(".... Withdrawing in checking account");
        }else
            throw new Exception("    !!!!! Insufficient Balance");

        return true;
    }

    public String getBalance() {
        return "Checking Balance: " + this.checkingBalance +"\nSaving Balance: "+ this.savingsBalance ;
    }

    private String generateAccountNumber(){
        StringBuilder res = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<10;i++){
            res.append(random.nextInt(10));
        }
        return res.toString();

    }
}
