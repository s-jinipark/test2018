package kr.co.infopub.chap196;
import java.util.*;
public class  HCalendarConsole{
	int year=2003;
	int month=8;
	Calendar today;//����
	Calendar cal ;
	public HCalendarConsole(){
		today=Calendar.getInstance();//����
		cal = new GregorianCalendar();//����
		calInput();//���ϴ� ����Է�
		calSet();//�޷�
	}
	public void calInput(){
		InputsInt ins=new InputsInt();//���� 165 JOptionPane�� �̿��� Inputs
		int [] a=ins.input(2,0,3000);//���δٸ� �� ��(0~3000������ ��)�� �Է¹޴´�.
		year=a[0];//��
		month=a[1];//��
	}
	public void calSet(){
		cal.set(Calendar.YEAR,year);//��
		cal.set(Calendar.MONTH,(month-1));//��(0~11��)
		cal.set(Calendar.DATE,1);//1���� �ִ� �ָ� ����
		System.out.println(cal.get(Calendar.YEAR)+"��/ "+(cal.get(Calendar.MONTH)+1)+"��");
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//1���� ���� ����
		int j=0,k=0;
		int hopping=0;
		//System.out.println(cal.getFirstDayOfWeek());//�� ���� ù��°�� -->1��
		//System.out.println(dayOfWeek);//DAY_OF_WEEK: SUNDAY 1,MONDAY 2,TUESDAY 3
		//WEDNESDAY 4,THURSDAY 5, FRIDAY 6, SATURDAY 7. 
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		for(int i=cal.getFirstDayOfWeek();i<dayOfWeek;i++){  
			j++;//�Ͽ����̸� j=0, �������̸� 1, ȭ�����̸� 2,...
		}
		hopping=j;
		for(int kk=0;kk<hopping;kk++){//1���� ȭ�����̸� \t\t
			System.out.print("\t");
		}
		for(int i=cal.getMinimum(Calendar.DAY_OF_MONTH);
        i<=cal.getMaximum(Calendar.DAY_OF_MONTH);i++){
		  cal.set(Calendar.DATE,i);
			if(cal.get(Calendar.MONTH) !=month-1){
				  break;
			}//���� �����޷� �Ѿ�� �ʵ���
		    if(hopping==0 && ((i-1)/7)==0){
				System.out.print(i+"\t");
			}else{
				if(cal.get(Calendar.DAY_OF_WEEK)==1){ //�Ͽ����̸�
						System.out.println();//�� �־Ʒ���
				}
				System.out.print(i+"\t");
			}
	    }//for	
    }
}
