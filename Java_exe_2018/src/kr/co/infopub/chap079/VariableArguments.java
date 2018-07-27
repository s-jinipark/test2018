package kr.co.infopub.chap079;
 public class VariableArguments {
	// 079 Variable Arguments(...) ����ϱ� 
 	public static void main(String[] args) {
 		print(3,4,5,6,7);
 		int [] aa={5,4,7,1,9,12,0,3,2,6};
 		print(aa);
 		int a=4;  //�迭�� �ƴѵ��� ����
 		print(a);
 		String [ ] sNames={"��ö","����ȭ","������","ö��"};
 		print(sNames);
 		print("����");//prinf ����
 		Flower flo=Flower.LILY;
 		print(flo);
 		print(Flower.values());
 		String s="Welcome to the Java Programming";
 		//String [] ss=s.split(" ");//String[] ���� 
 		print(s.split(" "));
 	}
 	public static void print(int ... p){	// ... �� Ÿ���� ��ġ�� ���
 		for(int en : p){					// �ϳ� �̻��� ������ �迭�� ���� �� �ִ�
 			System.out.printf("[%d] ",en);
 		}
 		System.out.printf("%n");
 	}
 	public static void print(String ... p){
 		for(String en : p){
 			System.out.printf("[%s] ",en);
 		}
 		System.out.printf("%n");
 	}
 	public static void print(Flower ... p){
 		for(Flower en : p){
 			System.out.printf("[%s] ",en);//en.toString()-->en.name()
 		}
 		System.out.printf("%n");
 	}
}
