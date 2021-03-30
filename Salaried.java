package hrLAB5_1_B;

import java.time.LocalDate;

public class Salaried extends Employee{

	private double salary;
	Salaried(String empid,double salary,LocalDate start, LocalDate end) {
		super(empid,start,end);
		this.salary=salary;
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		// TODO Auto-generated method stub
		return salary;
	}

}
