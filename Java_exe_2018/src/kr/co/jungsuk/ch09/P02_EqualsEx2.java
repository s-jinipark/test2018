package kr.co.jungsuk.ch09;
class Person {
	long id;

	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return id ==((Person)obj).id; // Person Ÿ������ �� ��ȯ
		} else {
			return false; // Ÿ����  Person �� �ƴϸ� ���� �ʿ䵵 ����
		}
	}

	Person(long id) {
		this.id = id;
	}
}

class P02_EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		//[2]
		/*
		 Person �ν��Ͻ��� �ּ� ���� �ƴ� ������� id�� ���� ���ϱ� ���� 
		 equals �޼ҵ带 �������̵�
		 
		 */
		if(p1==p2)
			System.out.println("p1�� p2�� ���� ����Դϴ�. **");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");

		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�. **");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	
	}
}
