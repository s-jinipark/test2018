package kr.co.infopub.chap198;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalendarJFrameMain {
  public static void main(String[] args) {
    StartingJFrame startFrame =new StartingJFrame();
	CalendarJPanel cp=new CalendarJPanel(startFrame);//JFrame �ѱ��
	startFrame.setMainJpanel(cp);
	startFrame.setSize(new Dimension(550, 400));//JFrame ũ������
	cp.updateUI();
	startFrame.validate();//JFrame ȭ�� ����
  }
}
