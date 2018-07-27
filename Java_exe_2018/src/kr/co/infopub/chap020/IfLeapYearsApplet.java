package kr.co.infopub.chap020;
import javax.swing.*;
import java.awt.*;
public class IfLeapYearsApplet extends JApplet{
	private static final long serialVersionUID=122454214237L;//JAVA5
	public void init() {
	}
	public void start() {
	}
	public void paint(Graphics g){
		super.paint(g);//���������� ����.
		for(int year=1998;year<2006;year++){
			boolean yearTF=false;
			if( (0 == (year % 4) && 0 != (year %100)) || 
				 0 == year%400 ){
				yearTF = true;
			}else{
				yearTF = false;
			}

			if(yearTF){
				g.drawString(year+"�� �����Դϴ�.",50,50+(year-1997)*20);
			}else{
				g.drawString(year+"�� ������ �ƴմϴ�.",50,50+(year-1997)*20);
			}
		}
	}
}
