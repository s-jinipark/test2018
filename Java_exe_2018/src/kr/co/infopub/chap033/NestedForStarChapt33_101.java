package kr.co.infopub.chap033;
public class NestedForStarChapt33_101 {

	public static void main(String[] args) {
		//��øfor
		for (int i=0 ; i <10; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//��øfor
		for (int i=0 ; i <10; i++) {
			for (int j=10; j>i; j--) {
				System.out.print("@");
			}
			System.out.println("");
		}
		
	}
}
