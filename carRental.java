import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
	{

	Scanner s = new Scanner(System.in);
	System.out.println("What is the make of your car");
	String make = s.nextLine();

	Scanner u = new Scanner(System.in);
	System.out.println("What is the model of your car");
	String model = u.nextLine();

	Scanner a = new Scanner(System.in);
	System.out.println("Enter your license plate");
	String plate = a.nextLine();

	int letter1 = plate.charAt(0);
	int letter2 = plate.charAt(1);
	int letter3 = plate.charAt(2);
	int letterSum = letter1 + letter2 + letter3;

	int number1 = (plate.charAt(4) - 48) * 100;
	int number2 = (plate.charAt(5) - 48) * 10;
	int number3 = (plate.charAt(6) - 48);
	int numberSum = number1 + number2 + number3;

	int sum = letterSum + numberSum;
	int remainder = sum % 26;

	char letter = (char) (65 + remainder);

x
	System.out.println("Make = " + make);
	System.out.println("Model = " + model);
	System.out.println("License plate " + plate + " = " + carID);



    }
}
