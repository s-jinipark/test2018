package kr.co.infopub.chap006;
/**
 * Created on 2013. 8. 15.<br>
 * �ڸ�Ʈ ���� ����<br>
 * javac -use HelloComment.java
 * @author honnynoop
 */
public class HelloComment {
	/**
	 * �ڼ��ΰ� �ƴѰ��� �Ǻ��ϴ� �޼���<br>
	 * <p>
	 * �ڼ���� ���� 1�� �ڱ� �ڽ��� ������ ��� ���ε� 
	 * ������ ����߸� �� ���°� 
	 * </p>
	 * �Ǻ��Ϸ��� �ϴ� <code>int</code>�� �Է��Ѵ�.<br>
	 * <pre>
	 * public boolean isPri(int a){
	 * 	  boolean isP=true ;
	 * 	  int b=(int)Math.sqrt(a);//50�̸� 2���� 7���� 
	 * 	  for(int i=2;i<=b;i++){
	 * 		if(a%i==0){   //(50,2) (50,3) (50,4) .....
	 * 			isP=false;
	 * 			break;    //forŻ��
	 * 		}else isP=true;
	 * 	  }
	 * 	  return isP;
	 * }
	 * </pre>
	 * @param a �ڼ��ΰ��� �Ǻ��Ϸ��� �ϴ� ��<code>int</code>
	 * @return �ڼ����θ� ���� <code>boolean</code>
	 */
	public boolean isPri(int a){
	  boolean isP=true ;
	  int b=(int)Math.sqrt(a); //50�̸� 2���� 7���� 
	  for(int i=2;i<=b;i++){
		if(a%i==0){      //(50,2) (50,3) (50,4) .....
			isP=false;
			break;       //forŻ��
		}else isP=true;
	  }
	  return isP;
	 }
}
