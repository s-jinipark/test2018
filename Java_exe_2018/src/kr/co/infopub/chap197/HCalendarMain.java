package kr.co.infopub.chap197;
import java.awt.*;
import javax.swing.*;
public class HCalendarMain {
  public static void main(String[] args) {
    StartingJFrame startFrame =new StartingJFrame();
	JPanel cp=new JPanel();//JFrame �ѱ��
	HCalendar hcal=new HCalendar(cp);
	startFrame.setMainJpanel(cp);
	startFrame.setSize(new Dimension(550, 400));//JFrame ũ������
	cp.updateUI();
	startFrame.validate();//JFrame ȭ�� ����
  }
}
