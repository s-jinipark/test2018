package kr.co.jungsuk.ex.e05;

public class P03_1 {
	// [5-3] �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50 };
		int sum = 0;
		
		//�ۼ�
		for (int i =0; i< arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum =" + sum);
	}

}
