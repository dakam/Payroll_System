package hrLAB5_1_B;

import java.time.LocalDate;

public class Hourly extends Employee{
    
	private double hourlyWage;
	private double hoursPerWeek;
	
	Hourly(String empid,double hourlyWage,double hoursPerWeek,LocalDate start, LocalDate end) {
		super(empid,start,end);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
		
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		
		return hourlyWage*hoursPerWeek*4;
	}

}
