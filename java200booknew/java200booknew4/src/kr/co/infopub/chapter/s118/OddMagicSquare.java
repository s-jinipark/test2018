package kr.co.infopub.chapter.s118;
// ���
public class OddMagicSquare extends MagicSquare{ // ��� 

	public OddMagicSquare(int n) {   
		super(n);     // �߿� -> �θ�� �ѱ��. MagicSquare(n)
	}
	public OddMagicSquare( ) {
		this(3);      // �߿�-> ������ �����ε�. OddMagicSquare(3)
	}
	@Override
	public void make( ){   // �������̵�
		int x=0;
		int y=n/2;         // n protected -> �ڽ��� publicó�� ���
		magic[x][y]=1;     // protected -> �ڽ��� publicó�� ���
		for (int i = 2; i <= n*n ; i++) {
			int temX=x;
			int temY=y;
			if( x-1<0 ){
				x=n-1;
			}else{
				x--;
			}
			
			if( y-1<0 ){
				y=n-1;
			}else{
				y--;
			}
			if(magic[x][y]!=0){
				x=temX+1;
				y=temY;
			}
			magic[x][y]=i;
		}//for
	}
}//class 
