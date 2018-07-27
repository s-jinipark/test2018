package kr.co.infopub.chap009;
public class DataTypes100 {

	public static void main(String[] args) {
		//primitive type
		// �⺻ Ÿ��
		int    primitiveInt  = 19;
		double primitiveLong = 3.1453;
		//reference type
		// ���� Ÿ��
		String refStr = "�ȳ��ϼ���"; //*****
		Object refObj = new Object();
		//Wrapper class (reference)
		// ���� Ŭ����(����)
		Integer wrapInt    = new Integer(19);
		Double  wrapDouble = new Double(3.1453);
		//Array (reference)
		// �迭 (����)
		int [] a={1,2,3};

		// ���� Ÿ���� new Ű���带 �̿��Ͽ� �����͸� �޸𸮿� ���� => ��ü ����
		// ������ ��ü�� �̿��Ϸ��� ���� �ʿ� (refStr) 
		// �迭�� String �� �Ϲ� ���� Ÿ�԰� �޸� new �� ������� �ʰ� ��ü�� ����
		System.out.println("1: "+primitiveInt);
		System.out.println("2: "+primitiveLong);
		System.out.println("3: "+refStr);
		System.out.println("4: "+refStr.indexOf('��')); // �ڹٿ��� �ڸ��� �׻� 0����
		System.out.println("5: "+refStr.hashCode());
		System.out.println("6: "+refObj);
		System.out.println("7: "+refObj.getClass());
		System.out.println("8: "+refObj.hashCode());
		System.out.println("9: "+wrapInt);
		System.out.println("10: "+wrapInt.intValue());
		System.out.println("11: "+wrapDouble);
		System.out.println("12: "+wrapDouble.doubleValue());
		System.out.println("13: "+a);
		System.out.println("14: "+a.length);
		System.out.println("15: "+a[1]);
	}
}
// �⺻ Ÿ�� 		���� Ŭ����
//	byte			Byte
//	char			Character
//	long			Long
//	double			Double
//	short			Short
//	int				Integer
//	float			Float
//	boolean			Boolean

/*
�⺻Ÿ�� : �����̳� ������ ���� ������ ����
����Ÿ�� : �����Ϳ� �̸� �����ϴ� ���(�޼���)�� �����ϴ� ������ ����


java2 �� java5 �� ����

java2 : Wrapper class �̿�

java5 : Boxing / Unboxing

*/
