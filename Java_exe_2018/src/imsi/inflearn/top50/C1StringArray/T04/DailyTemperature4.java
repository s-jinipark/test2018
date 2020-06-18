package imsi.inflearn.top50.C1StringArray.T04;

import java.util.Stack;


public class DailyTemperature4 {

	public static void main(String[] args) {
		int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = dailyTemperatures(nums);

		System.out.println("====result===");
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
	public static int[] dailyTemperatures(int[] temperatures) {
		//1
		Stack<Integer> stack = new Stack<>();
		int[] ret = new int[temperatures.length];
		
		//2 �µ� �迭 ��ŭ loop
		for (int i=0 ; i<temperatures.length; i++) {
			// �迭�� ���ٰ� ������ check , ū ���� ���� ��� ���ÿ��� ������
			while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]) {
				// resulet[0] = 1-0
				int index = stack.pop();
				ret[index] = i - index;
			}
			// �ƴ� ��� ���ÿ� ���� �ִ´�
			stack.push(i);
		}

	    return ret;
	}
	
}
