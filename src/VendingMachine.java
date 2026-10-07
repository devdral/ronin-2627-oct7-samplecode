import java.util.Scanner;

public class VendingMachine {
    private User _user;
    private Scanner _input;

    public VendingMachine() {
        _user = new User(15d);
        _input = new Scanner(System.in);
    }

    private void printPrices() {
        System.out.println("Type an item name to purchase it!");
        System.out.println("Kind Bar: $1.99");
        System.out.println("Cliff Bar: $1.99");
        System.out.println("Water Bottle: $0.99");
        System.out.println("Diet Coke: $0.99");
    }

    public void run() {
        while (true) {
            _user.printStatus();;
            printPrices();
            String input = _input.nextLine();
            String output;
            if (input.equals("Kind Bar")) {
                output = _user.addKindBar();
            } else if (input.equals("Cliff Bar")) {
                output = _user.addCliffBar();
            } else if (input.equals("Water Bottle")) {
                output = _user.addWater();
            } else if (input.equals("Diet Coke")) {
                output = _user.addDietCoke();
            } else {
                output = "Unknown item.";
            }
            System.out.println(output);
        }
    }
}
