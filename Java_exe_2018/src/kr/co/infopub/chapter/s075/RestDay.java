package kr.co.infopub.chapter.s075;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class RestDay {
 public static void main(String[] args) {
	String st="2017-06-13";
	Calendar d2=todate(st);
	System.out.println(toYMD(d2));
	String st2=goGo(st,-7);
	System.out.println(st2);
	Calendar d3=todate(st2);
	System.out.println(toYMD(d3));
	
	TimeZone tz=TimeZone.getDefault();     // Asia/Seoul ���� ��ǻ���� �ð��� 
	Calendar cal=Calendar.getInstance(tz); // �ð����� ���� ����
	System.out.println(toYMD2(cal));
	
	// America/New_York,  		
	TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
	Calendar calNY=Calendar.getInstance(tzNY);
	System.out.println(toYMD2(calNY));
 }
 public static Calendar todate(String ss){
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	Date dd=new Date();
	try {
		dd=sdf.parse(ss);
	} catch (ParseException e) {
	}
	Calendar cal=Calendar.getInstance();
	cal.setTime(dd);
	return cal;
 }
 public static String toYMD(Calendar dd){
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(dd.getTime());
 }
 public static String toYMD2(Calendar dd){
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	return sdf.format(dd.getTime());
 }
 public static String goGo(String ss,int day){
	Calendar cal=todate(ss);
	//-7���� ���ϸ� ������
	cal.add(Calendar.DAY_OF_YEAR, day);
	//Į������ ���ڿ��� 
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(cal.getTime());
 }
// ���� ���ϱ� 113, 13���� �ݿ��� 115, ���� 118, ������ 79
public static boolean isRest(String day){
	//��, �ϸ� ������ 
	boolean isRest=false;
	Calendar tod= todate(day);
	if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || 
			tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY ){ //����� �Ǵ� �Ͽ���
		isRest=true;
	}
	return isRest;
}
public static String toWantedDay(String ss,int round){
	Calendar cal=todate(ss);
	//-7���� ���ϸ� ������
	cal.add(Calendar.DAY_OF_YEAR, -(round*7));
	//Į������ ���ڿ��� 
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(cal.getTime());
}

public static String toDay(String rs){  // 8�� 16, 2017
	SimpleDateFormat sdfDesired = new SimpleDateFormat("MMMMM dd, yyyy");
	Calendar ts=todate(rs);
	String sss=sdfDesired.format(ts.getTime());
	return sss;
}
public static Date toDate(int year, int month, int day){
	return toCalendar(year,month,day).getTime();
}
public static Calendar toCalendar(int year, int month, int day){
	Calendar cal=Calendar.getInstance();
	cal.set(year, month-1, day);
	return cal;
}
public static String toStrDate(Date dd){
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	return sdf.format(dd);
}
}
