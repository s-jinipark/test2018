package kr.co.infopub.chap005;

public class HelloCalendar {
	//�����ΰ�? non static
	public boolean isLeapYear(int year){
		boolean yearTF=false;
		if( ((year % 4==0) && (year %100 !=0))
				|| year%400==0 ){
			yearTF = true;
		}
		return yearTF;
	}
	//�����ΰ�? static
	public static  boolean isLeapSY(int year){
		boolean yearTF=false;
		if( ((year % 4==0) && (year %100 !=0))
				|| year%400==0 ){
			yearTF = true;
		}
		return yearTF;
	}
	
	public static void main(String[] args) {
		HelloCalendar cal=new HelloCalendar();
		//non static -��ü ������ ȣ��
		System.out.println(cal.isLeapYear(2020));
		//static -��ü ���� ���� ȣ��
		System.out.println(isLeapSY(2020));
	}

}
