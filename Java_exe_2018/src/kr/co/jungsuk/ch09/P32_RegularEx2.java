package kr.co.jungsuk.ch09;
import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��

class P32_RegularEx2 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "c", "cA",
				        "ca", "co", "c.", "c0", "c#",
					"car","combat","count", "date", "disc"
						};		
		String[] pattern = {".*","c[a-z]*","c[a-z]", "c[a-zA-Z]",
                                          "c[a-zA-Z0-9]","c.","c.*","c\\.","c\\w",
                                          "c\\d","c.*t", "[b|c].*", ".*a.*", ".*a.+",
                                          "[b|c].{2}"
                                         };

		for(int x=0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + "  ���: ");
			for(int i=0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches())
					System.out.print(data[i] + ",");
			}
			System.out.println();
		}
	} // public static void main(String[] args) 
}


/*
 	���Խ� ���� 		����		
	.*  		��� ���ڿ� 			���: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,date,disc,
	c[a-z]*  	c�� �����ϴ� ���ܾ�	���: c,ca,co,car,combat,count,
	c[a-z]  	c�� �����ϴ� ���ڸ� ���ܾ�
								���: ca,co,
	c[a-zA-Z]  	c�� �����ϴ� ���ڸ� ���ܾ�(��ҹ��� ���� ����)
								���: cA,ca,co,
	c[a-zA-Z0-9]	c�� �����ϰ� ���ڿ� ����� ���յ�  �α���
								���: cA,ca,co,c0,
	c.  		c�� �����ϴ� ���ڸ� ���ڿ�	���: cA,ca,co,c.,c0,c#,
	c.*  		c�� �����ϴ� ��� ���ڿ�
								���: c,cA,ca,co,c.,c0,c#,car,combat,count,
	c\.  		c. �� ��ġ�ϴ� ���ڿ�  '.'�� ���� �ۼ��� ���Ǵ� �����̹Ƿ� 
	  			escape ������ \ �� ���		
	  							���: c.,
	c\w  		c[a-zA-Z] �� ����	���: cA,ca,co,c0,
	c\d  		c[0-9] �� ���� 		���: c0,
	c.*t  		c �� �����ϰ� t �� ������ ��� ���ڿ�
								���: combat,count,
	[b|c].*  	b �Ǵ� c �� �����ϴ� ���ڿ�
								���: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,
	.*a.*  		a�� �����ϴ� ��� ���ڿ�
								���: bat,baby,ca,car,combat,date,
	.*a.+  		a�� �����ϴ� ��� ���ڿ�
				+ : 1 �Ǵ� �� �̻��� ���� (�ݵ�� �ϳ� �̻��� ���� �־��..)
								���: bat,baby,car,combat,date,
	[b|c].{2}  	b �Ǵ� c �� �����ϴ� ���ڸ� ���ڿ�
								���: bat,car,

*/