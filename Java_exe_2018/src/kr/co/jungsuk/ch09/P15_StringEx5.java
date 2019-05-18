package kr.co.jungsuk.ch09;
import java.util.StringJoiner;

class P15_StringEx5 {
	public static void main(String[] args) throws Exception {
		String str = "��";

		byte[] bArr  = str.getBytes("UTF-8");  
		byte[] bArr2 = str.getBytes("CP949");  

		System.out.println("UTF-8:" + joinByteArr(bArr));
		System.out.println("CP949:" + joinByteArr(bArr2));

		System.out.println("UTF-8:" + new String(bArr,  "UTF-8"));
		System.out.println("CP949:" + new String(bArr2, "CP949"));
	}

	static String joinByteArr(byte[] bArr) {
		 StringJoiner sj = new StringJoiner(":", "[", "]");

		for(byte b : bArr)
			sj.add(String.format("%02X",b));

		return sj.toString();
	}
}

/*
	byte[] utf_str  = "��".getBytes("UTF-8"); 	// ���ڿ��� UTF-8�� ��ȯ
	String str = new String(utf_str, "UTF-8"); 	// byte �迭�� ���ڿ��� ��ȯ
	
*/