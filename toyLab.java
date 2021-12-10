import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("What is the cost of the toy?");
        double basePrice = s.nextDouble();
        if (basePrice >= 20)
        {
            double discount = 0.15 * basePrice;
            double discountPrice = 0.85 * basePrice;
            double finalPrice = 1.07 * discountPrice;
            System.out.printf("The original price of the toy is $%.2f", basePrice);
            System.out.println();
            System.out.printf("Your discount on this item is $%.2f", discount);
            System.out.println();
            System.out.println("Your sales tax is 7%");
            System.out.printf("After discount and sales tax, the final cost of the toy is $%.2f", finalPrice);
        }
        else
        {
            double discountPrice = basePrice;
            double finalPrice = 1.07 * basePrice;
            System.out.printf("The original price of the toy is $%.2f", basePrice);
            System.out.println();
            System.out.println("Your discount on this item is $0");
            System.out.println();
            System.out.println("Your sales tax is 7%");
            System.out.printf("After discount and sales tax, the final cost of the toy is $%.2f", finalPrice);
        }
    }
}