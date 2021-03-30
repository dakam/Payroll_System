package hrLAB5_1_B;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateRange {
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	DateRange(LocalDate start, LocalDate end) {
		this.startDate=start;
		this.endDate=end;
	}
	
	@Override
 public String toString() {
		int syear = startDate.getYear();
		int smonth= startDate.getMonthValue();
		int sday = startDate.getDayOfMonth();
		
		int Eyear = endDate.getYear();
		int Emonth= endDate.getMonthValue();
		int Eday = endDate.getDayOfMonth();
		
		String sdate = smonth+"/"+sday+"/"+syear;
		String edate = Emonth+"/"+Eday+"/"+Eyear;
		
		String res= sdate+"-"+edate;
		
		return res;
		
	}
  public boolean isInRange(LocalDate dt) {
	  
	  if((dt.isEqual(startDate) || dt.isAfter(startDate)) && (dt.isBefore(endDate) || dt.equals(endDate))) {
		  
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	  
	 
  }
  
  public static int getFirstDayOfMonth(LocalDate mdate) {
	  
	
	  return 1;
  }
  
  public static int getLastDayOfMonth(LocalDate mdate) {
	  
	  LocalDate lastDayofMonthGivenDate = mdate.with(TemporalAdjusters.lastDayOfMonth());
	  
	  int latdaymonth = lastDayofMonthGivenDate.getDayOfMonth();
	  
	  return latdaymonth;
	  
  }
}
