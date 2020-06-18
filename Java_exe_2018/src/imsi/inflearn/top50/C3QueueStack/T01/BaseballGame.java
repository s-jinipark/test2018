package imsi.inflearn.top50.C3QueueStack.T01;

import java.util.Stack;

public class BaseballGame {

	
	public static void main(String[] args) {
		String[] strs = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(strs));
	}

	public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        // baseball ? ���� �ƴѰ� ?
        int x = 0;
        int y = 0;
        //for (int i=0 ; i< ops.length ; i++) {
        for (String op : ops ) {
        	switch (op) {
	        	case "C" : // ������ �� ������
	        		stack.pop();
	        		break;
	        	case "D" : // ����
	        		x = stack.pop();
	        		y = x * 2 ;
	        		stack.add(x);
	        		stack.add(y);
	        		System.out.println(">" + y);
	        		break;
	        		// ���� ���� �ʿ� ���� peek() �� ...
	        	case "+" : // ������� ���� �� ��� -> �ٽ� ������� add
	        		x = stack.pop();
	        		y = stack.pop();
	        		stack.add(y); // y ���� �ִ´�
	        		stack.add(x);
	        		stack.add(x+y);
	        		break;
	        	default : 
	        		stack.add(Integer.valueOf(op));
        	}
        }
        
        // ������ ���
        while (!stack.isEmpty()) {
        	sum += stack.pop();
        }
        return sum;
    }
}
