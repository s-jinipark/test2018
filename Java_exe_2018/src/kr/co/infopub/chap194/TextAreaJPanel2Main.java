package kr.co.infopub.chap194;
public class  TextAreaJPanel2Main{
	public static void main(String[] args) {
		TextAreaJPanel2 bp=new TextAreaJPanel2();//�г�-this
		//TextAreaJPanel3 bp=new TextAreaJPanel3();//�г�-adapter
		StartingJFrame frame=new StartingJFrame();//������
		frame.setMainJpanel(bp);
		frame.setSize(500,400);
		frame.validate();
	}
}
