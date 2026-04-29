package inheritance;
import java.util.Scanner;

//Get basic pay, deduction and bonus from console

public class BasicPay {
	
	double basicPay;
	double deduction;
	double bonus;

	   public void basicInfo() {

		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Basic Pay: ");
	        basicPay = sc.nextDouble();

	        System.out.print("Enter Deduction: ");
	        deduction = sc.nextDouble();

	        System.out.print("Enter Bonus: ");
	        bonus = sc.nextDouble();
	    }
}
