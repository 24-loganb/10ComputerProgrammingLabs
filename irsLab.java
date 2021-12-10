import java.util.Scanner;

public class Main
    {

    public static void main(String[] args)
        {

        Scanner s = new Scanner(System.in);
        System.out.println("What is your gross income?");
        int grossIncome = s.nextInt();

        Scanner a = new Scanner(System.in);
        System.out.println("Are you married?");
        String maritalStatus = a.nextLine();

            while (!((maritalStatus.equals("no")) || (maritalStatus.equals("No")) || (maritalStatus.equals("NO")) || (maritalStatus.equals("nO")) || (maritalStatus.equals("yes")) || (maritalStatus.equals("Yes")) || (maritalStatus.equals("YEs")) || (maritalStatus.equals("YES")) || (maritalStatus.equals("YeS")) || (maritalStatus.equals("yES")) || (maritalStatus.equals("yEs")) || (maritalStatus.equals("yeS"))))
            {
                Scanner b = new Scanner(System.in);
                System.out.println("Are you married?");
                maritalStatus = b.nextLine();
            }

            if ((maritalStatus.equals("no")) || (maritalStatus.equals("No")) || (maritalStatus.equals("NO")) || (maritalStatus.equals("nO")))
            {

                if (grossIncome <= 9325)
                {
                    double tax = 0.1 * grossIncome;
                    double finalIncome = grossIncome - tax;
                    System.out.printf("Your tax this year is: $%.2f", tax);
                    System.out.println();
                    System.out.printf("this year, the amount of money you will take home is: $%.2f", finalIncome);
                }

                    else if ((grossIncome >= 9326) && (grossIncome <= 37950))
                    {
                        double tax = 932.5 + (0.15 * (grossIncome - 9325));
                        double finalIncome = grossIncome - tax;
                        System.out.printf("Your tax this year is: $%.2f", tax);
                        System.out.println();
                        System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                    }

                        else if ((grossIncome >= 37951) && (grossIncome <= 91900))
                        {
                            double tax = 5226.25 + (0.25 * (grossIncome - 37950));
                            double finalIncome = grossIncome - tax;
                            System.out.printf("Your tax this year is: $%.2f", tax);
                            System.out.println();
                            System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                        }

                            else if ((grossIncome >= 91901) && (grossIncome <= 191650))
                            {
                                double tax = 18713.75 + (0.28 * (grossIncome - 91900));
                                double finalIncome = grossIncome - tax;
                                System.out.printf("Your tax this year is: $%.2f", tax);
                                System.out.println();
                                System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                            }

                                else if ((grossIncome >= 191651) && (grossIncome <= 416700))
                                {
                                    double tax = 46643.75 + (0.33 * (grossIncome - 191650));
                                    double finalIncome = grossIncome - tax;
                                    System.out.printf("Your tax this year is: $%.2f", tax);
                                    System.out.println();
                                    System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                                }

                                    else if ((grossIncome >= 416701) && (grossIncome <= 418400))
                                    {
                                        double tax = 120910.25 + (0.35 * (grossIncome - 416700));
                                        double finalIncome = grossIncome - tax;
                                        System.out.printf("Your tax this year is: $%.2f", tax);
                                        System.out.println();
                                        System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                                    }

                                        else
                                        {
                                            double tax = 121505.25 + (0.396 * (grossIncome - 418400));
                                            double finalIncome = grossIncome - tax;
                                            System.out.printf("Your tax this year is: $%.2f", tax);
                                            System.out.println();
                                            System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                                        }

            }

            else if ((maritalStatus.equals("yes")) || (maritalStatus.equals("Yes")) || (maritalStatus.equals("YEs")) || (maritalStatus.equals("YES")) || (maritalStatus.equals("YeS")) || (maritalStatus.equals("yES")) || (maritalStatus.equals("yEs")) || (maritalStatus.equals("yeS")))
            {

                if (grossIncome <= 18650)
                {
                    double tax = 0.1 * grossIncome;
                    double finalIncome = grossIncome - tax;
                    System.out.printf("Your tax this year is: $%.2f", tax);
                    System.out.println();
                    System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                }

                    else if ((grossIncome >= 18651) && (grossIncome <= 75900))
                    {
                        double tax = 1865 + (0.15 * (grossIncome - 18650));
                        double finalIncome = grossIncome - tax;
                        System.out.printf("Your tax this year is: $%.2f", tax);
                        System.out.println();
                        System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                    }

                        else if ((grossIncome >= 75901) && (grossIncome <= 153100))
                        {
                            double tax = 10452.5 + (0.25 * (grossIncome - 75900));
                            double finalIncome = grossIncome - tax;
                            System.out.printf("Your tax this year is: $%.2f", tax);
                            System.out.println();
                            System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                        }

                            else if ((grossIncome >= 153101) && (grossIncome <= 233350))
                            {
                                double tax = 29752.5 + (0.28 * (grossIncome - 153100));
                                double finalIncome = grossIncome - tax;
                                System.out.printf("Your tax this year is: $%.2f", tax);
                                System.out.println();
                                System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                            }

                                else if ((grossIncome >= 233351) && (grossIncome <= 416700))
                                {
                                    double tax = 52222.5 + (0.33 * (grossIncome - 233350));
                                    double finalIncome = grossIncome - tax;
                                    System.out.printf("Your tax this year is: $%.2f", tax);
                                    System.out.println();
                                    System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                                }

                                    else if ((grossIncome >= 416701) && (grossIncome <= 470700))
                                    {
                                        double tax = 112728 + (0.35 * (grossIncome - 416700));
                                        double finalIncome = grossIncome - tax;
                                        System.out.printf("Your tax this year is: $%.2f", tax);
                                        System.out.println();
                                        System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                                    }

                                        else
                                        {
                                            double tax = 131628 + (0.396 * (grossIncome - 470700));
                                            double finalIncome = grossIncome - tax;
                                            System.out.printf("Your tax this year is: $%.2f", tax);
                                            System.out.println();
                                            System.out.printf("This year, the amount of money you will take home is: $%.2f", finalIncome);
                                        }
            }

            else
            {
                System.out.println();
            }
        }
    }

