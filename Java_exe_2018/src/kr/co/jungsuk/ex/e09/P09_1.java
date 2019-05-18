package kr.co.jungsuk.ex.e09;

public class P09_1 {
	// [9-9] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : delChar
		�� �� : �־��� ���ڿ����� ������ ���ڵ��� �����Ͽ� ��ȯ�Ѵ�.
		��ȯŸ�� : String
		�Ű����� : String src - ��ȯ�� ���ڿ�
			String delCh - ������ ���ڵ�� ������ ���ڿ�
	*/

	/*
	(1) delChar�޼��带 �ۼ��Ͻÿ�.
	*/
	public static String delChar(String src, String delCh) {
		String rtn_val = "";
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0 ; i< src.length() ; i++) {
			//System.out.println(">" + src.charAt(i) );
			char tmp_c = src.charAt(i);
			boolean ok = true;
			for (int j = 0 ; j<delCh.length(); j++) {
				if (tmp_c == delCh.charAt(j)) {
					ok = false;
					break;
				}
			}
			if (ok) sb.append(tmp_c);
		}
		
		rtn_val = sb.toString();
		
		return rtn_val;
	}
		
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}
}