package imsi.suji;

public class Test_Prev_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "AABBBCCCCD";
		
		// ���� ���ڰ� ¦���� �ݺ��Ǹ� 1/2 �� �߶󳻾� �ڿ� ����
		// �ڿ� ���� ����  " org - 2 - 1 " �� ���� �߰��� �����Ѵ�.
		
		int tot_len = test.length();
		int cur_loc = 0;
		int same_cnt = 0;
		char prev = test.charAt(0);	// ù��°�� �ʱ�ȭ
		boolean go = true;
		String accum = ""; // ���ڿ� ����
		String rtn_val = "";
		String remain = "";
		while(go) {
			boolean b_split = false;
			char tmp = test.charAt(cur_loc);
			
			System.out.println(">" + tmp);
			cur_loc++; // ���� ��ġ ����				
			if ( (int)prev != (int)tmp  ) {
				// ���ڿ��� �ٲ���� �� �۾�
				System.out.println(">>" + same_cnt);
				same_cnt = 0;
				b_split = true;

			} else if ( tot_len == cur_loc) { // �������� ��� �۾�
				same_cnt++; // 1���� ����
				accum += tmp; // ������ ���Խ�����
				System.out.println("L >>" + same_cnt);
				go = false;
				b_split = true;
			}
			
			if (b_split) {
				//System.out.println("->");
				if ((accum.length())%2 == 0) {	//¦���̸�
					System.out.println("->"  + accum); //
					int split_len = accum.length() / 2;
					String mid_str = accum.substring(0, split_len);
					rtn_val += mid_str;
					remain = mid_str + remain;
				} else {
					rtn_val += accum;
				}
				accum = ""; // �ʱ�ȭ
			}
			
			same_cnt++;
			prev = tmp;
			accum += tmp;

		}
		System.out.println("=" + rtn_val + remain);
	}
	// String test = "AABBBCCCCD"; �� ���
	// String index out of range: 10 ���� ��
}
