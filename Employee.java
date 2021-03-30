package hrLAB5_1_B;

import java.time.LocalDate;

public abstract class Employee {
	private String empId;
	private LocalDate start;
	private LocalDate end;

	Employee(String empid, LocalDate start, LocalDate end) {
		this.empId=empid;
		this.start=start;
		this.end=end;
	}
	public abstract double calcGrossPay(DateRange dr);
	
	public PayCheck calcCompensation(int month, int year) {
		LocalDate start = LocalDate.of(year, month, 1);
		int lday = DateRange.getLastDayOfMonth(start)-1;
		LocalDate end = LocalDate.of(year, month, lday+1);
		
		DateRange myrange = new DateRange(start, end);
		double grossPay= calcGrossPay(myrange);
		double fica =0.23*grossPay;
		double state = 0.05*grossPay;
		double local=0.01*grossPay;
		double medicare=0.03*grossPay;
	    double socialSecurity=0.075*grossPay;
	    PayCheck pc = new PayCheck(grossPay,fica,state,local,medicare,socialSecurity,myrange);

	    return pc;
	}
	
	public void print() {
		
		LocalDate ndate = start;
		System.out.println("**PayCheck for "+this.empId+" ***");
		
		while(ndate.isBefore(end)|| ndate.isEqual(end)) {
		   
			int month = ndate.getMonthValue();
			int year = ndate.getYear();
			
			System.out.println("***Start of PayCheck for Month "+month+" and year "+year);
			calcCompensation(month, year).print();
			
			System.out.println("***End of PayCheck for Month "+month+" and year "+year);
			
			ndate = ndate.plusMonths(1);
			
			if(ndate.isBefore(end)|| ndate.isEqual(end)) {
				// our loop is okay to continue since were have not exhausted all months
			} else {
				break;
			}
			
		}
		
		
	
	}

}
