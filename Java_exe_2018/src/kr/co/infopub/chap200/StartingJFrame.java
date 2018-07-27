package kr.co.infopub.chap200;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StartingJFrame extends JFrame {
  private static final long serialVersionUID=122454214237L;//JAVA5
  private JPanel mainp;
  public StartingJFrame() {
	System.out.println(this.getClass().getName()+" Start!!");
    inits();//JFrme�� �⺻����� ���̱� �׸��� �߾ӿ� ����
  }
  private void inits() {
	//--------------�ʼ�---------------//
    mainp = (JPanel) this.getContentPane();
    mainp.setLayout(new BorderLayout());//�߾��� ����ϱ� ���ؼ�
    this.setSize(new Dimension(400, 300));// this.setSize(400,300)//ũ��
    initFrame();//�߾ӿ� ���̱�
	//------------Ÿ��Ʋ----------------//
	this.setTitle(this.getClass().getName());//JFrame�� �̸� ���̱�
  }
  public  void addListeners(){//JFrame�� ���õ� ������
	//-------�ʹޱ�-------//
  }
  private void initFrame(){//�߾ӿ� ����
    Dimension monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    if (frameSize.height > monitorSize.height) {
        frameSize.height = monitorSize.height;
      }
    if (frameSize.width > monitorSize.width) {
      frameSize.width = monitorSize.width;
    }
    int locationX=(monitorSize.width - frameSize.width) / 2;
    int locationY=(monitorSize.height - frameSize.height) / 2;
    this.setLocation(locationX, locationY);
    this.setVisible(true);
	enableEvents(AWTEvent.WINDOW_EVENT_MASK);//X�� ����
  }
  public void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
	  System.out.println(this.getClass().getName()+" End!!");
      System.exit(1);//���α׷� ������
    }
  }
  public void setMainJpanel(javax.swing.JComponent c){
    mainp.add(c);
  }
}
