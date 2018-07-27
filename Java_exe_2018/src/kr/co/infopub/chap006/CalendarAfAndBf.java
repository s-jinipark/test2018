package kr.co.infopub.chap006;

import java.util.*;
/**
 * Created on 2013. 8. 15.<br>
 * Į���� Ŭ������ �̿��� ��¥ ���ϱ�<br>
 * java.util.Date�� �̿��� �Ϸ����� �Ϸ��ĸ� ����<br>
 * @author honnynoop
 */
public class CalendarAfAndBf {
	/**
	 * �Է��� �������� ���Ѵ�.
	 * @param d �Է� ���� ���� ����ϱ� ���� �Է� ��
	 * @return �Ϸ� �ĸ� ���
	 */
	public Date afterOneDay(Date d){
		//d ���س�¥�� �Է��Ѵ�.
		long dd=d.getTime();
		//�и�������*60��*60��*24�ð�==�Ϸ�
		return new Date(dd+1000*60*60*24);
	}
	/**
	 * �Է��� ������ ���Ѵ�.
	 * @param d �Է� ������ ����ϱ� ���� �Է� ��
	 * @return �Ϸ� ���� ���
	 */
	public Date beforOneDay(Date d){
		//d ���س�¥�� �Է��Ѵ�.
		long dd=d.getTime();
		//�и�������*60��*60��*24�ð�==�Ϸ�
		return new Date(dd-1000*60*60*24);
	}
	/**
	 * ��, ��, ���� �Է��ؼ� <code>java.util.Date<code>�� �����Ѵ�.
	 * @param year ��
	 * @param month ��
	 * @param day ��
	 * @return �Է��� ���� <code>java.util.Date<code>�� �����Ѵ�.
	 */
	public Date setDate(int year,int month,int day){
		Calendar cal=Calendar.getInstance();
		cal.set(year,month-1,day);  //0~11���� �����ϱ� ������ -1
		return new Date(cal.getTimeInMillis());
	}
	
}
