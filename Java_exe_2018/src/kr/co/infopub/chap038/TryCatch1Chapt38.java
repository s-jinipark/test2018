package kr.co.infopub.chap038;
public class  TryCatch1Chapt38
{
	public static void main(String[] args) 
	{	
		String sNum="123";
		String nNum="h";
		try{
			int a=Integer.parseInt(sNum);
			System.out.println(a);
		}catch(NumberFormatException ee){
			System.out.println("int���� Ȯ���� ��!!!!");
			//System.err.println(ee);
			//ee.printStackTrace();
			System.err.println(ee.getMessage());
		}catch(Exception ee){
			System.out.println("�� �� �� �־�");
			//System.err.println(ee.getMessage());
			//System.err.println(ee);
			//ee.printStackTrace();
		}finally{
			System.out.println("�� ����Ǿ�� �� ��!!!!");
		}
	}
}
