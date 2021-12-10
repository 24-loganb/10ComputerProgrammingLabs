import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year--> ");
        int year = s.nextInt();
        int AnswerA = year % 19;
        int AnswerB = year / 100;
        int AnswerC = year % 100;
        int AnswerD = AnswerB / 4;
        int AnswerE = AnswerB % 4;
        int AnswerF = (AnswerB + 8) / 25;
        int AnswerG = (AnswerB - AnswerF + 1) / 3;
        int AnswerH = (19 * AnswerA + AnswerB - AnswerD - AnswerG + 15) % 30;
        int AnswerI = AnswerC / 4;
        int AnswerK = AnswerC % 4;
        int AnswerR = (32 + 2 * AnswerE + 2 * AnswerI - AnswerH - AnswerK) % 7;
        int AnswerM = (AnswerA + 11* AnswerH + 22 * AnswerR) / 451;
        int AnswerN =  (AnswerH + AnswerR - 7 * AnswerM + 114) / 31;
        int AnswerP =  (AnswerH + AnswerR - 7 * AnswerM + 114) % 31;
        int month = AnswerN;
        int day = ++AnswerP;
        System.out.println("Easter of the year " + year + " falls on " + month + "/" + day + "/" + year);




    }
}
