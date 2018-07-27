package kr.co.infopub.chap030;
public class BitNShiftMain2 {

  public static void main(String[] args) {
	int intNum1=123;
	int intNum2=-123;
	String s="11111111111111111111111110000101";
	System.out.println(binTo10("1111011"));
	System.out.println(binTo10(s));
  }
 
  //2���� ��Ʈ���� 10�������� �ٲٱ� (������ ��ġ)
  private static int frBiTo10(String str,int a){
	  int temp=1;
	  int afterParse=Integer.parseInt(str);
	  temp=a>=1?afterParse<<a:afterParse>>(-a);
	  //temp=(a>=1?afterParse<<a:afterParse>>(-a));
	  /*
	  if(a>=1){
		  temp= afterParse<<a;
	  }else{
		  temp= afterParse>>(-a);
	  }*/
	  return temp;
  }
  //2�������� �Ǿ� �ִ� ���� 10��������
  public static int binTo10(String str){
	  int nums=0;
	  int count=str.length();
	  for(int i=0;i<count;i++){
		  nums+=frBiTo10(str.charAt(count-1-i)+"",i);
	  }
	  return nums;
  }
}
