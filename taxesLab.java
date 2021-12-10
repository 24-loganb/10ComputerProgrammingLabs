import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String jobTitle;
        System.out.println("Enter Job Title");
        jobTitle = s.nextLine();

        Scanner r = new Scanner(System.in);
        int hoursWorked;
        System.out.println("Enter hours worked (1 week)");
        hoursWorked = r.nextInt();

        Scanner t = new Scanner(System.in);
        double rate;
        System.out.println("Enter hourly rate");
        rate = t.nextDouble();

        double grossPay = hoursWorked * rate;
        double federalTax = 0.15 * grossPay;
        double fica = 0.0765 * grossPay;
        double stateTax = 0.04 * grossPay;
        double totalTax = federalTax + fica + stateTax;
        double netPay = grossPay - totalTax;

        System.out.println();
        System.out.printf("Your net pay is $%.2f for your job: " + jobTitle, netPay);
    }
}
