package kr.co.infopub.chap193;
public class  TextAreaJPanel1Main{
	public static void main(String[] args) {
		TextAreaJPanel1 bp=new TextAreaJPanel1();//�г�-implements
		//TextAreaJPanel2 bp=new TextAreaJPanel2();//�г�-this
		//TextAreaJPanel3 bp=new TextAreaJPanel3();//�г�-adapter
		StartingJFrame frame=new StartingJFrame();//������
		frame.setMainJpanel(bp);
		frame.setSize(500,400);
		frame.validate();
	}
}
