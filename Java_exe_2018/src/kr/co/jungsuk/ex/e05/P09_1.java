package kr.co.jungsuk.ex.e05;

public class P09_1 {
	// [5-9] �־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				/*
				(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				*/ 
				//result[star.length-1-i][star[i].length-1-j] = star[i][j];
				System.out.println( i + "/" + j + " -> "
						+ j + "/"  + (star.length-1-i) 
						);
				result[j][star.length-1-i] = star[i][j];
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
