import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int payCheck, numFriends;
        double remainder, perTicketCost, totTixCost;

        System.out.println("You've just received your first paycheck, and will use it to treat some friends to a movie.");
        System.out.println("Enter the amount of your paycheck to the nearest integer:");
        payCheck = s.nextInt();
        System.out.println();

        System.out.println("Enter the cost of a movie ticket:");
        perTicketCost = s.nextDouble();

        System.out.println("Enter the number of friends you plan to bring:");
        numFriends = s.nextInt();

        int totalGroup = numFriends +1;

        remainder = payCheck-(perTicketCost*totalGroup);

        System.out.printf("You have $%.2f left over for snacks.", remainder);

        double snackCostPerPerson = 8.00;
        double totalSnackCost = snackCostPerPerson * totalGroup;
        double difference = totalSnackCost-remainder;
        double individualPay = difference / totalGroup;

        System.out.println();
        System.out.printf("Each person will have to pay $%.2f for snacks.", individualPay);
    }
}
