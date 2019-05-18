package kr.co.jungsuk.ch09;
class Point implements Cloneable {
	//[2]
	// Cloneable ���ͺ��̽��� ������ Ŭ���� ������ clone �� ȣ���� �� �ִ�
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x="+x +", y="+y;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();  // clone()�� �ݵ�� ����ó���� ���־�� �Ѵ�.
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

class P07_CloneEx1 {
	public static void main(String[] args){
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone(); // ����(clone)�ؼ� ���ο� ��ü�� ����
		System.out.println(original);
		System.out.println(copy);
	}
}
