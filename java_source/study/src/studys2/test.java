package studys2;

public class test {
	private int year, month, day;
	
	public void setYear(int year) {
		if(year < 1) {year=1;}
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(month < 1) {month =1;}
		if(month > 12) {month = 12;}
		this.month = month;
	}
	
	public void setDay(int day) {
		if(day <1) {day = 1;}
		if(day > 31) {day = 31;}
		if(month == 2 && day>28) {day = 28;}
			
		
		this.day = day;
	}
	
	void showInfo() {
		System.out.println(year+"-"+month+"-"+day);
	}
 }
