package kr.co.jungsuk.ex.e09;

public class P13_1 {
	// [9-13] ������ �ϳ��� �� ���ڿ�(source) �߿��� Ư�� ���ڿ��� ��ġ�ϴ� ���ڿ��� ����
	//	�� ���ϴ� �����̴�. �� ���� ä�� ������ �ϼ��Ͻÿ�.

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa�� " + stringCount(src, "aa") +"�� ã�ҽ��ϴ�.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0)
			return 0;
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		while (true ) {
			
			index = src.indexOf(key, pos);
			System.out.println(">" + index);
			if (index == -1) {
				break;

			} else {
				count++;
				pos = index+key.length();
			}
		}
		return count;
	}
}