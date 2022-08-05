import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>(); //costumer number, pin number

    public void getLogin() {
        int x = 1;
        do {
            try {
                data.put(99999, 1876443);
                data.put(983523, 9123401);
                System.out.println("Welcome to Raquel's ATM");
                System.out.println("Please, enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Please, enter tou PIN number: ");
                setPinNumber(menuInput.nextInt());
            } catch(Exception e) {
                System.out.println("\n Invalid characters! Only use numbers! \n");
                x = 2;
            }
            int customerNumber = getCustomerNumber();
            int pinNumber = getPinNumber();
            if(data.containsKey(customerNumber) && data.get(customerNumber) == pinNumber) {
                getAccountType();
            } else {
                System.out.println("\n Wrong customer number or Pin number! :(");
            }
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select the account you want to access:");
        System.out.println("Type 1 to - Checking Account");
        System.out.println("Type 2 to - Saving Account");
        System.out.println("Type 3 to - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using Raquel's ATM. Have a good day! :)");
                break;
            default:
                System.out.println("\n Invalid Choice! :( \n");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("Checking Account:");
        System.out.println("Type 1 to - View Balance");
        System.out.println("Type 2 to - Withdraw Funds");
        System.out.println("Type 3 to - Deposit Funds");
        System.out.println("Type 4 to - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking account balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using Raquel's ATM. Have a good day! :)");
                break;
            default:
                System.out.println("\n Invalid Choice! :( \n");
                getChecking();
        }
    }

    public void getSaving() {
        System.out.println("Saving Account:");
        System.out.println("Type 1 to - View Balance");
        System.out.println("Type 2 to - Withdraw Funds");
        System.out.println("Type 3 to - Deposit Funds");
        System.out.println("Type 4 to - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving account balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using Raquel's ATM. Have a good day! :)");
                break;
            default:
                System.out.println("\n Invalid Choice! :( \n");
                getSaving();
        }
    }

}
