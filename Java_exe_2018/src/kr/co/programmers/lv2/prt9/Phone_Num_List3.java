package kr.co.programmers.lv2.prt9;

public class Phone_Num_List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone_Num_List3 pnl = new Phone_Num_List3();
		
		String[] s1 = { "119", "97674223", "1195524421" };
		boolean rtn1 = pnl.solution( s1 );
		System.out.println("[1] > " + rtn1);

		String[] s2 = { "123","456","789" };
		boolean rtn2 = pnl.solution( s2 );
		System.out.println("[2] > " + rtn2);
		
		String[] s3 = { "12", "123" , "1235", "567", "88"};
		boolean rtn3 = pnl.solution( s3 );
		System.out.println("[3] > " + rtn3);
	}

	public boolean solution(String[] phone_book) {
        boolean answer = true;
        // � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false
        // �׷��� ������ true�� return 
        boolean tmp_stop = false;
        for (int i=0; i< phone_book.length ; i++) {
        	if (tmp_stop) break;
        	String temp = phone_book[i];
        	for (int j=0 ; j < phone_book.length; j++) {
        		if (i == j ) continue;
        		//System.out.println("> " + phone_book[j].startsWith(temp) );
        		if ( phone_book[j].startsWith(temp) ) {
        			
        			answer = false;
        			tmp_stop = true;
        			break;
        		}
        	}
        }
        
        return answer;
        
    }
	// �Ϻ� �׽�Ʈ ���̽� -> ����

}
