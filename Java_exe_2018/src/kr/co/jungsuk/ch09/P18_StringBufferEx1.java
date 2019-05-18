package kr.co.jungsuk.ch09;
class P18_StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		// StringBuffer�� ������ String���� ��ȯ�Ѵ�.
		String s  = sb.toString();	// String s = new String(sb);�� ����.
		String s2 = sb2.toString();

		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}
}

/*
	String Ŭ���������� equals �޼��带 �������̵��ؼ� ���ڿ��� ������ ���ϵ��� �����Ǿ� ������,
	StringBuffer Ŭ������ equals �޼��带 �������̵����� �ʾƼ� 
	  -> equals �޼ҵ带 ����ص� ��񱳿�����(==) �� ����  �Ͱ� ���� ����� ��´�
	  
*/