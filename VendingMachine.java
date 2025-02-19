import java.lang.foreign.Linker;
import java.util.Scanner;

public class VendingMachine {
    
    private String[] snackNames;
    private int[] snackPrices;
    private int payment;

    public VendingMachine() {
        snackNames = new String[]{"Doritos", "Ruffles", "Cheetos", "Hershey's Chocolate", "KitKat", "Reeses"};
        snackPrices = new int[]{2, 1, 3, 3, 2, 1};
    }
    
    public void displaySnacks() {
        System.out.println("Available Snacks:");
        for (int i = 0; i < snackNames.length; i++) {
            System.out.println((i + 1) + ") "+snackNames[i]+" - $"+snackPrices[i]);
        }
    }

    public void chooseSnack() {
        Scanner s = new Scanner(System.in);
        System.out.print("Choose a snack by entering the number: ");
        int choice = s.nextInt();
        if (choice > 0 && choice <= snackNames.length) {
            System.out.println("You chose "+snackNames[choice - 1]+".");
            System.out.print("Please insert money: ");
            int money = s.nextInt();
            payment = money;
            change(choice, money);
        } else {
            System.out.println("Invalid selection.");
        }
    }

    public void change(int c, int m) {
        if(m > snackPrices[c-1]){
            System.out.println("Change Returned: "+(m-snackPrices[c-1]));
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public void confirmation(){

        Scanner s = new Scanner(System.in);
        System.out.println("Do you wish to confirm your option? Type Y for yes or N for no");
        String option = s.next();
        if (option.equals("Y")) {
            
            System.out.println("Great!");
            System.out.println("Thank you for your purchase!");
        }

        else {

            System.out.println("Alright, here is your refund amount: "+(payment));
            System.out.println("Thank you for using our vending machine!");
        }
    }

    public static void main (String[] args){

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Here are the instructions to how the vending machine works!");
        System.out.println("\n You can choose any snack you would like!\n Then you will be asked to insert money to pay for your snack. \n Then you will be asked for a confirmation. \n Finally! You can enjoy your snack! ");
        VendingMachine vMachine = new VendingMachine();
        vMachine.displaySnacks();
        vMachine.chooseSnack();
        vMachine.confirmation();
        
    }
}