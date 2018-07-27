package kr.co.infopub.chap120.two;
import java.util.Arrays;
class TetrisUtil {
	public static final int[][] TETRISA={
	{1,1,1,0}, {0,0,1,0}, {0,0,1,0}, {0,0,1,0}};
	public static final int[][] TETRISB={
	{0,0,1,0}, {0,0,1,0}, {0,0,1,0}, {0,0,1,0}};
	public static final int[][] TETRISC={
	{0,0,0,0}, {1,1,1,0}, {0,1,0,0}, {0,0,0,0}};
	public static final int[][] TETRISD={
	{0,0,0,0}, {0,1,1,0}, {0,1,1,0}, {0,0,0,0}};
}
//2�����迭�� ���ϱ� ���ؼ� 
class TetrisArrays{
	public static boolean equals(int [][] a,int [][] b){
		boolean isE=false;
		int m1=a.length;
		int n1=a[0].length;
		int m2=b.length;
		int n2=b[0].length;
		if(m1!=m2 || n1!=n2){
			return false;
		}
		//�������迭��
		for(int i=0;i<m1;i++){
			//�������迭 ��
			if(Arrays.equals(a[i],b[i])){
				isE=true;
			}else{
				isE=false;
				break;
			}//
		}
		return isE;
	}//
}

class Tetris {
	private int[][] tetris=TetrisUtil.TETRISA;
	
	public Tetris() {}
	
	public Tetris(int[][] a) {
		this.tetris = a;
	}
	
	public int[][] getTetris() {
		return tetris;
	}
	
	public void setTetris(int[][] is) {
		tetris = is;
	}
	
	public void turnRight() {
		int[][] temp = (int[][])this.tetris.clone();
		printTetris(temp);//tetris�� ��� ���ϱ� ������
		//Ŭ�а��� ���ϴ� ���� �翬���� ���� ���?
		//clone�� ȣ���� ��� �׶��� ���� ���� 
		//turnRight�ϸ� ���������� ���������� ȸ����
		//���� tetris�� ����Ǳ� ���� ȸ���� clone�� �����
		
		//�Ʒ����� ������ �迭�� ���ϴ� ���ε�
		//�׻� true�� �Ǵµ���???
		//�迭�� ����Ÿ���̱� ������ �迭 ref==�迭 ref�� �׻� false
		//�׷��� equals�� ����ؾ� �ϴµ� 
		//�������� ������ ������ �մϴ�.
		boolean isT=TetrisArrays.equals(this.tetris,temp);
		System.out.println(isT);
		int[][] temp1 = new int[tetris.length][tetris[0].length];
		int iCount = 0;
		int jCount = temp.length-1;
		
		for (int i=temp[0].length-1; i>=0; i--) {
			for (int j=0; j<temp.length; j++) {
				temp1[Math.abs(i-(temp.length-1))][j] = temp[jCount][iCount];
				//tetris[Math.abs(i-(temp.length-1))][j] = temp[jCount][iCount];
				if (jCount == 0) 
					jCount = 3;
				else
					jCount--;
			}
			iCount++;
		}
		tetris = temp1;
	}
	
	public void turnLeft() {
		
	}
	public static void printTetris(int [][] tet) {
		System.out.println("\n----------------------");
		int m = tet.length;
		int n = tet[0].length;
		for (int i=0; i<m;i++) {
			for (int j=0;j<n;j++) 
				System.out.print(tet[i][j]+" ");
			System.out.println();
		}
		System.out.println("----------------------");
	}
	public void printTetris() {
		int m = tetris.length;
		int n = tetris[0].length;
		for (int i=0; i<m;i++) {
			for (int j=0;j<n;j++) 
				System.out.print(tetris[i][j]+" ");
			System.out.println();
		}
		System.out.println("========================");
	}
}

public class TetrisMainHwang {
	public static void main(String[] args) {
		Tetris tetris = new Tetris(TetrisUtil.TETRISA);
		tetris.printTetris();
		tetris.turnRight();
		tetris.printTetris();
		tetris.turnRight();
		tetris.printTetris();
		tetris.turnRight();
		tetris.printTetris();
		//tetris = new Tetris(TetrisUtil.TETRISB);
		//tetris.printTetris();
	}
}