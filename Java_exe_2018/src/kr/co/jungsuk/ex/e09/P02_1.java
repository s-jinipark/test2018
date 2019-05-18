package kr.co.jungsuk.ex.e09;

public class P02_1 {
	// [9-2] ������ ���� �������� �򵵷� Point3DŬ������ equals()�� ��������� x, y, z
	// �� ���� ���ϵ��� �������̵��ϰ�, toString()�� �������� �����ؼ� ������ �������̵��Ͻÿ�.
	/*
	[������]
		[1,2,3]
		[1,2,3]
		p1==p2?false
		p1.equals(p2)?true
	*/
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	}

}

class Point3D {
	int x,y,z;
	Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	Point3D() {
		this(0,0,0);
	}
	public boolean equals(Object obj) {
		/*
		(1) �ν��Ͻ����� x, y, z�� ���ϵ��� �������̵��Ͻÿ�.
		*/
		Point3D p3d = (Point3D)obj;
		int p_x = p3d.x;
		int p_y = p3d.y;
		int p_z = p3d.z;
		boolean rtn_val = false;
		
		if (this.x==p_x && this.y==p_y && this.z==p_z) {
			rtn_val = true;
		}
		return rtn_val;
	}
	public String toString() {
		/*
		(2) �ν��Ͻ����� x, y, z�� ������ ����ϵ��� �������̵��Ͻÿ�.
		*/
		String rtn_val = "";
		int t_x = this.x;
		int t_y = this.y;
		int t_z = this.z;
		
		rtn_val = "[" + t_x + ", " + t_y + ", " + t_z + "]" ;
		return rtn_val;
	}
}