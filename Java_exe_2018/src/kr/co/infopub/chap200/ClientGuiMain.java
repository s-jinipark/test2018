package kr.co.infopub.chap200;
public class  ClientGuiMain{
	public static void main(String[] args) {
		StartingJFrame frame=new StartingJFrame();//������
		ClientGui bp=new ClientGui(frame, "127.0.0.1", 5420);//�г�
		bp.giveAndTake();
		frame.setMainJpanel(bp);
		frame.setSize(550,400);
		frame.validate();
	}
}