package kr.co.programmers.lv2.prt34;

import java.util.Stack;

public class Remove_Pairs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Pairs2 rp = new Remove_Pairs2();
		
		String s1 = "baabaa";
		
		int rtn1 = rp.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "cdcd";
		
		int rtn2 = rp.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public int solution(String s) {
		int answer = 0;
		
        Stack<Character> referenceStack = new Stack<Character>();
        
        Stack<Character> movingStack = new Stack<Character>();
        
		// ���� 
		for (int i=0; i<s.length(); i++) {
			referenceStack.push( s.charAt(i) );
		}
		
        while (true) {
            //�̵��ϰ� �� stack�� ����ִٸ� referenceStack char�� �ϳ� �̵���ŵ�ϴ�.
            if(movingStack.isEmpty()) {
                movingStack.push(referenceStack.pop());
            }
            //ù stack�� ���� ������ char�� �̵���Ų stack�� ������ char�� ���� ���ٸ� �� ���� ���� stack���� ���ݴϴ�.
            if(referenceStack.peek() == movingStack.peek()) {
                referenceStack.pop();
                movingStack.pop();
            } 
            //�ٸ��ٸ� �׳� �̵���ŵ�ϴ�.
            else {
                movingStack.push(referenceStack.pop());
            }        
            
            // �� ������ referenceStack�� ����� �� �����ϰ� �˴ϴ�.
            // ���� �� ¦�� �´´ٸ� �ΰ��� stack ��� ����ִ� ��Ȳ�� �� ���̰�,
            // ¦�� ���� �ʴٸ� movingStack�� ���� �ʰ� �˴ϴ�.
            if(referenceStack.isEmpty() && movingStack.isEmpty()) {
                answer = 1;
                break;
            } 
            else if(referenceStack.isEmpty() && !movingStack.isEmpty()) {
                break;
            }
        }
        return answer;
	}     
	// ��Ÿ�� ���� ?? -> 1, 9, 11
}
