package imsi.inflearn.top50.C1StringArray.T20;

import java.util.*;

public class MissingRanges2 {

	public static void main(String[] args) {

		int[] nums = {2,3,5,50,75};
		int lower=0, upper=99;
		System.out.println(solve(nums, lower, upper));
//		[0->1, 4, 6->49, 51->74, 76->99]

	}
	public static List<String> solve(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return result;
        }
        int from  = 0;
        int to = 0; 
        
        // nums �� ������� from �� to �� �־ �˻�
        // ��, �� �հ� �� �ڴ�  { lower, �Ǿ� } {�ǵ�, upper} �� ���� ó�� 
        for (int i=0 ; i<nums.length; i++) {
        	
        	System.out.println(">" + nums[i] );
        	
        	if (i==0) { // ��ó��
        		from = lower;
        		to = nums[i];
            	// ���
            	if (to - from >1) {
            		System.out.println((from) +"->"+ (to-1) );
            		result.add((from) +"->"+ (to-1) );
            	} else if (to - from ==1){
            		System.out.println(from);
            		result.add(from+"");
            	}
        	} else {
        		from = nums[i-1];
        		to = nums[i]; // curr
            	// ���
            	if (to - from >2) {
            		System.out.println((from+1) +"->"+ (to-1) );
            		result.add((from+1) +"->"+ (to-1) );
            	} else if (to - from ==2){
            		System.out.println(from +1);
            		result.add((from +1)+"");
            	}
        	}
        }
        // �� ������ ó��
        // (����)�迭�� �� �������� to �� ��� ����
        from = to;
        to = upper;
    	// ���
    	if (to - from >1) {
    		System.out.println((from+1) +"->"+ (to) );
    		result.add((from+1) +"->"+ (to) );
    	} else if (to - from ==1){
    		System.out.println(to);
    		result.add(to+"");
    	}
        	
        return result;
    }

}
