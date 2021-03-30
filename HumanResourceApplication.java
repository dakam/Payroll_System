package hrLAB5_1_B;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class HumanResourceApplication {

	public static void main(String[] args) {
		
			
		LocalDate odate1= LocalDate.of(2021, 10, 6);
		LocalDate odate2= LocalDate.of(2021, 02, 7);
		LocalDate odate3= LocalDate.of(2021, 03, 7);
		
	 
		Period age = Period.between(odate1, odate3);  
		LocalDate ldt =odate1.plusMonths(3);
		System.out.println(ldt);
					
		Order myorder = new Order("O15526", odate1, 600000);
		Order myorder2 = new Order("O9299", odate2, 200000);
		Order myorder3 = new Order("O82773", odate3, 15000);
		List<Order> lorders= new ArrayList<Order>();
		
		lorders.add(myorder);
		lorders.add(myorder2);
		lorders.add(myorder3);
		
		LocalDate start= LocalDate.of(2021, 8, 6);
			
		LocalDate end= LocalDate.of(2021, 11, 7);
		
		Employee damian = new Hourly("EMP22",15,40,start,end);
		Employee james = new Commisioned("EMP5",20, start,end,lorders);
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(james);
		emps.add(damian);

        for(Employee emp : emps) {
        	emp.print();
        }
		

	}

}

