package kr.co.programmers.lv1.prt3;

import kr.co.programmers.lv1.prt2.Person_Give_Up_Math;

public class Kth_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kth_Number kn = new Kth_Number();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { 
				{2, 5, 3 }, // 2��°���� 5��°���� �ڸ� �� ����, �� ��° ����
				{4, 4, 1 }, // 4��°���� 4��°���� �ڸ� �� ����, ù ��° ����
				{1, 7, 3 } }; // 1��°���� 7��°���� �ڸ� �� ����, �� ��° ����
		
		int[] answer1 = kn.solution(array, commands);
	}

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        
        
        return answer;
    }
    
}
