package kr.co.programmers.lv2.prt27;

public class Next_Big_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Next_Big_Number nbn = new Next_Big_Number();
		
		int n1 = 78;
		int rtn1 = nbn.solution( n1  );
		System.out.println("[1] > " + rtn1);

		int n2 = 15;
		int rtn2 = nbn.solution( n2  );
		System.out.println("[2] > " + rtn2);

	}

	public int solution(int n) {
		int answer = 0;
		
		String nToBinary = Integer.toBinaryString(n); // @1
		int tmp_org_cnt = rtnCnt1(nToBinary);
		
		int tmp = n+1;
		
		while (true) {
		
			String tmp_new_bi = Integer.toBinaryString(tmp);
			int tmp_new_cnt = rtnCnt1(tmp_new_bi);
			
			if (tmp_org_cnt == tmp_new_cnt) {
				break;
			}
			tmp++;
		}
		answer = tmp;
		return answer;

    } 
	// 
	// 2진수 변경 함수 => X


	// 1 의 갯수 리턴
	public static int rtnCnt1(String s) {
	
		int cnt = 0;
		for(int i=0; i<s.length(); i++) { // @2
			if(s.charAt(i) == '1') cnt++;
		}
		
		return cnt;
	}
}
