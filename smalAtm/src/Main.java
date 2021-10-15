import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int login_right=3;

        String sys_user_name="admin";
        String sys_password="1234";

        System.out.println("************************************");
        System.out.println("Welcome to the User Login Screen");
        System.out.println("************************************");

        while (true){

            System.out.print("User Name: ");
            String user=scanner.nextLine();
            System.out.print("Password : ");
            String password=scanner.nextLine();

            if (user.equals(sys_user_name) && password.equals(sys_password)){
                System.out.println("Login Successful Welcome "+user);
                atm();
                break;
            }else if (user.equals(sys_user_name) && !password.equals(sys_password)){
                System.out.println("You entered an incorrect password. Try again.");
                login_right-=1;
            }else if (!user.equals(sys_user_name) && password.equals(sys_password)){
                System.out.println("You Entered Wrong User Name. Try Again.");
                login_right-=1;
            }else {
                System.out.println("Incorrect Username And Password.");
                login_right-=1;
            }
            if (login_right==0){
                System.out.println("Your Entry Limit Has Been Expired. We are waiting for you again.");
                break;
            }
        }

    }
    public static void atm(){
        Scanner scanner=new Scanner(System.in);

        int balance=1000;

        String transactions="1. Process: Balance Learning \n" +
                "2.Process : Withdrawing Money \n" +
                "3. Process: Deposit \n" +
                "Press q to exit.";

        System.out.println("********************************");
        System.out.println(transactions);
        System.out.println("********************************");

        while (true){
            System.out.print("Select Transaction :");
            String process=scanner.nextLine();

            if (process.equals("q")){
                System.out.print("Signing Out of the System....");
                break;
            }else if (process.equals("1")){
                System.out.println("Your balance : "+balance);
            }else if (process.equals("2")){
                System.out.print("How Much Do You Want to Shoot? :");
                int amount =scanner.nextInt();
                scanner.nextLine();
                if (balance-amount<0){
                    System.out.println("You Don't Have Enough Balance...");
                    break;
                }else {
                    balance-=amount;
                    System.out.println("Your Current Balance :"+balance);
                }
            }else if (process.equals("3")){
                System.out.print("How much will you deposit : ");
                int amount=scanner.nextInt();
                scanner.nextLine();

                balance+=amount;
                System.out.println("Your Current Balance :"+balance);
            }
        }



    }
}
