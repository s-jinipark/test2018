package kr.co.infopub.chap195;
public class  TextAreaJPanel3Main{
	public static void main(String[] args) {
		TextAreaJPanel3 bp=new TextAreaJPanel3();//�г�-adapter
		StartingJFrame frame=new StartingJFrame();//������
		frame.setMainJpanel(bp);
		frame.setSize(500,400);
		frame.validate();
	}
}
