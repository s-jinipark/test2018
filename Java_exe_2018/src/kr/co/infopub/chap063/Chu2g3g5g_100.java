package kr.co.infopub.chap063;
/*
 * 2g, 3g, 5g�� �߰� ���� 10���� �ִ�. 
 * �� �ߵ��� �������� 81g�� ������� �Ѵ�. 
 */
public class Chu2g3g5g_100 {

	public static void main(String[] args) {

		for(int five=0;five<11;five++){
			for(int three=0;three<11;three++){
				for(int two=0;two<11;two++){
				  if(5*five+3*three+2*two==81){
					//String s="5g "+five+"�� 3g "+three+"�� 2g "+two+"��";
				  	//System.out.println(s);
				  	String str=String.format("5g: %d��, 3g: %d��, 2g: %d��%n",
				  			five,three,two);
				  	//add
				  	String sik = String.format("(5 * %d) + (3 * %d) + (2 * %d)", five,three,two);
				  	//System.out.printf(str);
				  	System.out.printf(str);
				  	System.out.println("\t" + sik + "\t= 81");
				  }
				}
			}
		}
		System.out.printf("-------------------------%n");
		printCondition(56);
	}
	public static void printCondition(int n){
		for(int five=0;five<11;five++){
			for(int three=0;three<11;three++){
				for(int two=0;two<11;two++){
				  if(5*five+3*three+2*two==n){
					//String s="5g "+five+"�� 3g "+three+"�� 2g "+two+"��";
				  	//System.out.println(s);
				  	String str=String.format("5g: %d��, 3g: %d��, 2g: %d��%n",
				  			five,three,two);
				  	System.out.printf(str);
				  }
				}
			}
		}
		System.out.printf("-------------------------%n");
	}
}
