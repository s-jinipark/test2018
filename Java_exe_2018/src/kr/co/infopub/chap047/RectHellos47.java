package kr.co.infopub.chap047;

public class RectHellos47 {

	public static void main(String[] args) {
		
		printRectString("Hello",false);//����� ���� Ȧ��������
		printRectString("GO JAVA7",false);//����� ���� Ȧ��������
		printRectString("Hello my name is honny",false);
		printRectString("�ݰ����ϴ�",true);
		
		System.out.println("Hello".length());
		System.out.println("�ݰ����ϴ�".length());
		System.out.println();
		System.out.println((int)'��');//9488
		System.out.println((int)'��');//9472
		System.out.println((int)'��');//9474
		System.out.println((int)'��');//9484
		System.out.println((int)'��');//9496
		System.out.println((int)'��');//9492

	}
	public static void printRectString(String str,boolean isE){
		int count=str.length();  //String�� ���� 
		//System.out.println(count);
		int width=count;
		if(!isE){
			width=count+2;
		}else{
			width=count%2==0?count+3:count+4;
		}
		
		//���������������������������������������������������� 9484 9472 9488
		//System.out.print('\1'); //�� 1 java2
		System.out.print((char)9484); //�� 9484 java7
		for(int i=0;i<width;i++){
			System.out.print((char)9472);//�� java7
			//System.out.print('\6');//�� java2
		}
		//System.out.println('\2');//�� java2
		System.out.println((char)9488);//�� 9488
		//��                        ��  9474
		//System.out.print('\5');//�� java2
		System.out.print((char)9474);
		
		if(!isE){
			System.out.print(" "+str+" ");//str
		}else{
			System.out.print(" "+str+" ");//str
		}
		
		System.out.println((char)9474);//�� 9474
		//System.out.println('\5');//�� 9474
		
		//����������������������������������������������9492 9472 9496
		//System.out.print('\3');  //�� java 2  3
		System.out.print((char)9492);//�� 9492
		for(int i=0;i<width;i++){
			//System.out.print('\6');//�� 6
			System.out.print((char)9472);//�� 9472
		}
		//System.out.println('\4');//�� 4
		System.out.println((char)9496);//�� 9496
	}

	
}
