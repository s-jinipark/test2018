package kr.co.infopub.chap096;
//JAVA 7
public enum SeasonString  
{
	SPRING ("Spring (from 3 to 5)"),
	SUMMER ("Summer (from 6 to 8)"),
	AUTUMN ("Autumn (from 9 to 11)"),
	WINTER ("Winter (from 12 to 2)");//;����Ѵ�.
	//��ġ������ ��
	private String season;
	//������
	SeasonString(String sea){
		season=sea;
	}
	//�޼���
	public String toString(){
		return season;
	}//valueOf()
	public String getMonth(){
		return season.substring(7);
	}
}
