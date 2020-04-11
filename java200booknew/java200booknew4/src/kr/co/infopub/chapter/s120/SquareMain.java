package kr.co.infopub.chapter.s120;
import java.util.Scanner;
public class SquareMain {
 public static void main(String[] args) {
    System.out.println("3�̻��� ���� �������� �Է��ϼ���.");
    Scanner scann=new Scanner(System.in);
    int n=scann.nextInt();
	try(FactoryMagic magicFactory=FactoryMagic.getInstence()) { // autoclosable()
	  IMagicSquare magic = magicFactory.getMagicSquare(n);    // 3,4,6�� ���丮�� ó���Ѵ�.
	  MagicPrint.print(magic);                                // ��� �������� ����Ѵ�.
	} catch (MagicException e) {                              // ����� ���� ����
	  System.out.println(e);                 
    } catch (Exception e1) {                                  // ������ ����� �ڵ� close()
  }
 }
}
