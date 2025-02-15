public class VendingMachine {
    
    private String[] snackNames;
    private int[] snackPrices;
    private String[] candyNames;
    private int[] candyPrices;

    public VendingMachine() {
        snackNames = new String[]{"Doritos", "Ruffles", "Cheetos"};
        snackPrices = new int[]{2, 1, 3};
        candyNames = new String[]{"Hershey's Chocolate", "KitKat", "Reeses"};
        candyPrices = new int[]{3, 2, 1};
    }
    
    public static void main (String[] args){

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Here are the instructions to how the vending machine works!");
        System.out.println("\n You can choose any snack you would like!\n Then you pick whichever snack you would like! \n Then you will be asked to insert money to pay for your snack. \n Then you will be asked for a confirmation. \n Finally! You can enjoy your snack! ");

    }
}