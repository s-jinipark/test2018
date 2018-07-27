package kr.co.infopub.chap062;
public class TriangleCondition {
	public static void main(String[] args) {
		//������ ���̰� �ﰢ���� �� ���� 
		for(int z=1;z<5;z++){
			for(int y=1;y<5;y++){
				for(int x=1;x<5;x++){
					if((x+y>z) && (y+z>x) && (x+z>y)){
						System.out.println("�ﰢ�� ���� : x="+x+" y="+y+" z="+z);
					}
				}
			}
		}
		printTriCons(5);
		printTriConUp(5);
	}
	public static boolean isXYZTri(int x, int y ,int z){
		boolean isL=false;
		if(x+y>z){
			isL=true;
		}
		return isL;}
	public static boolean isXYZTriUp(int x, int y ,int z){
		boolean isL=false;
		if(x+y<z){
			isL=true;
		}
		return isL;}
	public static void printTriCons(int n){//�ﰢ��
		for(int z=1;z<n;z++){
			for(int y=1;y<n;y++){
				for(int x=1;x<n;x++){
					if((isXYZTri(x,y,z)) && isXYZTri(y,z,x) && isXYZTri(z,x,y)){
						System.out.println("�ﰢ�� ���� : x="+x+" y="+y+" z="+z);
					}
				}
			}
		}
	}
	public static void printTriConUp(int n){//�а��ﰢ��
		for(int z=1;z<n;z++){
			for(int y=1;y<n;y++){
				for(int x=1;x<n;x++){//�ﰢ��
					if((isXYZTri(x,y,z)) && isXYZTri(y,z,x) && isXYZTri(z,x,y)){
						if(isXYZTriUp(x*x,y*y,z*z)||isXYZTriUp(y*y,z*z,x*x)
								||isXYZTriUp(z*z,x*x,y*y)){//�а�
							System.out.println("�а��ﰢ�� ���� : x="+x+" y="+y+" z="+z);
						}
					}
				}
			}
		}
	}
}