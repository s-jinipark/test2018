package kr.co.infopub.chap192;
import java.awt.*;  import javax.swing.*;  import javax.swing.border.*;
public class GridTabPanes extends JPanel {
  private static final long serialVersionUID=122454214597L;//JAVA5
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  ButtonJPanel jPanel1 = new ButtonJPanel();
  ButtonJPanel2 jPanel2 = new ButtonJPanel2();
  ButtonJPanel3 jPanel3 = new ButtonJPanel3();
  ButtonJPanel4 jPanel4 = new ButtonJPanel4();
  ButtonJPanel5 jPanel5 = new ButtonJPanel5();
  ButtonJPanel6 jPanel6 = new ButtonJPanel6();
  public GridTabPanes() {  inits();     }
  void inits(){
    this.setLayout(new BorderLayout());
    this.add(jTabbedPane1,  BorderLayout.CENTER);//���� JPanel�� ���δ�.
    jTabbedPane1.add(jPanel1, "Button��ġ");
    jTabbedPane1.add(jPanel2,   "Buttonũ��/Anchor");
    jTabbedPane1.add(jPanel3,   "Button Fill");
    jTabbedPane1.add(jPanel4,   "Button Weight");
    jTabbedPane1.add(jPanel5,   "Button InSets");
	jTabbedPane1.add(jPanel6,   "GB Builderes");
  }
}