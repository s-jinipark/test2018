package kr.co.jungsuk.ex.e09;

public class P10_1 {
	// [9-10] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : format
		�� �� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ�Ѵ�. ������ ������ �������� ä���.
		��ȯŸ�� : String
		�Ű����� : String str - ��ȯ�� ���ڿ�
			int length - ��ȯ�� ���ڿ��� ����
			int alignment - ��ȯ�� ���ڿ��� ��������
			(0:���� ����, 1: ��� ����, 2:������ ����)
	*/

	/*
		(1) format�޼��带 �ۼ��Ͻÿ�.
		1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
		2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
		3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.
			(System.arraycopy()���)
		4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
	*/
	public static String format(String str, int length, int alignment) {
		String rtn_val = "";
		
		if (length < str.length() ) {
			rtn_val = str.substring(0, length);
		} else {
			char[] target = new char[length];
			for (int i = 0 ; i< target.length ; i++) {
				target[i] = ' ';
			}
			char[] src = str.toCharArray();
			if (alignment == 0) {
				System.arraycopy(src, 0, target, 0, src.length );
			} else if (alignment == 1) {
				System.arraycopy(src, 0, target, (target.length -src.length)/2, src.length );
			} else if (alignment == 2) {
			 	System.arraycopy(src, 0, target, target.length -src.length, src.length );
			}
			//rtn_val= target.toString(); // X Ŭ���� ����
			rtn_val = new String(target);
		}
		
		return rtn_val;
	}
		
	public static void main(String[] args) {
		String str = "������";
		//System.out.println(format(str,2,0)); 
		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}
}