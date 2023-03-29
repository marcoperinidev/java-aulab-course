import java.util.Scanner;

public class ATMMachine {
    static Scanner keyboard = new Scanner(System.in);

    private static final String USERNAME = "admin";
    private static final int PIN = 1234;

    public static void Menu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Please select an option: ");
    }

    private static double balance = 5645.15;

    public static double checkBalance() {
        System.out.println("Your balance is: " + balance + "€");
        return balance;
    }

    public static void depositChecks() {
        System.out.println("Please enter the amount to deposit: ");
        int deposit = keyboard.nextInt();
        System.out.println("Your new balance is: ");
    }

    public static void withdrawMoney() {
        System.out.println("Please enter the amount to withdraw: ");
        int withdraw = keyboard.nextInt();
        System.out.println("Please collect your cash");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please enter your username: ");
        String username = keyboard.nextLine();
        System.out.println("Please enter your PIN: ");
        int pin = keyboard.nextInt();

        if (USERNAME.equals(username) && pin == PIN) {
            System.out.println("Welcome " + username);
            Menu();
            int option = keyboard.nextInt();

            while(option != 4) {
                if(option == 1) {
                    checkBalance();
                    Menu();
                    option = keyboard.nextInt();
                } else if(option == 2) {
                    Menu();
                    depositChecks();
                } else if(option == 3) {
                    Menu();
                    withdrawMoney();
                } else {
                    System.out.println("Invalid option");
                    Menu();
                    option = keyboard.nextInt();
                }
            }
            //poco efficace con lo switch
            /*switch (option) {
                case 1:
                    System.out.println("Please enter the amount to withdraw: ");
                    int withdraw = keyboard.nextInt();
                    System.out.println("Please collect your cash");
                    break;
                case 2:
                    System.out.println("Please enter the amount to deposit: ");
                    int deposit = keyboard.nextInt();
                    System.out.println("Your new balance is: ");
                    break;
                case 3:
                    System.out.println("Your balance is: ");
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Machine");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }*/
        } else {
            System.out.println("Invalid USERNAME or PIN");
        }
    }
}