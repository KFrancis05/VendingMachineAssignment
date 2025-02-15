import java.util.Scanner;

public class VendingMachine {
    
    private String[] snackNames;
    private int[] snackPrices;
    private String[] candyNames;
    private int[] candyPrices;

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
        } else {
            System.out.println("Invalid selection.");
        }
    }


    public static void main (String[] args){

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Here are the instructions to how the vending machine works!");
        System.out.println("\n You can choose any snack you would like!\n Then you will be asked to insert money to pay for your snack. \n Then you will be asked for a confirmation. \n Finally! You can enjoy your snack! ");
        VendingMachine vMachine = new VendingMachine();
        vMachine.displaySnacks();
        vMachine.chooseSnack();

    }
}