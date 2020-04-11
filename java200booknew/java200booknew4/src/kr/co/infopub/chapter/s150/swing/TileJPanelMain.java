package kr.co.infopub.chapter.s150.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TileJPanelMain {
	public  void createAndShowUI()
    {
        JFrame frame = new JFrame("TilePanel Draw ver. 0.8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainp=(JPanel)frame.getContentPane();
        int n=3;//nXn ���� ����� 2 �̻� ���������� 5���ʹ� �׸� Ȯ�� �ӵ��� �ʾ���
        TileJPanel pjp=new TileJPanel(frame,n);
        pjp.setTest(true); //true�� ����� ��� false�� ���� ���
        mainp.add(pjp);
        frame.setSize(16+n*TileUtil.TILESIZE,
        		64+n*TileUtil.TILESIZE);//�⺻���� 16, �޴��� ������ 64�̵��ؼ� ����
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
	    {
	        public void run()
	        {
	        	TileJPanelMain ir=new TileJPanelMain();
	            ir.createAndShowUI();
	        }
	    });
	}
}
