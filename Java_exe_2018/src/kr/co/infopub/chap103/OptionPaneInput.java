package kr.co.infopub.chap103;
import javax.swing.JOptionPane;
public class OptionPaneInput {

	public static void main(String[] args) {
		
		String str  =
		  JOptionPane.showInputDialog("����ϰ� ���� ������ ��������");
		JOptionPane.showMessageDialog( null , str);//dialogbox
		
		int yesOrNo=
			JOptionPane.showConfirmDialog(  null,"choose one", 
				   "Title: choose one", JOptionPane.YES_NO_OPTION);         
		                                                                            
		 if(yesOrNo==JOptionPane.YES_OPTION ){
		     System.out.println("You choose YES_OPTION option");
		 }else {
		     System.out.println("You choose NO_OPTION option");
		 }
		int inform=JOptionPane.showConfirmDialog(  null,"OK or Cancel", 
				   "Title: choose one", JOptionPane.OK_CANCEL_OPTION);    
		int inform1=JOptionPane.showConfirmDialog(  null,"Yes, No, Cancel", 
				   "Title: choose one", JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.exit(1); //console���� gui�� ����ϱ� ����
	}
}
