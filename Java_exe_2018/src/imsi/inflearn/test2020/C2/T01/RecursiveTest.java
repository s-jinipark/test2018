package imsi.inflearn.test2020.C2.T01;

public class RecursiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ȣ�� �׽�Ʈ (���� ���ϱ�) 
		// N ���� ���ĺ� �߿��� R ���� ������ �� �ִ� ��츦 ��� ���
		
		RecursiveTest t = new RecursiveTest();
		int n = 3;
		int r = 2; // 3�� �߿� 2��
        int[] arr = {1, 2, 3};
		
		t.solution(n, r, arr);
	}
	
	public void solution(int n, int r, int[] arr) {
		// ����		����
		// arr		r ���� �̱� ���� n ���� ��
		// output	���� r ���� ��
		// visited	�ߺ��ؼ� ���� �ʱ� ���� üũ�ϴ� ��

        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        
		getResult(arr, output, visited, 0, n, r);
		
	}
	
	// visited �迭�� �̿��� ����
	// depth : n��  for �� (depth ��° for ��)
	public void getResult(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth >= r) { // �̹� r ���� for ���� ���Դ�
			print(output, r);
		} else {
			
		    for (int i=0; i<n; i++) { // n�� for �� ������ ��
		        if (visited[i] != true) { // ������ �ʾҴ�
		            //visited[i] = true;
		            output[depth] = arr[i]; 
		            visited[i] = true; // i �� ���� ���Ծ�
		            getResult(arr, output, visited, depth + 1, n, r);  // ���� for �� ����    
		            // depth ��°�� i �� �ִ� ��� ��츦 �̹� �� ��� ����
		            output[depth] = 0; // �� ���� ��� ��
		            visited[i] = false;; // �ڿ��� ���� �Ǵϱ�...
		        }
		    }
		}
	}
    // �迭 ���
    public void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}
