package kr.co.infopub.chapter.s126;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// s075 RestDay �߰�
public class RestDay {
 // ��, �Ͽ��� �ΰ�?
 public static boolean isRest(Calendar tod){
	boolean isRest=false;
	if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || // �����
	    tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY ){  //�Ǵ� �Ͽ���
		isRest=true;
	}
	return isRest;
 }
 // Calendar�� ���ڿ���
 public static String toYMD(Calendar dd){
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(dd.getTime());
 }	
 public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	for (int i= 1; i <=lastDay; i++) {
		cal.set(Calendar.DAY_OF_MONTH, i);  // 1�Ϻ��� ������������ 
		if(isRest(cal)){                    // ����(��,��)Ȯ��
			System.out.println(toYMD(cal)+" is Rest Day.");
		}             
	}
 }
}
