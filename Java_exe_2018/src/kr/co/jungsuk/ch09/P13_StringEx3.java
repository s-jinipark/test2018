package kr.co.jungsuk.ch09;
class P13_StringEx3 {
	public static void main(String[] args) {
		// ���̰� 0�� char�迭�� �����Ѵ�.
		char[] cArr = new char[0];   // char[] cArr = {};�� ����.
		String s = new String(cArr); // String s = new String("");�� ����.

		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}

/*
	�� ���ڿ�(empty string)
	���̰� 0�� �迭 ������ �� ������? Yes
	String s = ""; �� ���� ������ ���� ��
	 -> String �ν��Ͻ��� ���ο� new char[0] �� ����
	         ���̰� 0 �� char �� �迭�� �����ϰ� �ִ� ���̴�
	         
	�׷���  String s = ""; �� ���� ǥ���� �����ϴٰ� �ؼ�
	char c = ''; �� ���� ǥ���� ������ ���� �ƴϴ�    
	 -> char �� �������� �ݵ�� �ϳ��� ���ڸ� �����ؾ� �Ѵ�
	 
*/