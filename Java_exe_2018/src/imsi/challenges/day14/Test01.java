package imsi.challenges.day14;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		int n = 6;
		int[] ti = {7, 10};
		
		long an = t.solution(n, ti);
		
		System.out.println(an);

	}
	
    public long solution(int n, int[] times) {
    	long answer = 0;
        int[] q = new int[times.length];
        int flag_cnt = 0;
        
    	while ( (n >= 0) && (flag_cnt < q.length) )  {
    		
    		//��� �ִ� ���� �ִ°�?
    		int tmp_emp = emptyPoint(q, times);
    		if ( (tmp_emp >-1) && (n > 0) ) { // ����ڰ� ���� ��츸
    			q[tmp_emp] = times[tmp_emp]; // ref ���� �־� ��
    			n--;	
    		}
    		
    		// 0 �ƴ� ���� ��� -1
    		flag_cnt = 0;
    		for (int i=0 ; i<q.length ; i++) {
    			if (q[i] > 0) {
    				q[i]--;
    			} else { // 0 �ΰ� count
    				flag_cnt++;
    			}
    		}
    		
    		answer++; // �ð��� �帧
    		
    	}
    	
    	
        return answer;
    }

    public int emptyPoint( int[] q, int[] ref_ti) {
    	int rtn = -1; // index
    	int min = Integer.MAX_VALUE; 
    	boolean reserve = false;
    	
    	for (int i=0; i<q.length ; i++) {
    		if (q[i] == 0 ) { // �ϴ� ��� �ִ°� ã��
    			if (ref_ti[i]<min) { // ref �� ���Ͽ� ���� �� ����
    				rtn = i;
    				min = ref_ti[i]; 		
    				reserve = false;
    			}
    		} else { // 0 �� �ƴ� �� �߿��� ���� ª�� ��
    			if ( (q[i]+ref_ti[i]) <min ) { // ref �� ���Ͽ� ���� �� ����
    				rtn = -1;
    				min = q[i]+ref_ti[i];
    				reserve = true;
    			}
    		}
    	}
    	
    	if (reserve) {
    		rtn = -1; // ���� ��ȸ�� 
    	}
    	return rtn;
    }
} 
