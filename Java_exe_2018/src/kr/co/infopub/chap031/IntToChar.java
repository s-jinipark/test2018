package kr.co.infopub.chap031;
public class IntToChar
{
	public static void main(String[] args) 
	{
		for(int i=21;i<=60;i++){
			//System.out.printf("[%c] ",i);
			System.out.print("["+(char)i+"] ");
			// (char)i --> int�� char�� casting
			if(i%10==0){
				System.out.println();//��ĭ�� ������
			}
		}
		System.out.println('a');
		//System.out.println('\u0041');
		System.out.println('A');
		System.out.println("���ĺ� : "+('z'-'a'+1)+"��");
		char cc='��';
		System.out.println(cc);//��
		System.out.println((int)cc);//int
		char zChar='0';//Unicode 48
		int count=(int)zChar;
		System.out.println(count);
		for(int i=count;i<=count+9;i++){
			System.out.print("["+(char)i+"] ");
		}
		System.out.println();//��ĭ�� ������

		System.out.println('\u0001'); //
		System.out.println('\1'); //
		System.out.println('\u0015'); //16����
		System.out.println('\25'); //8����

		
		for(int i=0;i<=39;i++){
			System.out.printf("[%c] ",('\25'+i));
			if((i+1)%10==0){
				System.out.printf("%n");//��ĭ�� ������
			}
		}
		
	}
}
