package kr.co.infopub.chap191;
public class  BorderFlowMain{
	public static void main(String[] args) {
		BorderFlowJPanel bp=new BorderFlowJPanel();//�г�
		StartingJFrame frame=new StartingJFrame();//������
		frame.setMainJpanel(bp);
		frame.setSize(500,300);
		frame.validate();
//		BorderFlowJPanel bp1=new BorderFlowJPanel();//�г�
//		StartingJFrame frame1=new StartingJFrame();//������
//		frame1.setMainJpanel(bp1);
//		frame1.setSize(300,300);
//		frame1.validate();
	}
}
