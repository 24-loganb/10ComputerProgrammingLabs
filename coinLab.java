import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter amount of money");

        double money = s.nextDouble();
        int dollars = (int)money/1;
        double cents = money%1;

        int hundred_dollar_bills = dollars/100;
        int remainder1 = dollars%100;
        int fifty_dollar_bills = remainder1/50;
        int remainder2 = remainder1%50;
        int twenty_dollar_bills = remainder2/20;
        int remainder3 = remainder2%20;
        int ten_dollar_bills = remainder3/10;
        int remainder4 = remainder3%10;
        int five_dollar_bills = remainder4/5;
        int remainder5 = remainder4%5;
        int one_dollar_bills = remainder5;
        int change = (int) (cents * 100);
        int quarters = change/25;
        int remainder6 = change%25;
        int dimes = remainder6/10;
        int remainder7 = remainder6%10;
        int nickels = remainder7/5;
        int remainder8 = remainder7%5;
        int pennies = remainder8;

        System.out.println("In $" + money + " there are");
        System.out.println(hundred_dollar_bills + " hundred dollar bills");
        System.out.println(fifty_dollar_bills + " fifty dollar bills");
        System.out.println(twenty_dollar_bills + " twenty dollar bills");
        System.out.println(ten_dollar_bills + " ten dollar bills");
        System.out.println(five_dollar_bills + " five dollar bills");
        System.out.println(one_dollar_bills + " one dollar bills");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");



    }
}
