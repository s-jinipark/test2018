package kr.co.infopub.chap195;
import java.awt.*;  import javax.swing.*;  import javax.swing.border.*;
public class GridTabPanes extends JPanel {
  private static final long serialVersionUID=122454214597L;//JAVA5
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  TextAreaJPanel jPanel1 = new TextAreaJPanel();
  TextAreaJPanel1 jPanel2 = new TextAreaJPanel1();
  TextAreaJPanel2 jPanel3 = new TextAreaJPanel2();
  TextAreaJPanel3 jPanel4 = new TextAreaJPanel3();

  public GridTabPanes() {  inits();     }
  void inits(){
    this.setLayout(new BorderLayout());
    this.add(jTabbedPane1,  BorderLayout.CENTER);//���� JPanel�� ���δ�.
    jTabbedPane1.add(jPanel1, "No Event");
    jTabbedPane1.add(jPanel2,   "Handling ��ü");
    jTabbedPane1.add(jPanel3,   "this");
    jTabbedPane1.add(jPanel4,   "Adapter");
  }
}