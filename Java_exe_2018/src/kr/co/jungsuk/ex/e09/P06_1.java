package kr.co.jungsuk.ex.e09;

public class P06_1 {
	// [9-6] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : fillZero
		�� �� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ��� �����, ���� �� ������ '0'����
			ä���.
			���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״��
			��ȯ�Ѵ�.
			���� �־��� length�� ���� 0���� ���ų� ���� ���̸�, �� ���ڿ�("")�� ��ȯ�Ѵ�.
		��ȯŸ�� : String
		�Ű����� : String src - ��ȯ�� ���ڿ�
			int length - ��ȯ�� ���ڿ��� ����
	*/
	public static String fillZero(String src, int length) {
		/* (1) fillZero�޼��带 �ۼ��Ͻÿ�.
			1. src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
			2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�.
			3. src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ�Ѵ�.
			4. ���̰� length�� char�迭�� �����Ѵ�.
			5. 4���� ������ char�迭�� '0'���� ä���.
			6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
			7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		*/
		String rtn_val = "";
		if ( src.equals("") || src.length() == length) {
			//System.out.println( "(1)" );
			rtn_val = src;
		} else if ( length  <= 0) {
			//System.out.println( "(2)" );
			rtn_val = "";
		} else if (src.length()  > length) {
			//System.out.println( "(3)" );
			rtn_val = src.substring(0, length); // **
			//System.out.println(">" + rtn_val);

		} else {
			//System.out.println( "(4)" );
			char[] test = new char[length];
			for (int i =0 ; i<test.length; i++) {
				test[i] = '0';
			}
			
			// [2] char[] �� src ���� ū ��Ȳ
			//     �ڿ��� ���� ä��
			//System.out.println(src);
			int diff = length - src.length();
			for (int j = src.length()-1; j>=0 ; j--) {
				//System.out.println(j + "/" + src.charAt(j));
				test[j+diff]= src.charAt(j);
			}
			
			for (int i =0 ; i<test.length; i++) {
				rtn_val += test[i];
			}
		}
		
		return rtn_val;
	}
	public static void main(String[] args) {
		String src = "12345";
		//System.out.println(fillZero("",5));
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}

}