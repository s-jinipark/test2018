package kr.co.infopub.chap109;
public class BitShift2To10 {
	//2���� ��Ʈ���� 10�������� �ٲٱ� ���� �޼ҵ� (������ ��ġ)
	private int frBiTo10s(String str,int a){
		return Integer.parseInt(str)*(2<<a);
	}
	//2���� ��Ʈ���� 10�������� �ٲٱ� ���� �޼ҵ� (������ ��ġ)
	private int frBiTo10(String str,int a){
		int temp=1;
		if(a>=1){
			temp= Integer.parseInt(str)<<a;
		}else{
			temp= Integer.parseInt(str)>>(-a);
		}
		return temp;
	}
	//2�������� �Ǿ� �ִ� ���� 10��������
	public int binTo10(String str){
		int nums=0;
		int count=str.length();
		for(int i=0;i<count;i++){
			nums+=frBiTo10(str.charAt(count-1-i)+"",i);
		}
		return nums;
	}
}
