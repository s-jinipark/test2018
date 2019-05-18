package kr.co.jungsuk.ch09;
class P03_HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	/* 
	hashCode()
	�ؽ��� �����Ͱ������ �� �ϳ��ε� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� ����
	�ؽ��Լ��� ã�����ϴ� ���� �Է��ϸ�, �� ���� ����� ��ġ�� �˷��ִ� �ؽ��ڵ带 ��ȯ�Ѵ�
	-> 
	String Ŭ������ ���忭�� ������ ������, ������ �ؽ��ڵ带 ��ȯ�ϵ���
	hashCode �޼��尡 �������̵� �Ǿ� �ֱ� ����
	*/
}
