package kr.co.infopub.chapter.s148;
public class SudokuMain {
	public static void main(String[] args) {
		Sudoku sd=new Sudoku(3);
		sd.setShuffle(false);    // ���� ���� ���δ�.
		//sd.setShuffle(true);    // ���´�.
		sd.init();
		sd.shuffle();
		sd.print();
	}
}
