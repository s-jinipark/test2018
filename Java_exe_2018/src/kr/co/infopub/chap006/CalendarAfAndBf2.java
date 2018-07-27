package kr.co.infopub.chap006;

import java.util.Calendar;
import java.util.Date;
/**
 * Created on 2013. 8. 15.<br>
 * Į���� Ŭ������ �̿��� ��¥ ���ϱ�<br>
 * java.util.Date,java.util.Calendar, int�� �Է¹޾� <br>
 * ��¥ ���ĸ� ����<br>
 * @author honnynoop
 */
public class CalendarAfAndBf2 {

	/**
	 * ������� ������ �Է¹ް� ���� ���ڸ� �Է¹޾� ���ϴ� ��¥�� ���Ѵ�.
	 * @param year �⵵
	 * @param month ��
	 * @param day ��
	 * @param diff ����� �� , ������ �� ��¥�� ���Ѵ�.
	 * @return ���� ���ڸ� �Է¹޾� ���ϴ� ��¥�� ���Ѵ�. 
	 */
	public Date dateAfOrBf(int year,int month,int day, int diff){
		Calendar cal=Calendar.getInstance();
		cal.set(year,month-1,day);  //0~11���� �����ϱ� ������ -1
		cal.add(Calendar.DAY_OF_MONTH, diff);
		return new Date(cal.getTimeInMillis());
	}
	/**
	 * Date �Է¹ް� ���� ���ڸ� �Է¹޾� ���ϴ� ��¥�� ���Ѵ�.
	 * @param Date d ����� 
	 * @param diff ����� �� , ������ �� ��¥�� ���Ѵ�.
	 * @return ���� ���ڸ� �Է¹޾� ���ϴ� ��¥�� ���Ѵ�.
	 */
	public Calendar dateAfOrBf(Date d, int diff){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(d.getTime()); 
		cal.add(Calendar.DAY_OF_MONTH, diff);
		return cal;
	}
	/**
	 * Calendar �Է¹ް� ���� ���ڸ� �Է¹޾� ���ϴ� ��¥�� ���Ѵ�.
	 * @param d Calendar ����� 
	 * @param diff ����� �� , ������ �� ��¥�� ���Ѵ�.
	 * @return ���� ���ڸ� �Է¹޾� ���ϴ� ��¥�� ���Ѵ�.
	 */
	public Calendar dateAfOrBf(Calendar d, int diff){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(d.getTime().getTime());  
		cal.add(Calendar.DAY_OF_MONTH, diff);
		return cal;
	}
	
}
