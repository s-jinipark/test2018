package kr.co.infopub.chap010;
public class TypeTest100{
  public static void main(String[] args) {	
	byte ba=10;
	byte bb=20;
	byte bc=10+20;
	//byte bd=ba+bb;  //Ÿ�� ĳ���� ����
	// Type mismatch ERR
	// ���� Ÿ���� �⺻ Ÿ���� int *****
	// ������ �Ѱ��� ��� �ڵ����� int
	// -> casting �ʿ�
	byte be=(byte)(ba+bb);   //(byte)(int+int)
	Object tObj = ba;
	System.out.println( tObj instanceof Integer );
	System.out.println( tObj instanceof Byte );
	System.out.println("01 : "+bc);
	System.out.println("02 : "+be);
	
	short sa=30;
	short sb=50;
	short sc=30+50;
	//short sd=sa+sb; //Ÿ�� ĳ���� ����
	short se=(short)(sa+sb);  //(short)(int+int)
	Object tObj2 = sc;
	System.out.println( tObj2 instanceof Integer );
	System.out.println( tObj2 instanceof Short );	
	System.out.println("03 : "+sc);
	System.out.println("04 : "+se);

	int ia=20;
	int ib=30;
	int ic=20+30;   
	int id=ic+sa;  //sa�� �����̱� ������ int �ȴ�. ***
	System.out.println("05 : "+ic);
	//--> �����̱� ������ int ?? -> ���� �ȵ�
	
	long la=40l; // long Ÿ���� �����Ϸ���, l �̳� L �ʿ�
	long lb=50L;
	long lba=50+Integer.MAX_VALUE;  //(int+int) //50 �� L �� ������ �ʾ� int -> ����
	long lbb=50L+Integer.MAX_VALUE; //(long+int)
	long lc=la+lb;                  //(long+long)
	// long+long ?? ������ �ѱ�� int �ƴϰ�?? *****
	
	System.out.println("06 : "+lba);  //int�� ����
	System.out.println("07 : "+lbb);
	System.out.println("08 : "+lc);
	
	float fa=45.0f; // �Ҽ� Ÿ���� �⺻�� double. 
	//float �� f�� F�� ����
	float fb=46.67F;
	//float fc=30.4;  //F�� ������ long Ÿ���� �ȴ�. ***
	// cannot covert double to float �ε�???
	
	float fd=30;    // int�� �ڵ����� float�� �ȴ�.
	float fe=fa+fb;
	
	double da=12;
	double db=45+Float.MAX_VALUE;
	double dc=da+db;
	System.out.println("09 : "+dc);
	
	System.out.println("10 : "+"byte ����: "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
	System.out.println("11 : "+"short ����: "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
	System.out.println("12 : "+"int ����: "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
	System.out.println("13 : "+"long ����: "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
	System.out.println("14 : "+"float ���� ����: "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
	System.out.println("15 : "+"double ���� ����: "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);	
  }
 }
// C ���� int ������ ������(Unix - 4����Ʈ, Windows - 2����Ʈ)
// java -> �⺻Ÿ���� ũ�⸦ ����
// byte, short(char), int, long, float, double
// 1, 2, 4, 8, 4, 8
// bsilfd 124848 �̶�� ��� *****
// ��� FD (PD �� ��������..)
