package kr.co.infopub.chapter.s114;
public class OddMagicSquare {
	private int [][] magic; // 2���� �迭 ����
	private int n;          // ������ ũ�� n X n

	public int[][] getMagic() {
		return magic;
	}
	public OddMagicSquare(int n) {
		magic=new int[n][n]; // 2���� �迭 ����, �ʱ�ȭ
		this.n=n;            // ������ ũ�� ����
	}
	public OddMagicSquare( ) {
		this(3);    // ������ �����ε� - OddMagicSquare(int n)�� �̿�
	}
	public void make( ){   // Ȧ�� ������ �����
		int x=0;           // ���� ����
		int y=n/2;         // �߾�
		for (int i = 1; i <= n*n ; i++) {
			int temX=x;    // �ű���� ��ġ ����
			int temY=y;    
			System.out.printf("(%d,%d)\t",x,y);
			magic[x][y]=i; // 1~nxn ����
			// ���� �̵�
			if( x-1<0 ){ // ����
				x=n-1;
			}else{
				x--;     // ���� x=x-1;
			}
			// �������� �̵�
			if( y-1<0 ){ // ���� ��
				y=n-1;
			}else{
				y--;     // ���� y=y-1;
			}
			if(magic[x][y]!=0){ // �̹� ����
				x=temX+1;  // x����ġ+1
				y=temY;    // y����ġ
			}
		}//for
	}
	public void print(){
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
}//class 
