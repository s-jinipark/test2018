package kr.co.programmers.lv2.prt34;

public class Remove_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Pairs rp = new Remove_Pairs();
		
		String s1 = "baabaa";
		
		int rtn1 = rp.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "cdcd";
		
		int rtn2 = rp.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public int solution(String s) {
		int answer = 0;
		
		boolean continueGo = true;
		String tmp = "";
		boolean finFor = false;
		
		while ( continueGo ) {
			for (int i=0; i<s.length()-1 ; i++) {
				
				if (s.charAt(i) == s.charAt(i+1) ) {
					if (i>0) {	// �պκ� ó��
						tmp = s.substring(0, i);
					}
					//System.out.println("->" + tmp ) ; 
					s = tmp + s.substring(i+2); 
					//System.out.println("s->" + s ) ; 
					tmp = "";
					break;
				} 
				
				if (i == s.length()-2) // �� ���Ҵ�.
					finFor = true;
			}
			if (s.length() == 0  ) {
				// ������� ���� ��...
				answer = 1;
				continueGo = false;
			} else  { 
				if ( finFor || s.length() < 2) { 
					// For �� �� �� ��� -> �׳� ����
					// 2���� ���� ��쵵 -> ���� �͵� ������ �׳� ����
					continueGo = false;
				} 
				
			}
			
		}
		
		//System.out.println(">>" + s + " / "+ s.length());
		return answer;

    } 
	// �ð� �ʰ�
}
