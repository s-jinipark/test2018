package kr.co.infopub.chap198;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class CalendarJPanel extends JPanel implements ActionListener{
    private static final long serialVersionUID=12234216636645L;//JAVA5
	JFrame main;
    HCalendar h;
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenuFile = new JMenu("File");
    JMenuItem jMenuFileExit = new JMenuItem("Exit");
    JMenu jMenuHelp = new JMenu("Help");
    JMenuItem jMenuHelpAbout = new JMenuItem("About");
    JLabel statusBar = new JLabel();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JButton jButton1 = new JButton("After ");
    JButton jButton2 = new JButton("Before");
    JLabel jLabel1 = new JLabel();
	BorderLayout borderLayout2 = new BorderLayout();
	public CalendarJPanel(JFrame main) {
		super();
		this.main=main;
		inits();
	}
	public void inits() {//�ݵ�� ����
		jPanel1.setLayout(borderLayout2);
		borderLayout2.setHgap(5);
		borderLayout2.setVgap(5);
		jPanel2.setLayout(new FlowLayout());
		jPanel2.setPreferredSize(new Dimension(10, 50));
		jButton1.setFont(new java.awt.Font("SansSerif", 1, 20));
		jButton2.setFont(new java.awt.Font("SansSerif", 1, 20));
		jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20));
		jLabel1.setText("Calendar");
		jMenuFile.add(jMenuFileExit);
		jMenuHelp.add(jMenuHelpAbout);
		jMenuBar1.add(jMenuFile);
		jMenuBar1.add(jMenuHelp);
		h=new HCalendar(jPanel3);               //Į����
		this.jLabel1.setText(h.getCaltext());   //
		jPanel1.add(jPanel2, BorderLayout.NORTH);
		jPanel1.add(h.getCalandarPanel(),  BorderLayout.CENTER);
		jPanel2.add(jButton2);//FlowLayout
		jPanel2.add(jLabel1);//FlowLayout
		jPanel2.add(jButton1);//FlowLayout
		this.setLayout(new BorderLayout());
        this.add(jPanel1, "Center");
		main.setJMenuBar(jMenuBar1);//
		addListeners();
	}
	public void addListeners() {//�ݵ�� ���� -------�ʹޱ�-------//
		jMenuHelpAbout.addActionListener(this);
		jMenuFileExit.addActionListener(this);
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jMenuFileExit){
			main.dispose();//������ �ڿ�ȸ��
			System.exit(0);//���α׷� ��
		}else if(e.getSource()==jMenuHelpAbout){
			AboutDialog dialog=new AboutDialog(main,"����޷�",true);// ���
			dialog.setVisible(true);//dialog.show();
		}else if(e.getSource()==jButton2){
			  h.allInit(-1);//1�� ��
			  this.jLabel1.setText(h.getCaltext());//�� ��
		}else if(e.getSource()==jButton1){
			  h.allInit(1);//1�� ��
			  this.jLabel1.setText(h.getCaltext());//�� ��
		}
   }
}
