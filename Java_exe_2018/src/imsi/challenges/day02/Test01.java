package imsi.challenges.day02;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		//int[] arr = {2,6,8,14};
		int[] arr = {1,2,3};
		
		int an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public int solution(int[] arr) {
		int answer = 0;
		// max �� ã��
		int max = 0 ; 
		for (int i =0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(">" + max);
		
		// ���� ����
		int condition = 0;
		answer = max;
		
		while (condition <= arr.length) { // ��� ���� ���ǿ� ���� �� ���� 
			//condition = 0;
			int cnt =1;
			for (int i =0 ; i<arr.length ; i++) {
				int tmp = arr[i];
				int j =1;
				while ( tmp <= answer ) {
					if (tmp == answer) {
						condition++;
						break;
					}
					j++;
					tmp = arr[i] * j;
				}
				
			}
			if (condition == arr.length ) break;
			System.out.println(">>" + condition);
			// condition �� �������� ���� ���
			cnt++;
			answer = max * cnt;
			condition = 0;
		}
		
 		return answer;
    }
	// ���� ����
}
