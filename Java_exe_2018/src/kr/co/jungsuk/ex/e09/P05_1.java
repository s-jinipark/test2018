package kr.co.jungsuk.ex.e09;

public class P05_1 {
	// [9-5] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : count
		�� �� : �־��� ���ڿ�(src)�� ã������ ���ڿ�(target)�� �� �� �������� ��� ��ȯ�Ѵ�.
		��ȯŸ�� : int
		�Ű����� : String src
				String target
	*/
	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		/*
			(1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�.
			1. src���� target�� pos�� ��ġ���� ã�´�.
			2. ã���� count�� ���� 1 ���� ��Ű��,
			pos�� ���� target.length��ŭ ������Ų��.
			3. indexOf�� ����� -1�̸� �ݺ����� ���������� count�� ��ȯ�Ѵ�.
		*/
		int tmp = 0;
		
		while (true) {
			tmp = src.indexOf(target, pos);
			if (tmp <0) {
				break;
			} else {
				//System.out.println(">"+ tmp);
				pos = tmp + target.length();
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

}