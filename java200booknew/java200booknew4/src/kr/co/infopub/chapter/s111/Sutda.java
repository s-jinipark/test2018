package kr.co.infopub.chapter.s111;
import java.util.Date;
import java.util.Scanner;
public class Sutda {
 CardCase cc=new CardCase();      // ī�带 ����
 CardRule rule=new CardRule();    // 2���� ī�带 �޾Ƽ� ���
 Card[] cc1=new Card[CardUtil.SUTDA];
 Card[] cc2=new Card[CardUtil.SUTDA];

 public Sutda() {
	cc.make(); // ī�� �����
 }
 // �� �� �� �� 
 private void divide(){
	for (int i = 0; i < CardUtil.SUTDA; i++) {
		cc1[i]=cc.getCard(i);                // 0, 1
		cc2[i]=cc.getCard(i+CardUtil.SUTDA); // 2, 3
	}
 }
 // �� �ϳ� �� �ϳ�
 public void divide2(){
	for (int i = 0,j=0; i < cc1.length; i++, j+=2) {
		 cc1[i]=cc.getCard(j);    // 0, 2
		 cc2[i]=cc.getCard(j+1);  // 1, 3
	}	
 }
 public void play(){	
	Scanner scan=new Scanner(System.in);
	System.out.println("!!WELCOME TO CARDGAME "+new Date()+"!!");
	System.out.println("Start !");
	String ss="N";
	do{
		cc.shuffle();     // ī�� ����
		//divide();        // 2�徿 �ֱ� �� �� �� ��
		divide2();         // 2�徿 �ֱ� �� �ϳ� �� �ϳ�
		int v1=rule.rule(cc1[0], cc1[1]); // ������ �̿��Ͽ� �� ���ϱ�
		int v2=rule.rule(cc2[0], cc2[1]); // ������ �̿��Ͽ� �� ���ϱ�
		if(v1>v2){
			System.out.println("YOU WIN! ");
		}else if(v1<v2){
			System.out.println("YOU LOSE! ");
		}else{
			System.out.println("YOU SAME! ");
		}
		// ī�� ������ ���� ���
		cc.print();     // �׽�Ʈ�� -���ĺ���
		System.out.println("YOU  ");
		System.out.printf(cc1[0]+" "+cc1[1]);
		System.out.println(rule.rule(cc1[0],cc1[1]));
		System.out.println("COM ");
		System.out.printf(cc2[0]+" "+cc2[1]);
		System.out.println(rule.rule(cc2[0],cc2[1]));
		
		System.out.println("!!WELCOME TO CARDGAME "+new Date()+"!!");
		System.out.println("Do you want to replay again(Y/N)!!");
		ss=scan.next();
	 }while((ss.toUpperCase()).equalsIgnoreCase("Y"));   // ��� �ѹ� ��⸦ �Ѵ�.
	 System.out.println("Good By~~~~~");
 }
}//
