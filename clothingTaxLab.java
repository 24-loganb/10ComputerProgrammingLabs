import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item");
        String name = s.nextLine();

        Scanner a = new Scanner(System.in);
        System.out.println("Enter the price of clothing");
        double price = a.nextDouble();

        if (price >= 100)
        {
            double totalCost = price * 1.05;
            System.out.println("Thanks for purchasing " + name + ".");
            System.out.printf("The price is $%.2f" + ".", price);
            System.out.println();
            System.out.println("The tax is 5 percent.");
            System.out.printf("Your total cost is $%.2f" + ".", totalCost);
        }
        else
        {
            double totalCost = price;
            System.out.println("Thanks for purchasing " + name + ".");
            System.out.printf("The price is $%.2f" + ".", price);
            System.out.println();
            System.out.println("The tax is 0 percent.");
            System.out.printf("Your total cost is $%.2f" + ".", totalCost);
        }


        }
}
