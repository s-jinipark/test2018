package imsi.inflearn.top50.C1StringArray.T10;

public class PlusOne {

	
	public static void main(String[] args) {
		int[] digits = {1,2,3};
//		int[] digits = {9,9,9};
		int[] result = plusOne(digits);
		for(int i:result)
			System.out.println("val: "+i);
	}
	public static int[] plusOne(int[] digits) {

		// �ڿ��� ���� +1 
		// overflow �߻� �� ���ڸ��� +1
		// �� �տ��� overflow �߻� �� �迭 ũ�� ����
		int o_f = 0;
		for (int i=digits.length -1 ; i>=0 ; i--) {
			System.out.println(">" + digits[i]);
			// ù��°
			if (i==digits.length -1) {
				if (digits[i] + 1 >9) {
					digits[i] = 0;
					o_f = 1;	
				} else {
					digits[i]++;
				}
			} else { // �� ��° ����
				if ((digits[i] + o_f) >9 ) {
					digits[i] = 0;
					o_f = 1;
				} else {
					digits[i]  += o_f;
					o_f = 0;
				}
			}

		}
		// ������ �� �������� o_f �� 1 �� ���
		// �迭�� �÷� �־�� ��
		if (o_f > 0) {
			int[] answer = new int[digits.length+1];
			answer[0] = o_f;
			for (int i=1; i<answer.length ; i++) {
				answer[i] = digits[i-1];
			}
			return answer;
		} else {
			return digits;
		}
	    //return digits;
	}
}
