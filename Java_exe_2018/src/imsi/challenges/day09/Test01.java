package imsi.challenges.day09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
						
		//int b = 10;
		//int r = 2;

		//int b = 8;
		//int r = 1;

		int b = 24;
		int r = 24;
		
		int[] an = t.solution(b, r);
		
		System.out.println(an);
		for(int i=0 ; i<an.length; i++) {
			System.out.print(an[i] + " ");
		}

	}
	
	public int[] solution(int brown,  int red) {
		int[] answer = new int[2];
		
        int x=0;
        int y=0;
        
        int chk = 0;
        
        // red �� ũ�� ���� 
        boolean stop = false;
        
        for (int i=1 ; i<=red ; i++) {
        	for (int j=1 ; j<=red ; j++) {
        		if(i*j == red ) {
        			x = j; // ���� ���̰� ���...
        			y = i;
        			chk = x*2 + y*2 +4 ;
        			if (chk == brown) {
        				stop = true;
        				break;
        			}
        		}
        	}
        	if (stop ) break;
        }
        System.out.println(x + " / " + y);
        
        // brown �� ������  , �˻�
        //chk = x*2 + y*2 +4 ;
        //System.out.println(chk + " / " + brown);
        // 24�� ��� 1*24 �� ������ brown �� ���� �ʾƼ�
        // -> ���� �̵�
        
        // �ᱹ +1 
        // ī���� ���� ���̴� ���� ���̿� ���ų�, ���� ���̺��� ��ϴ�.
        answer[0] = x+2;
        answer[1] = y+2;
		return answer;
    }


	
}
