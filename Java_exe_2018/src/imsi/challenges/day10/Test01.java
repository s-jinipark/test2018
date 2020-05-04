package imsi.challenges.day10;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
						

		int[] arr = {1, 1, 1, 1, 1};
		int tgt = 3;
		
		int an = t.solution(arr, tgt);
		
		System.out.println(an);


	}
	// �� �� -> �˻��ؼ�..
	// (����) DFS ����Ž���� �̿��ؼ� ������ Ǯ��� �ߴ�. DFS ������ Stack �Ǵ� ��͸� ���� Ǯ�̰� �����ϴ�. ���� ��͸� �̿��ؼ� ������ Ǯ����.
	// �ᱹ�� �迭�� �ִ� ��Ұ� �ϳ��� ����� �����Ѵٸ�, �迭�� �ε����� ���̶�� ������ �� �ִ�. �ᱹ�� �� ���̿� ���� ��� Ž���ϰ� �ǰ�, 
	// ��� ����� ���� ��� Ž���ϰ� �ȴ�. �Ʒ� �̹����� ���� �� ������ DFS�� Ǯ��� �ϴ� ������ �� �� �� ������ �� ���� ���̴�!
	public int solution(int[] numbers,  int target) {
		int answer = 0;
		
		//return answer;
		return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int index, int num) {
        if(index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return dfs(numbers, target, index + 1, num + numbers[index])
                    + dfs(numbers, target, index + 1, num - numbers[index]);
        }
    }
	
}
