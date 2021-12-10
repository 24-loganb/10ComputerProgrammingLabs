import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname = s.next();

        Scanner a = new Scanner(System.in);
        System.out.println("Enter last name");
        String lastname = a.next();

        Scanner b = new Scanner(System.in);
        System.out.println("Enter age");
        int age = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("Enter grade level");
        int gradelevel = c.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.println("Enter GPA");
        double gpa = d.nextDouble();

        int last_name_length = lastname.length();
        char first_name_letter = firstname.charAt(1);
        int first_name_lastindex = firstname.length() - 1;
        char first_name_lastletter = firstname.charAt(first_name_lastindex);

        System.out.println("Your first name is " + firstname);
        System.out.println("Your last name is " + lastname);
        System.out.println("Your age is " + age);
        System.out.println("Your grade level is " + gradelevel);
        System.out.println("Your GPA is " + gpa);
        System.out.println("The length of your last name is " + last_name_length + " characters");
        System.out.println("The second letter of your first name is " + first_name_letter);
        System.out.println("The last letter of your first name is " + first_name_lastletter);

    }
}
