package chapter5;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public Calendar() {
		this(2021, 8, 25);
		
		System.out.println("생성자 이후");
	}
	
	public Calendar returnThis() {
		return this;
	}
	
	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void  setMonth(int month) {
		if(month < 1) {month = 1;}
		if(month > 12) {month = 12;}
		this.month = month;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setDay(int day) {
		if(day < 1 ) {day = 1;}
		if(day > 31) {day = 31;}
		if(this.month == 2 && day > 28) {day = 28;}
		this.day =day;
	}
	
	public int getDay() {
		return day;
	}
	
	public static void main(String[] args) {
		Calendar dal = new Calendar();
		System.out.println(dal.getYear() + "-" + dal.getMonth() + "-" + dal.getDay());
		System.out.println(dal);
		
		Calendar dal2 = dal.returnThis();
		System.out.println(dal2);
		
		dal.setYear(2021);
		dal.setMonth(8);
		dal.setDay(24);
		
		System.out.println(dal.getYear() + "-" + dal.getMonth() + "-" + dal.getDay());
		System.out.println("dal : " +dal);
		
		/**
		 *  인스턴스를 출력 -> toString 메소드(Object)
		 *  패키지명을 포함 클래스명@메모리의 주소
		 * 
		 */
		 
	}
}
