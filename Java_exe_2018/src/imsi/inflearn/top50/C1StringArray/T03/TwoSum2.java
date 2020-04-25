package imsi.inflearn.top50.C1StringArray.T03;

import java.util.*;

public class TwoSum2 {

	public static void main(String[] args) {
		//int[] nums = {2,7,11,15};
        //int target =9;

		int[] nums = {3, 2, 4};
        int target =6;
        
        TwoSum2 a = new TwoSum2();
        int[]  result = a.solve(nums, target);
        for(int i : result)
        	System.out.println(i);
	}
	
	public int[] solve(int[] nums, int target) {

		int[] result = new int[2];
//START--------------------------------------------------		
		// �迭 ��ü Ž��
//		for (int i=0; i<nums.length -1 ; i++) {
//			for (int j=i+1 ; j<nums.length ; j++) {
//				if (nums[i]+nums[j] == target) {
//					result[0] = i;
//					result[1] = j;
//					return result; // ����
//				}
//			}
//		}
		
		// [2]
		// ���� key ��, �ε����� value �� �ؽø��� ����� �ش�
		// �ӵ� ������ ����
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i=0 ; i<nums.length ; i++) {
//			map.put(nums[i], i); // ����
//		}
//		
//		for (int i=0; i<nums.length ; i++) {
//			int comp = target - nums[i];
//			if ( map.containsKey(comp) 
//					&& map.get(comp) != i // �̰� ������ 0 ����
//					) {
//				result[0] = i;
//				result[1] = map.get(comp);
//				break; // ����
//			}
//		}
		

		// [3]
		// �ؽ� ���� �ʱ�ȭ�ϴ� ������ ���ÿ� ���ǿ� �´� ���� ã���� ����
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i<nums.length ; i++) {
			int comp = target - nums[i];
			if ( map.containsKey(comp) ) {
				result[0] = i;
				result[1] = map.get(comp);
				return result;

			}
			map.put(nums[i], i);
		}
		// ���� : https://johnmarc.tistory.com/80
//END  --------------------------------------------------
		return result;
		
	}
}
