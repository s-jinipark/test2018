package imsi.challenges.day02;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test03 t = new Test03();
		
		//int[] arr = {2,6,8,14};
		//int[] arr = {1,2,3};
		// 2���� �׽�Ʈ �غ���
		int[] arr = {4,18};
		
		int an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public int solution(int[] arr) {
		int answer = 0;
		int a = arr[0];
		int b = arr[1];
		int temp;
		
		// b �� �� ū ���� �ǵ���...
        if( b<a ) {
            temp = a;
            a = b;
            b = temp;
        }
        
        int Lcm = 0; // �ּҰ���� (Least Common Multiple)
        int Gcd = 0; // �ִ����� (Greatest Common Divisor)
        // �� �� a �� b �� �����Ѵ�. �Ŀ� a �� b �� ū ���� ���� ����  b �� �� ū ���� ������ �����. 
        // ���� ����� ���� a �� b �� ����� ��츦 �̸� �����ϰ�, 
        // �Ŀ� for���� ��ġ�鼭 ���ÿ� �������� ��츦 ã��, �ִ������� �ּҰ������ .. �־��ش�.
        if(b%a==0) { // ������ �������ٸ�
        	Gcd = a;
        	Lcm = b;
        } else {
            for(int i=1; i<a; i++) {
                if(a%i==0 && b%i==0) {
                	Gcd = i;
                	Lcm = (a*b)/i;
                }
            }
        }
        answer = Lcm;
 		return answer;
    }


}
