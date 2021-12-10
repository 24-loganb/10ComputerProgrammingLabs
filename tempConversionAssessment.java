import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius");
        Double celsius = s.nextDouble();
        Double fahreinheit = (1.8 * celsius) + 32;
        System.out.println(celsius + " degrees celsius is " + fahreinheit + " degrees fahreinheit");

    }
}
