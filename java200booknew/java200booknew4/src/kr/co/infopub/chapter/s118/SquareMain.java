package kr.co.infopub.chapter.s118;
import java.util.Scanner;
public class SquareMain {
 public static void main(String[] args) {
	System.out.println("3�̻��� ���� �������� �Է��ϼ���.");
	Scanner scann=new Scanner(System.in);
	int n=scann.nextInt();
	MagicSquare magic=null;
	if(n>2 && n%2==1){        // Ȧ�� 
		magic=new OddMagicSquare(n);  // ������ - �θ� Ÿ������ �ڽ��� ������ �� �ִ�.
	}else if(n>2 && n%4==0){
		magic=new FourMagicSquare(n); // ������ - �θ� Ÿ������ �ڽ��� ������ �� �ִ�.
	}else if(n>2 && n%4==2){
		magic=new SixMagicSquare(n);  // ������ - �θ� Ÿ������ �ڽ��� ������ �� �ִ�.
	}else{
		System.out.println("����� ���� �������Դϴ�.");
		return ;
	}
	MagicPrint.print(magic);     // ������- �θ� Ÿ������ �ڽ��� ���� �� �ִ�.
 }
}
