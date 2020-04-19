package imsi.challenges.day01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
		//String st = "1924";
		//int in	= 2;	// n �� ����

		String st = "1231234";
		int in	= 3;	
		
		String an = t.solution(st, in);
		
		System.out.println(an);
	}
	
	public String solution(String number, int k) {
		
		int idx = 0;
	    char max;
		StringBuilder answer = new StringBuilder();
	
		if(number.charAt(0) == '0') return "0";  // �� ���ڸ� '0' �̸� ����
		
		for(int i = 0; i < number.length() - k; i++) {
			max = '0';
			// 0 ���� �����ϸ� (��ü ���� - ���� ����) ����
			for(int j = idx; j <= k + i; j++) {
				// idx ����  k + i ����
				// i �� ������ ����  k+i �̹Ƿ� �ڷ� ������
				// max ���� ������  idx �� ������Ŵ(���� �ڸ��� ����)
				// -> ������ ������ ���·� ���� ū �� ã�� ���̹Ƿ�
	        	if(max < number.charAt(j)) {
	        		max = number.charAt(j); 
	        		idx = j + 1; 
	        	}
			}			
			answer.append(max);
		}
	    return answer.toString();
    }
	
}
