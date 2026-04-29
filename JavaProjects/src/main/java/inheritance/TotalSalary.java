package inheritance;

//Find the total salary(Basicpay+hra-pf-deduction+bonus)

public class TotalSalary extends HraCalculation{
	
	double salary;
	double totalDeductions;
	double fullSalary;
	
	public void totalSal() {
		
		salary = basicPay + hra +bonus;
		totalDeductions = pf+ deduction;
		fullSalary = salary - totalDeductions;
		
		System.out.println("SALARY SLIP");
		System.out.println("===========================================");
		System.out.println("Basic pay: " + basicPay);
		System.out.println("Deduction: " + deduction);
		System.out.println("Bonus: " + bonus);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("Total Deduction: " + totalDeductions);
		System.out.println("Final take home salary: " + fullSalary);
	}
	
	
}
