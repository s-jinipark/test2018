package imsi.inflearn.test2020.C2.T01;

public class RecursiveTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ȣ�� �׽�Ʈ (���� ���ϱ�) 
		// N ���� ���ĺ� �߿��� R ���� ������ �� �ִ� ��츦 ��� ���
		
		RecursiveTest2 t = new RecursiveTest2();
		int n = 3;
		int r = 2; // 3�� �߿� 2��
        int[] arr = {1, 2, 3};
		
		t.solution(n, r, arr);
	}
	
	public void solution(int n, int r, int[] arr) {

        // ���� 
		// 3���߿� 2�� �̴� ����̹Ƿ� 2�� for ������ �Ǳ� ��
        for (int i=0 ; i<arr.length ; i++) {
        	for (int j=0 ; j<arr.length ; j++) {
        		if (i != j) { // ���� ���� ����
        			System.out.println(">" + arr[i] + "/" + arr[j]);
        		}
        	}
        }
        // ������ 3��, 4������ ����  for ���� 3��, 4������ ��ø��. 
        // ���� ��� �����ϴ� if �� && �� ��� �ٿ� ��
        // -> �׷��� ��ͷ� ..
        
		// ����		����
        // -------- --------------------
		// arr		r ���� �̱� ���� n ���� ��
		// output	���� r ���� ��
		// visited	�ߺ��ؼ� ���� �ʱ� ���� üũ�ϴ� ��

        int[] output = new int[r];
        boolean[] visited = new boolean[n];
        
        getResult(arr, output, visited, 0 , n, r);
        
	}
	
	public void getResult(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth >= r) { // �� ����
			print(output);
		} else {
			// arr ���� �ϳ��� �̾ƾ�
//			for (int i=0 ; i<n ; i++) { // n�� �߿��� �̴� �� �̹Ƿ�
//				//output[i] = arr[i]; // ������
//				output[depth] = arr[i]; // [2] **
//				visited[i] = true; //�����ٴ� ǥ��
//				// ���� �ڸ�
//				getResult(arr, output, visited, depth+1, n, r);
//				// ����� ���� �Դٴ� ���� �������� �� �� �ִ� �� �� �� �ڶ�� ���
//				visited[i] = false; 
//			}
			// ���� ���� �ϴ�  1 1 �� ���� => �� ���� �༮�� �� �־�� ��
			// [3]
			for (int i=0 ; i<n ; i++) { // n�� �߿��� �̴� �� �̹Ƿ�
				if ( visited[i] == false) { //[3] **
					output[depth] = arr[i]; // [2] **
					visited[i] = true; //�����ٴ� ǥ��
					// ���� �ڸ�
					getResult(arr, output, visited, depth+1, n, r);
					// ����� ���� �Դٴ� ���� �������� �� �� �ִ� �� �� �� �ڶ�� ���
					visited[i] = false; 
				}
			}
		}
	}

    // �迭 ���
    public void print(int[] arr) {
        for (int i = 0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}
