package kr.co.jungsuk.ex.e05;

public class P10_1 {
	// [5-10] ������ ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
	// (1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
	/*
	a b c d e f g h i j k l m n o p q r s t
	` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] {
	
	u v w x y z
	} ; : , . /
	
	0 1 2 3 4 5 6 7 8 9
	q w e r t y u i o p
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abcz123";
		String result = "";
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/ 
			// [2] ���ĺ��̸� Ư�����ڷ�, ���ڸ� ���ĺ����� ����
			// ���ĺ��� �ҹ��ڷ� ���´� ���� (a~z : 97~122)
			System.out.println(">" + (int)ch + "/" );
			int tmp = (int)ch;
			if ( tmp >= 97 && tmp <= 122 ) {
				result += abcCode[tmp-97];
			} else {
				tmp = Integer.valueOf(ch + "");
				result += numCode[tmp];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}

}
