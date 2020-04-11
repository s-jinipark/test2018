package kr.co.infopub.chapter.s139;
public class SNail {
	private int m;
	private int n;
	private int[][] loc;
	public SNail(int m, int n) {
		super();
		this.m = m;
		this.n = n;
		loc=new int[m][n];
	}
	public void make(){
		int x=0;
		int y=0;
		int d=0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				loc[x][y]=i*n+j+1;//�ְ�
				if(d==0){  // ���������� �̵�
					if(y+1<n && loc[x][y+1]==0){
						y++;
					}else{    // ������ ���̳� ����
						d=1;  // �Ʒ�
						x++;  // 0,5(y++)=>0,6(x++)->1,6
					}
				} else if(d==1){ //�Ʒ��� �̵�
					if(x+1<n && loc[x+1][y]==0){
						x++;  // �Ʒ���
					}else{    // �Ʒ� ���̳� ����
						d=2;  // ��������
						y--;  // 5,6(x++)=>6,6(y--)->6,5
					}
				}else if(d==2){ // ��������
					if(y-1>=0 && loc[x][y-1]==0){
						y--;  // ��������
					}else{    // ���� ���̳� ����
						d=3;  // ����
						x--;  // 6,1(y--)=>6,0(x--)->5,0
					}
				}else if(d==3){
					if(x-1>=0 && loc[x-1][y]==0){
						x--;  // ���� �̵�
					}else{    // ���ʺ��̳� ����
						d=0;  // ������
						y++;  // 2,0(x--)=>1,0(y++)->1,1
					}
				}
			}
		}
	}
	public void print(){
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.printf("(%2d:[%d,%d])",loc[i][j],i,j);
				System.out.printf("(%2d)",loc[i][j]);
			}
			System.out.println();
		}
	}
}
