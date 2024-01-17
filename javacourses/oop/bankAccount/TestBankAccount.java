import java.util.ArrayList;
import java.util.Scanner;

public class TestBankAccount {

    public static void main(String[] args) throws InterruptedException{

        String[] accountType = {"checking", "saving"};
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        int numAccount = 3;
        Scanner reader = new Scanner(System.in);

        System.out.println("************** Welcome to the Bank ******************");

        for(int i=0;i<numAccount;i++){
            BankAccount acc = new BankAccount();
            System.out.println("... Opening account "+ (i+1)+": Account Num="+acc.getAccountNumber());
            accounts.add(acc);
        }
        System.out.println("Congratulations, you have opened "+BankAccount.getAccounts()+" accounts");
        Thread.sleep(3000);
        System.out.print(">> What do you want to do next? type 'D' for deposit, 'W' for withdrawal or 'Q' to quit:  ");
        String command  = reader.next();
        while(!command.equalsIgnoreCase("q")){

            System.out.print("Enter Account Id (1 to "+numAccount+"): ");
            int accountId = reader.nextInt();

            System.out.print("Enter Account type (0 for checking, 1 for saving): ");
            int typeId = reader.nextInt();

            String type  = accountType[typeId];

            if(command.equalsIgnoreCase("d")){
                System.out.print("How much do you want to deposit?: ");
                double amount = reader.nextDouble();
                accounts.get(accountId-1).deposit(type, amount);

            } else if (command.equalsIgnoreCase("w")) {
                System.out.print("How much do you want to withdraw?: ");
                double amount = reader.nextDouble();
                try{
                    accounts.get(accountId-1).withdraw(type, amount);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }else{
                System.out.println("Unknown command");
                break;
            }

            System.out.println("---- Bank Account Summary ------");
            for (BankAccount account : accounts) {
                System.out.println("Account num=" + account.getAccountNumber());
                System.out.println(account.getBalance());
                System.out.println("......................");
            }
            System.out.println("Total Money: "+BankAccount.getTotalMoney());

            System.out.print(">> What do you want to do next? type 'D' for deposit, 'W' for withdrawal or 'Q' to quit:  ");
            command  = reader.next();
        }

    }
}
