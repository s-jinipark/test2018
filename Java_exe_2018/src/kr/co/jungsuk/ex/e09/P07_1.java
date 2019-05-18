package kr.co.jungsuk.ex.e09;

public class P07_1 {
	// [9-7] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : contains
		�� �� : ù ��° ���ڿ�(src)�� �� ��° ���ڿ�(target)�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
			���ԵǾ� ������ true, �׷��� ������ false�� ��ȯ�Ѵ�.
		��ȯŸ�� : boolean
		�Ű����� : String src
			String target
	*/

	/*
	(1) contains�޼��带 �ۼ��Ͻÿ�.
	*/
	public static boolean contains(String src, String target) {
		boolean rtn_val = false;
		
		if ( src.contains(target)) {
			rtn_val = true;
		}
		return rtn_val;
	}
		
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}
}