package kr.co.infopub.chapter.s150;
import java.util.Scanner;
public class SongPuzzleMain {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		int n=scann.nextInt();
		System.out.println("2�̻��� ������ �Է��ϼ���.");
		SongPuzzle puzzle=new SongPuzzle(n);  //Ȧ��, ¦���� ��� ���밡��
		//puzzle.makePuzzle(false); // ���� ������ �ʱ�
		puzzle.makePuzzle(true);    // ���� ���̱�
		puzzle.print();
	}
}
