package kr.co.infopub.chap191;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class BorderFlowJPanel extends JPanel {
  private static final long serialVersionUID=122454214537L;//JAVA5
  JPanel northp = new JPanel();
  JPanel centerp = new JPanel();
  JPanel westp = new JPanel();
  JPanel eastp = new JPanel();
  JPanel southp = new JPanel();
  JLabel titlelb = new JLabel("",JLabel.CENTER);
  JButton jButton1 = new JButton("��  ��");
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton("�λ��");
  JButton jButton4 = new JButton("�ѹ���");
  JButton jButton5 = new JButton("������");
  JButton jButton6 = new JButton("�渮��");
  JButton jButton7 = new JButton("�ڵ���");
  JButton jButton8 = new JButton("��ǻ��");
  public BorderFlowJPanel() {    
	System.out.println(this.getClass().getName()+" Start!!");
	inits();   
  }
  void inits(){
    this.setLayout(new BorderLayout());
	titlelb.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
    titlelb.setBorder(new TitledBorder("Title Label"));
    titlelb.setText("BorderLayout And FlowLayout");
	northp.setLayout(new BorderLayout());
    northp.add(titlelb, BorderLayout.SOUTH);
    this.add(northp, BorderLayout.NORTH);
	centerp.setBorder(new TitledBorder("Center"));
    centerp.add(jButton3);	centerp.add(jButton4);	
	centerp.add(jButton5);	centerp.add(jButton6);
	this.add(centerp, BorderLayout.CENTER);
	jButton2.setText("Add");
	westp.setBorder(new TitledBorder("West"));
	westp.add(jButton2);
    this.add(westp,  BorderLayout.WEST);
	southp.setBorder(new TitledBorder("South"));
    this.add(southp,  BorderLayout.SOUTH);
	eastp.setBorder(new TitledBorder("East"));
    eastp.setLayout(new GridLayout(3,1));
    eastp.add(jButton8);		eastp.add(jButton7);		eastp.add(jButton1);
    this.add(eastp, BorderLayout.EAST);
  }
}
