package kr.co.infopub.chap055;
public class IfLeapYears {

	public static void main(String[] args) {
		boolean yearTF=false;
		int year=2020;
		if( (0 == (year % 4) && 0 != (year %100)) || 
			 0 == year%400 ){
			yearTF = true;
		}else{
			yearTF = false;
		}
			
		if(yearTF){
			System.out.println(year+"�� �����Դϴ�. ");
		}else{
			System.out.println(year+"�� ������ �ƴմϴ�.");
		}
		prints(year,isLeapYear(year));
	}
	
	public static boolean isLeapYear(int year){
		boolean isLeap=false;
		if((0 == (year % 4) && 0 != (year %100)) || 
			0 == year%400){
			isLeap=true;
		}
		return isLeap;
	}
	
	public static void prints(int year,boolean isLeap){
		if(isLeap){
			System.out.println(year+"�� �����Դϴ�. ");
		}else{
			System.out.println(year+"�� ������ �ƴմϴ�.");
		}
	}
}
