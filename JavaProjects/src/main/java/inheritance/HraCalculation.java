package inheritance;

public class HraCalculation extends BasicPay{
	
	//Calculate HRA (5% of basic pay)
	double hra;
	double pf;
	
	public void totalHra() {
	hra = 0.05*basicPay;
	}
	
	//Calculate PF (20% of basic pay)
	public void totalPf() {
		
		pf = 0.20*basicPay;
		
	}

}
