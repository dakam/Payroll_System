package hrLAB5_1_B;

public class PayCheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	
    
	
	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}

	public void print() {
	
	System.out.println("Paycheck Date Range: "+payPeriod);
	System.out.println("Gross Pay: "+grossPay);	
	System.out.println("fica Tax Amount: "+fica);
	System.out.println("state Tax Amount: "+state);
	System.out.println("local Tax Amount: "+local);
	System.out.println("Medicare Tax Amount: "+medicare);
	System.out.println("SocialSecurity Amount: "+socialSecurity);
	
	System.out.println("Net Pay: "+this.getNetPay());
	}
	
	public double getNetPay() {
		return grossPay-(fica+state+medicare+socialSecurity+local);
	}
}
