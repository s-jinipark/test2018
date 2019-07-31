package kr.co.programmers.lv2.prt40;

import java.util.Stack;

public class Steel_Stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Steel_Stick ss = new Steel_Stick();
		
		String s1 = "()(((()())(())()))(())";
		int rtn1 = ss.solution( s1  );
		System.out.println("[1] > " + rtn1);
			
		
	}

	public int solution(String arrangement) {
        int answer = 0;
        
        /*
                  ���� ó�� �ؾ� �� ����, �������� '()'�� ��ȣ�� ������� �ʴ� ������ ǥ������� �Ѵ�. 
                  ���ÿ� ( �Ǵ� )�� �־�� �ϴµ� �������� () ����̸� ���� ó���� �ϴµ� ����� ���� ���̴�. 
                  
                  ���� replace �Լ��� ����Ͽ� () �� 1 �� �ٲ��.

                  �Ŀ� String�� �о ���ε�, 3���� ��Ģ�� ���ߴ�.

        1. '(' �� ������ ���ÿ� Push() ���ش�.

        2. '1'�� ������ ������ ������ ��ŭ ���信 �����ش�.

        3. ')'�� ������ pop()�� �ؼ� ¦�� �����ְ� 1�� �����ش�.
        */
        
        //String temp = arrangement.replaceAll("()", "1");
        String temp = arrangement.replace("()", "1"); // replaceAll �� �̻���
        System.out.println(temp);
        
        Stack<Character> a = new Stack<Character>();
        
        for (int i=0; i < temp.length() ; i++) {
        	char temp_c = temp.charAt(i);
        	if (temp_c == '(') {
        		a.push(temp_c);
        	} else if (temp_c == '1') {
        		answer += a.size();
        	} else if (temp_c == ')') {
    		   answer += 1;  // ����
               a.pop();
        	} 
        }
        
        return answer;
    }
    
}
