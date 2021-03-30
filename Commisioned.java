package hrLAB5_1_B;

import java.time.LocalDate;
import java.util.List;

public class Commisioned extends Employee{

	private List<Order> orders;
	private double baseSalary;
	private double commision;
	Commisioned(String empid,double baseSalary,LocalDate start, LocalDate end, List<Order> orders) {
		super(empid,start,end);
		this.baseSalary= baseSalary;
		this.commision=0;
		this.orders=orders;
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		
		if(orders !=null) {
			for(Order ord : orders) {
				
				LocalDate odate = ord.getOrderDate();
				if(dr.isInRange(odate))
				{
				commision+= ord.getOrderAmount()*0.07;
				}
			}
		}
		
		
		return baseSalary+commision;
	}
}
