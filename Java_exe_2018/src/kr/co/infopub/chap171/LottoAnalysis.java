package kr.co.infopub.chap171;
import java.util.*;
public class LottoAnalysis {
	public String[] getLottos(String s){
		String [] str=new String[10];
		StringTokenizer st=new java.util.StringTokenizer(s); 
		for(int i=0;i<str.length;i++){
			str[i]=st.nextToken();//10���� �ܾ �޴´�.
		}
		return str;
	}
	public int to10(String s){
		String ss=s;
		if(s.charAt(0)=='0'){  //ù�� ° ���ڰ� 0�ΰ�?
			ss=s.replace('0',' '); //0�� �������� ��ȭ ���Ѷ� 
		}
		return Integer.parseInt(ss.trim());  //���� ������ int�� ��ȯ
	}
	public int[] toInt(String s){
		int [] aa=new int[6];//
		StringTokenizer st=new java.util.StringTokenizer(s);
		st.nextToken();//
		//���н�Ų ��Ʈ���� ���ڷ� �ٲپ �迭�� ����
		for(int i=0;i<aa.length;i++){
			aa[i]=to10(st.nextToken().trim());
		}
		return aa;
	}
}
