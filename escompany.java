import java.util.Scanner;

public class escompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keyboardStock = 20;
        int mouseStock = 20;
        int monitorStock = 20;
        double keyboardPrice = 49.99;
        double mousePrice = 19.99;
        double monitorPrice = 99.99;

        System.out.println("Welcome to elf's store! Please choose a product:");
        System.out.println("a. Keyboard - $49.99");
        System.out.println("b. Mouse - $19.99");
        System.out.println("c. Monitor - $99.99");
        String productChoice = scanner.nextLine();

        double itemPrice = 0;
        int itemStock = 0;
        String itemName = "";
        switch (productChoice) {
            case "a":
                itemPrice = keyboardPrice;
                itemStock = keyboardStock;
                itemName = "Keyboard";
                break;
            case "b":
                itemPrice = mousePrice;
                itemStock = mouseStock;
                itemName = "Mouse";
                break;
            case "c":
                itemPrice = monitorPrice;
                itemStock = monitorStock;
                itemName = "Monitor";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("How many " + itemName + "s do you want to buy?");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        if (quantity > itemStock) {
            System.out.println("Out of stock!");
            return;
        }

        double totalPrice = quantity * itemPrice;
        System.out.println("Invoice:");
        System.out.println(itemName + " - $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: $" + totalPrice);

        System.out.println("Please enter your payment:");
        double payment = scanner.nextDouble();
        scanner.nextLine();
        if (payment < totalPrice) {
            System.out.println("Not enough money!");
            return;
        }

        double change = payment - totalPrice;
        System.out.println("Thank you for shopping with us!");
        System.out.println("Your change is $" + change);
    }
}