package kr.co.infopub.chap188;
import java.util.*;
public class TimesGoMain {

	public static void main(String[] args) {
		Timer t=new Timer();
		TimesGo tg=new TimesGo();
		//t.schedule(tg, 1000);//1���� �ѹ� ����
		//t.schedule(tg, 2000,1000);//2���� 1�ʸ��� ���� �ݺ�
		//t.schedule(tg,new Date(System.currentTimeMillis()+3000));//3���� 1�� ����
		//3���� 1�ʸ��� ����
		t.schedule(tg,new Date(System.currentTimeMillis()+3000),1000);
		//t.cancel();//���߱�
	}
}
