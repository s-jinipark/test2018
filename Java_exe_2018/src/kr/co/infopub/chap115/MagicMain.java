package kr.co.infopub.chap115;
public class MagicMain
{
	public static void main(String[] args) 
	{
		int width=3;
		Magic m=new Magic(width);
		m.make();
		int[][] magic=m.getMagic();
		
		MagicUtil.magicPrint(magic);  //������ ���
		MagicUtil.magicPrint(MagicUtil.magicSum(magic));//�� ������� ������?
		System.out.println(MagicUtil.isMagicSuccess(MagicUtil.magicSum(magic)));
		int [] a={3,3,3,3,3,3,3,3,3,3};
		int [] b={3,3,3,3,3,3,3,5,3,3};
		System.out.println(MagicUtil.isMagicSuccess(a));
		System.out.println(MagicUtil.isMagicSuccess(b));
		System.out.println("====================================================");
		m.reSet(5);
		m.make();
		magic=m.getMagic();
		MagicUtil.magicPrint(magic);  //������ ���
	}
}
