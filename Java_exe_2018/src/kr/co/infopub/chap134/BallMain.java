package kr.co.infopub.chap134;
public class BallMain {

	public static void main(String[] args) {
		Ball b1=new Ball();
		b1.printName();
		System.out.println(b1.getName());
		BaseBall bs1=new BaseBall();
		bs1.printName();
		bs1.printSize();
		SockerBall cs1=new SockerBall();
		cs1.printName();
		cs1.printSize();
		
		System.out.println("----------");
		Ball b2= new BaseBall();//reference ������
		BaseBall b3= new BaseBall();//reference ������
		print(b2);
		print(b3);//argument ������
	}
	public static void print(Ball b){//argument ������
		b.printName();//overring--> method ������
		if(b instanceof BaseBall){//instance�� ���?
			BaseBall bb=(BaseBall)b;//casting
			bb.printSize();
		}else if(b instanceof SockerBall){
			SockerBall bb=(SockerBall)b;//casting
			bb.printSize();
		}
	}
}
