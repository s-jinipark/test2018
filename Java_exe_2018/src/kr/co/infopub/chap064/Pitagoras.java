package kr.co.infopub.chap064;
public class Pitagoras {

	public static void main(String[] args) {
		//x^2+y^2=z^2�� ������Ű�� ���� x,y,z�� ã��. 
		for(int z=1;z<100;z++){
			for(int y=1;y<100;y++){
				for(int x=1;x<100;x++){
					//z>y>x�� �� �߿��� ��Ÿ��� ������ ������Ű�� ��
					if(z>x && y>x && z>y && z*z==x*x+y*y){
						System.out.println("��Ÿ��� �� : x="+x+" y="+y+" z="+z);
					}
				}
			}
		}
		printPita(100);
	}//main
	public static boolean isPita(int x,int y,int z){
		boolean isP=false;
		if(x*x==y*y+z*z){
			isP=true;
		}
		return isP;
	}//
	public static boolean isLarge(int x,int y,int z){
		boolean isP=false;
		if(z>x && y>x && z>y){
			isP=true;
		}
		return isP;
	}//
	public static void printPita(int n){
		for(int z=1;z<n;z++){
			for(int y=1;y<n;y++){
				for(int x=1;x<n;x++){
					//z>y>x�� �� �߿��� ��Ÿ��� ������ ������Ű�� ��
					if(isLarge(x,y,z)&& isPita(z,y,x)){
						System.out.println("��Ÿ��� �� : x="+x+" y="+y+" z="+z);
					}
				}
			}
		}
	}
}
