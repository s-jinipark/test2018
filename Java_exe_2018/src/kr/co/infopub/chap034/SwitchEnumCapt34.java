package kr.co.infopub.chap034;
public class  SwitchEnumCapt34
{
	//JAVA 5~7
	public static void main(String[] args) 
	{
		Season thisSeason=Season.SPRING;
		
		switch(thisSeason){//case���� Season.SPRING �ϸ� ����
			case SPRING: System.out.println("SPRING");break;
			case SUMMER: System.out.println("SUMMER");break;
			case AUTUMN: System.out.println("AUTUMN");break;
			case WINTER: System.out.println("WINTER");break;
		}
		//Season �ȿ� �ִ� ��� ��
		Season [ ] thisSeasons=Season.values(); 
		for(int i=0;i<thisSeasons.length;i++){
			 System.out.println(i+"  "+thisSeasons[i]);
		}
		//String�� enum����
		Season thisSeason1=Season.valueOf("AUTUMN");
		System.out.println(thisSeason1);
	}
}
