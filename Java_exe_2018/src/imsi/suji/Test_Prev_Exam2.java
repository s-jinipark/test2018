package imsi.suji;

public class Test_Prev_Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String test = "AABBBCCCCD";
		String test = "AAAABBCDDEF";
		
		// ���� ���ڰ� ¦���� �ݺ��Ǹ� 1/2 �� �߶󳻾� �ڿ� ����
		// �ڿ� ���� ����  " org - 2 - 1 " �� ���� �߰��� �����Ѵ�.
			
		char prev = test.charAt(0);	// ù��° ���ڷ� �ʱ�ȭ
		
		String accum = ""; // ���ڿ� ����
		String rtn_val = "";
		String remain = "";
		
		for (int i =0 ; i< test.length() ; i++) {
			char curr = test.charAt(i);
			System.out.println(prev +" / "+ curr);
			if (prev != curr) {
				// ������ �ٸ���
				System.out.println(">" + accum);
				if (accum.length() %2 == 0 ) { // ¦��?
					
					String mid_val = accum.substring(0, accum.length()/2);
					System.out.println(">>" + mid_val);
					rtn_val += mid_val;
					remain = mid_val + remain; //���� �ֱ�
				} else {
					rtn_val += accum;
				}
				
				accum = "";
			} 
			
			accum += curr; 
			prev = curr ; // ��� ����
			
			if (i==test.length()-1) { // ������ó�� �ʿ�
				System.out.println("L>" + accum);
				rtn_val += accum; // �������� ������ �Ȱ���
			}
		
		}
		System.out.println("=" + rtn_val + remain);
	}

}
