package kr.co.infopub.chapter.s150;
public class FifteenPuzzleMain {
	public static void main(String[] args) {
		// 15 Game �׽�Ʈ 
		int[][]m={{1,2,3,4},
		{5,6,0,7},
		{9,10,11,8},
		{13,14,15,12}};
		FifteenPuzzle puzzle=new FifteenPuzzle(m);  // ¦���� ���� ����
		puzzle.testPuzzles();    // �׽�Ʈ  �迭 m 15 Game ����? 
		puzzle.print();
		// 15 Game ����� 
		FifteenPuzzle puzzle2=new FifteenPuzzle();  // ¦���� ���� ����
		//puzzle2.makePuzzle(false); // ���� ������ �ʱ�
		puzzle2.makePuzzle(true);    //���� ���̱�
		puzzle2.print();
	}
}
