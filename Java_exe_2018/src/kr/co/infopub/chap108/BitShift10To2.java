package kr.co.infopub.chap108;
public class BitShift10To2 {//10������ 2������
	private int [] b=new int[32];
	//	10���� ���� 2�������� ����� ���� �迭�� ����
	public void shift(int a){
		b=new int[b.length];
		for(int i=0;i<b.length;i++){
			int aa=a%2;
			b[i]=(aa>=0)? aa : -aa;
			a>>=1;//a/=2;
		}
	}
	//�迭�� ����� ���� 2���� ��Ʈ�� ���۸� �̿�
	public String showsb(){
		StringBuffer sb=new StringBuffer();
		int count=1;
		for(int i=b.length-1;i>=0;i--){
			sb.append(b[i]);
		}
		return sb.toString();
	}
}
