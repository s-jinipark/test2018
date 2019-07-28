package imsi.suji.test2018.A1.q4;

public class AggregateRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
		int[][] inputData = loadData();
		printInput(inputData);
		Aggregate aggregate = new Aggregate();

		// �κ� �迭�� ������ ���ϴ� ���
		int numberOfSubArrays = aggregate.getNumberOfSubArrays(inputData.length);
		printNumberOfSubArrays(inputData.length, numberOfSubArrays);

		// �ִ밪�� ã�� ���
		int maximumValue = aggregate.getMaximumValue(inputData);
		printMaximumValue(inputData.length, maximumValue);
	}

	private static int[][] loadData() {

		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////

//		int[][] inputData = { 
//				{ -1, 0, 7, 9 }, 
//				{ -6, 2, -3, 5 }, 
//				{ 3, -6, 0, -5 }, 
//				{ 7, 8, -7, 2 } 
//			};

		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////

		     int[][] inputData =  {
		       {1, -3, 0, 2, 5},
		       {-3, 0, 8, -3, 7},
		       {9, -1, -2, 6, 0},
		       {-2, -5, 9, 7, 6},
		       {3, 2, 4, 7, -5}
		     };

		return inputData;
	}

	private static void printInput(int[][] inputData) {
		printLineInitial();
		for (int i = 0; i < inputData.length; i++) {
			for (int j = 0; j < inputData.length; j++) {
				System.out.print(inputData[i][j] + " ");
			}
			System.out.println();
		}
		printLine();
	}

	private static void printNumberOfSubArrays(int size, int numberOfSubArrays) {
		System.out.print("[" + size + "x" + size + "�迭�� �κ� �迭 ����]: ");
		if (numberOfSubArrays == 0) {
			System.out.println("������� �����ϴ�.");
		} else {
			System.out.println(numberOfSubArrays + "��");
		}
		printLine();
	}

	private static void printMaximumValue(int size, int maximumValue) {
		System.out.print("[" + size + "x" + size + "�迭�� �κ� �迭���� �ִ���]: ");
		if (maximumValue == 0) {
			System.out.println("������� �����ϴ�.");
		} else {
			System.out.println(maximumValue);
		}
		printLine();
	}

	private static void printLineInitial() {
		System.out.println("[�ʱ� �Է� ������]");
	}

	private static void printLine() {
		System.out.println("--------------------------------------------------------------------");

	}

}
