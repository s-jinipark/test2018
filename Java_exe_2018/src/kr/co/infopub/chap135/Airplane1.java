package kr.co.infopub.chap135;
public class Airplane1 {

	private String nameOfAirp="C10111";   //����� �̸�
	private int fuel=10000;               //liter
	private int goPerL=10;                //Km/liter  defalut
	public Airplane1(String nameOfAirp,int fuel,int goPerL){
		this.nameOfAirp  = nameOfAirp;   //����� �̸�
		this.fuel        = fuel;   //liter
		this.goPerL      = goPerL;   //km/liter  
	 }
	public Airplane1(String nameOfAirp,int fuel){
		this.nameOfAirp  = nameOfAirp;   //����� �̸�
		setFuel(fuel);
		this.goPerL      = 10;   //km/liter  
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
