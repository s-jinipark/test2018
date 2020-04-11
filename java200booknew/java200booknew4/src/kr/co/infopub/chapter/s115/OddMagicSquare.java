package kr.co.infopub.chapter.s115;
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
			int temX=x;    // �ű�� �� ��ġ ����
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
		System.out.println(n+" is magic : "+isMagic()); //������ �ϼ�?
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//row �࿡ ���� ������ ��
	private int sumRow(int row){
		int tot=0;
		for (int i = 0; i < n; i++) {
			tot+=magic[row][i];
		}
		return tot;
	}
	// col ���� ����  ����� ��
	private int sumCol(int col){
		int tot=0;
		for (int i = 0; i < n; i++) {
			tot+=magic[i][col];
		}
		return tot;
	}
	// �� �밢�� (2,0)(1,1),(0,2)
	private int sumDia(){
		int tot=0;
		for (int i = 0; i < n ; i++) {
			tot+=magic[i][n-1-i];
		}
		return tot;
	}
	// �밢�� (0,0),(1,1),(2,2)
	private int sumReverseDia(){
		int tot=0;
		for (int i = 0; i < n ; i++) {
			tot+=magic[i][i];
		}
		return tot;
	}
	// �������� �� �Ǿ��°��� �Ǵ�
	private  boolean isMagic( ){
		boolean isM=true;
		int[ ]m=new int[2*n+2];  // ���n+����n+�밢��1+���밢��1
		for (int i = 0; i < n; i++) {
			m[i]=sumRow(i);      // 0,1,2 ���� ��
			m[i+n]=sumCol(i);    // 3,4,5 ���� ��
		}
		m[2*n]=sumReverseDia();  // ���밢������
		m[2*n+1]=sumDia();       // �밢���� ��
		for (int i = 1; i < m.length; i++) {
			if(m[0]==0 || m[0]!=m[i]){ // �ϳ��� �ٸ��� �������� �ƴ�
				isM=false;
				break;
			}
		}
		return isM;
	}
}//class 
