package kr.co.jungsuk.ch09;
import java.util.Scanner;
import java.io.File;

class P36_ScannerEx2 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("data2.txt"));
		//[2] ���� �� ã�Ƽ� �ӽ÷� ����
		Scanner sc = new Scanner(new File("C:\\tmp\\test\\data2.txt"));
		
		int sum = 0;
		int cnt = 0;

		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}

		System.out.println("sum="+sum);
		System.out.println("average="+ (double)sum/cnt);
	}
}
