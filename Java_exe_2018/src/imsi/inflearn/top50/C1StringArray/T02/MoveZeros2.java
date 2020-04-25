package imsi.inflearn.top50.C1StringArray.T02;
/*
 * Time Complexity: O(n)
 * ����Ÿ  int[] nums = {0,3, 2, 0, 8, 5};
 * �� for������ ��� ��ȸ�ؾߵǴϱ�
 * Space Complexity : O(1). 
 * �־��� �������� int currentIndex = 0;
 * ����� �ϳ��� ��������ϱ�
 */
public class MoveZeros2 {

	public static void main(String args[]) {

		int[] nums = { 0, 3, 2, 0, 8, 5 };

		int[] num_tmp = new int[nums.length];
		
		// ���� 0 �� �ȴ� ���� ���� �迭�� ��´�
		// index �� ����Ѵ�
		// �ش� index ���� �� 0 �� ���� �ִ´� (�迭.length ����)
		
		// 0 ���� ���õǾ� ����
		// 0 �ƴ� �� -> ������� ����

		int cnt = 0;
		for (int i=0; i< nums.length ; i++) {

			if (nums[i] != 0) {
				// ����
				num_tmp[cnt] = nums[i];
				cnt ++;
			}
		}
		
		// print
		for (int i=0; i< num_tmp.length ; i++) {
			System.out.print(num_tmp[i] + " ");
		}
		
	}
}
