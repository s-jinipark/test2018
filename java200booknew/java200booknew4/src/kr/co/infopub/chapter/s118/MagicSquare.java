package kr.co.infopub.chapter.s118;
public class MagicSquare {
	protected int [][] magic;     // �ڽ��� publicó�� ���
	protected int n;              // �ڽ��� publicó�� ���
	
	public int[][] getMagic() {
		return magic;
	}
	// �ݵ��� int�� �Է� �޾ƾ� �ϴ� ������
	public MagicSquare(int n) {
		magic=new int[n][n];
		this.n=n;
	}
    // �⺻ ������ ����
	//public MagicSquare() {}
	
	public void make( ){ }  // make() ���������� ���� ����
	
	public void print(){    // public �ڽ��� �������� 
		System.out.println();
		System.out.println(n+" is magic : "+isMagic());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//�������� �� �Ǿ��°��� �Ǵ�
	protected  boolean isMagic( ){  // �ڽ��� publicó�� ���
		boolean isM=true;
		int[ ]m=new int[2*n+2];
		for (int i = 0; i < n; i++) {
			m[i]=sumRow(i);
			m[i+n]=sumCol(i);
		}
		m[2*n]=sumReverseDia();
		m[2*n+1]=sumDia();
		for (int i = 1; i < m.length; i++) {
			if(m[0]==0 || m[0]!=m[i]){
				isM=false;
				break;
			}
		}
		return isM;
	}
	//row ���� ������ ��
	private int sumRow(int row){
		int tot=0;
		for (int i = 0; i < n; i++) {
			tot+=magic[row][i];
		}
		return tot;
	}
	
	//col ����(������)  ����� ��
	private int sumCol(int col){
		int tot=0;
		for (int i = 0; i < n; i++) {
			tot+=magic[i][col];
		}
		return tot;
	}
	
	private int sumDia(){
		int tot=0;
		for (int i = 0; i < n ; i++) {
			tot+=magic[i][n-1-i];
		}
		return tot;
	}
	
	private int sumReverseDia(){
		int tot=0;
		for (int i = 0; i < n ; i++) {
			tot+=magic[i][i];
		}
		return tot;
	}
}
