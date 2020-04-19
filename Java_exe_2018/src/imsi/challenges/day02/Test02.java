package imsi.challenges.day02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
		int[] arr = {2,6,8,14};
		//int[] arr = {1,2,3};
		
		int an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public int solution(int[] arr) {
		int answer = 0;
		// @1 - ���ӵ� �ּҰ������ ���ϱ� ���ؼ� ���ϱ� ���� �ּ��� �ϳ��� ���� �ʿ��ϹǷ� 
		// �� ���� �迭�� ù ��° ��ҷ� ���Ѵ�.
		int lcm = arr[0]; // @1
		
		// @2 - �迭�� 2��° ��Һ��� @1 ���� ���� lcm�� ���ϸ� �ּҰ������ ���س�����.
		for(int i=1; i<arr.length; i++) { // @2
			lcm = getLcm(lcm, arr[i]);
		}
		answer = lcm;
 		return answer;
    }

	// @4 - �ּҰ������ ���ϴ� �޼ҵ�
	public int getLcm(int a, int b) { // @4
		if(a<=0 || b<=0) return -1;
		return a * b / getGcd(a, b);
	}
	
	// @3 - �ִ������� ���ϴ� �޼ҵ�
	public int getGcd(int a, int b) { // @3
		int tmp;
		while(b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}
		
		return a;
	}
	// {A, B, C} �� �ִٰ� ��������.
	// A�� B�� �ּҰ������ D��� ��������
	// A, B, C�� �ּҰ������ D, C �� �ּҰ������� ���� �ȴ�.
}
