package imsi.challenges.day13;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		int n = 4;
		int[][] co = {
				{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}
		};
		int an = t.solution(n, co);
		
		System.out.println(an);

	}
	
    public int solution(int n, int[][] costs) {
        int answer = 0;
        // ������ i�� ����, costs[i][0] �� costs[i][1]���� �ٸ��� ����Ǵ� �� ���� ��ȣ�� ����ְ�, 
        // costs[i][2]���� �� �� ���� �����ϴ� �ٸ��� �Ǽ��� �� ��� ����Դϴ�.

        // ���� ����� ��ǥ�̴�, ���� ������ ����
        print(costs);
        System.out.println("=====");
        Arrays.sort(costs, Comp);
        print(costs);
        
        // ����� ���� �� �ٸ� ���� �Ǽ��ϰ� ��� ���� ����Ǹ� �Ǽ��� ���߰� ����� ��ȯ�ϸ� ��
        
        boolean[] bridge = new boolean[costs.length];  // �ٸ��� �Ǽ� �ߴ���
        boolean[] visit = new boolean[n];	// ���� �湮�ߴ���
        visit[costs[0][0]] = true; // �ּ� ����� �ٸ��� ���� �̾� ��
        visit[costs[0][1]] = true;
        bridge[0] = true;
        
        answer = costs[0][2]; // ó�� �Ǽ��� �ٸ� ��� �߰�
        int island = 2; // �湮�� ���� ������ üũ
        
        while(island < n) {	// ��� ���� �湮���� ��� �� �̻� �ٸ��� �Ǽ��� �ʿ䰡 ����
        	for (int i=1 ; i<bridge.length ; i++) {
                if(!bridge[i] && ((visit[costs[i][0]]&&!visit[costs[i][1]])||(visit[costs[i][1]]&&!visit[costs[i][0]]))) {
                    bridge[i] = true;
                    visit[costs[i][0]] = true;
                    visit[costs[i][1]] = true;
                    island++;
                    answer+=costs[i][2];
                    break;
                }
        	}
        }
        return answer;
    }
    
    Comparator<int[]> Comp = new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return o1[2] - o2[2];
		}
    };
    
    public void print(int[][] p) {
    	for (int i=0; i< p.length ; i++) {
    		System.out.println(">" + p[i][0] + " / "
    				+ p[i][1] + " / " + p[i][2] );
    	}
    }

} 
