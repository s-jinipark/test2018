package kr.co.infopub.chap195;
public class  GridTabPanesMain{
	public static void main(String[] args) {
		GridTabPanes bp=new GridTabPanes();//�г�
		StartingJFrame frame=new StartingJFrame();//������
		frame.setMainJpanel(bp);
		frame.setSize(600,400);
		frame.validate();
	}
}
