package kr.co.infopub.chapter.s151;
public class HyoBaseballMain {
 public static void main(String[] args) {
	Pitcher pit=new Pitcher();      // �� ������ ����
	Hitter hit=new Hitter();        // �� ġ�� Ÿ��
	Umpire ump=new Umpire();        // ��Ʈ����ũ, �� ����
	int iterCount=0;                // 10�� �̳��� ������
	pit.make();                     // �� ������
	ump.setPitBall(pit.getGong());  // ���ǿ��� ������ �ֱ�
	System.out.println("Play Base Ball~~~~~~~");
	while(true){
		iterCount++;
		hit.make();           // Ÿ�� - �� ���߱�
		System.out.printf("%d��° �Է��� �� : %d,%d,%d\n",
			 iterCount,hit.getGong()[0],hit.getGong()[1],hit.getGong()[2]);
		ump.setHitBall(hit.getGong());  // ���ǿ��� Ÿ�ڰ� �ֱ�
		int strike=ump.strike();
		int ball=ump.ball();
		System.out.printf("%d��°  %dstrike %dball\n",iterCount,strike, ball);
		if(iterCount<10 && strike==3){   // 3 ��Ʈ����ũ- ��� ����
			System.out.println("You Win!!");
			break;
		}else if(iterCount>=10 && strike<3){
			System.out.println("You Lose!!");
			System.out.printf("���� : %d,%d,%d\n",
					   pit.getGong()[0],pit.getGong()[1],pit.getGong()[2]);
			break;
		}
	}
 }
}
