package kr.co.infopub.chap006.test;
import java.util.*;

import kr.co.infopub.chap006.CalendarAfAndBf;
public class CalendarAfAndBfMain
{
	public static void main(String[] args) 
	{
		CalendarAfAndBf cal=new CalendarAfAndBf();
		//setDate�� �ּ��� Ǯ��
		Date d=cal.setDate(2013, 8,31);
		System.out.println("���س� :"+d.toString());
		System.out.println("������ :"+cal.afterOneDay(d));
		System.out.println("���س� :"+cal.beforOneDay(d));
	}
}
