package kr.co.infopub.chap020;
import javax.swing.*;
import java.awt.*;
public class Hello4Applet extends JApplet{
	private static final long serialVersionUID=122454214237L;//JAVA5
	public void init() {
	}
	public void start() {
	}
	public void paint(Graphics g){
		super.paint(g);//���������� ����.
		g.drawString("�ȳ��ϼ���!! JAVA�� ���ô�.",50,50);
	}
}
