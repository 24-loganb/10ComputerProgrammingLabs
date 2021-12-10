import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("What is the name of your item");
        String itemName = s.nextLine();

        Scanner a = new Scanner(System.in);
        System.out.println("What is the price of your item");
        double price = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.println("Do you want overnight shipping?");
        String overnightShipping = b.nextLine();

        int letter1 = overnightShipping.charAt(0);
        int letter2 = overnightShipping.charAt(1);
        int letterSum = letter1 + letter2;

        if ((letterSum==222)||(letterSum==190)||(letterSum==158))

        {
            if (price >= 10)
            {
                double totalCost = price + 8.00;
                System.out.println("Thanks for buying the item: " + itemName);
                System.out.printf("The base price is $%.2f", price);
                System.out.println();
                System.out.printf("With shipping cost the total price is $%.2f", totalCost);
            }
            else
            {
                double totalCost = price + 7.00;
                System.out.println("Thanks for buying the item: " + itemName);
                System.out.printf("The base price is $%.2f", price);
                System.out.println();
                System.out.printf("With shipping cost the total price is $%.2f", totalCost);
            }
        }
        else
        {
            if (price >= 10)
            {
                double totalCost = price + 3.00;
                System.out.println("Thanks for buying the item: " + itemName);
                System.out.printf("The base price is $%.2f", price);
                System.out.println();
                System.out.printf("With shipping cost the total price is $%.2f", totalCost);
            }
            else
            {
                double totalCost = price + 2.00;
                System.out.println("Thanks for buying the item: " + itemName);
                System.out.printf("The base price is $%.2f", price);
                System.out.println();
                System.out.printf("With shipping cost the total price is $%.2f", totalCost);
            }
        }
    }
}
