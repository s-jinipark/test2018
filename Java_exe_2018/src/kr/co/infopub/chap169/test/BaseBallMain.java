package kr.co.infopub.chap169.test;

import kr.co.infopub.chap169.CompThink;
import kr.co.infopub.chap169.Compare;
import kr.co.infopub.chap169.InputsInt;

public class BaseBallMain {

	public static void main(String[] args) {
		//��ǻ�Ͱ� ���δٸ� 3���� ���ڸ� �����Ѵ�.
		//0~9�� 3���� ���δٸ� ���ڸ� ���� 
		CompThink com=new CompThink(10,3);
		//��ǻ���� ���ڸ� ���߱� ���Ѱ�.
		InputsInt  player =new InputsInt();
		//�񱳸� ���Ѱ�.
		Compare compare=new Compare();
		
		// ��ǻ�Ͱ� ���δٸ� 3���� ���ڸ� �����Ѵ�.
		int [] computor=com.getBall();	
		int count=0;   //10�� �ȿ� ���������Ѱ�.
		while(true){   //���� ������ �����.
			count++;
			//������ �Է��Ѵ�.
			int [] play=player.input(3,0,9,false);
			//�ļ����� ������ �Է��Ѱ��� ���ǿ� �ִ´�.
			compare.input(computor,play);
			//��Ʈ����ũ ����
			int strike=compare.getStrike();
			//���� ����
			int ball=compare.getBall();
			//������ �Է��� ������ �����ش�.
			for(int i=0;i<play.length;i++){
				System.out.print(play[i]+"   ");
			}
			//���� ��Ʈ����ũ�� ���� ������ �����ش�.
			System.out.println(count+"  ["+strike+" strike : "+ball+"  ball]");
			//���� ��Ʈ����ũ�� 3���� ��� ��
			//10�� ����ȿ� 3��Ʈ����ũ�� ���� �� �ִ°�?
			if(strike==3){
				if(count<10){
					System.out.println("You Win!!");
				}
				break;
			}else{
				if(count>=10){
					System.out.println("You Loose!!");
					break;
				}
			}
		}
		System.out.println("Pit:"+computor[0]+":"+computor[1]+":"+computor[2]);
		System.exit(1);//gui
	}
}
