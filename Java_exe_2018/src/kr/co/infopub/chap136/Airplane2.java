package kr.co.infopub.chap136;
public class Airplane2 {

	private String nameOfAirp="C10111";   //����� �̸�
	private int fuel=10000;               //liter
	private int goPerL=10;                //Km/liter  defalut
	public Airplane2(String nameOfAirp,int fuel,int goPerL){
		this.nameOfAirp  = nameOfAirp;   //����� �̸�
		this.setFuel(fuel);
		this.goPerL      = goPerL;   //km/liter  
	 }
	public Airplane2(String nameOfAirp,int fuel){
		this(nameOfAirp,fuel,10);
	}
	public Airplane2(String nameOfAirp){
		this(nameOfAirp,10000,10);
	}
	public Airplane2(){
		this("C10111",10000,10);
	}
	public void setFuel(int fuel){
		if(fuel<1000){
			System.out.println("�����������");
			this.fuel=0;
			return ;
		}
		this.fuel=fuel;
	}  
	public int getFuel() {return fuel;}
	public int getGoPerL() {return goPerL;}
	public String getNameOfAirp() {return nameOfAirp;}
	public String toString(){
		String s="";
		if(fuel>999){
			s="����� �̸�: "+nameOfAirp;
			s+="   ����Ÿ�   : "+goPerL*fuel;
		}else{
			s="�� ������ ����� �� ���� ����� �Դϴ�.";
		}
		return s;
	}
}
