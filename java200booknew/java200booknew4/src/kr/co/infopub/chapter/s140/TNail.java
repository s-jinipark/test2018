package kr.co.infopub.chapter.s140;
public class TNail {
	private int m;
	private int n;
	private int[][] loc;
	public TNail(int m, int n) {
		super();
		this.m = m;
		this.n = n;
		loc=new int[m][n];
	}
	public void make(){
		int x=0;
		int y=0;
		int d=1;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				loc[x][y]=i*n+j+1;//�ְ�
					if(d==0){  
						//2) ������ �̵�
						if(y+1<n && loc[x][y+1]==0){
							y++;  // ������
						}else{    // ������ �� �Ǵ� ����
							d=3;  
							x--;  // ����
						}
					} else if(d==1){
					//1) �Ʒ��� ��������
					if(x+1<n && loc[x+1][y]==0){
						x++; // �Ʒ���
					}else{   // �Ʒ��� ���Ǵ� ����
						d=0; 
						y++; // ������
					}
				}else if(d==2){
					//4)�����̵�
					if(y-1>=0 && loc[x][y-1]==0){
						y--; // ����
					}else{   // ���� ���Ǵ� ����
						d=1;
						x++; // �Ʒ�
					}
				}else if(d==3){
					//3)���� �ö���
					if(x-1>=0 && loc[x-1][y]==0){
						x--; // ����
					}else{   // ���� �� �Ǵ� ����
						d=2; 
						y--; // ����
					}
				}
			}
		}
	}
	public void print(){
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
//				System.out.printf("(%2d:[%d,%d])",
//				loc[i][j],i,j);
				System.out.printf("(%2d)",loc[i][j]);
			}
			System.out.println();
		}
	}
}