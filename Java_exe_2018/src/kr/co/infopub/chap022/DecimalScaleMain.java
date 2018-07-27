package kr.co.infopub.chap022;
public class DecimalScaleMain {

	public static void main(String[] args) {
		int deciNUm=123;//Integer.MAX_VALUE;
		//System.out.println(Integer.toBinaryString(deciNUm));
		System.out.print("1: ");
		for(int i=0;i<32;i++){	// 32���� ���� ����
			System.out.print((int)(deciNUm/Math.pow(2,31-i)));
			deciNUm=(int)(deciNUm%Math.pow(2,31-i));
		}
		// int �� �ִ밪 2�� 31���̹Ƿ� 32 �̸�
		// Math.pow(2,31-i) �� 2�� 31�� ���� 2�� 0�� �� �ȴ�
		// 123 �� 64+32+16+8+2+1 �̴�
	    // 0�� '����' 1�� '�ִ�' �� ��Ÿ����
		
		System.out.println(); 
		System.out.println("2: "+toBinal(123));//2����  
		System.out.println("3: "+0173);//8����  
		System.out.println("4: "+toOctal(123));//8����
		System.out.println("5: "+0x7b);//0x7B 16����

	}
	public static String toBinal(int num){
		int temp=num;
		String sToOct="";//String �ʱ�ȭ
		for(int i=0;i<32;i++){
			sToOct=(temp%2)+sToOct;
			temp=temp/2;
		}
		return sToOct;
	}
	public static String toOctal(int num){
		int temp=num;
		String sToOct="";//String �ʱ�ȭ
		for(int i=0;i<32/3;i++){
			sToOct=(temp%8)+sToOct;
			temp=temp/8;
		}
		return sToOct;
	}
}