package kr.co.infopub.chap014;
public class Argument1Main {

	public static void main(String[] args) {
		int myMoney=500;
		int cups=coffee(myMoney,300);
		printCoffee(cups);
		
		int noChange=400;
		coffeeIn(noChange);
		System.out.print("main: ");
		System.out.println("noChange�� "+noChange+"��.");
		
		String sChange="hyonny";
		coffeeIn(sChange);
		System.out.print("main: ");
		System.out.println("sChange�� "+sChange+"��.");
	}//main

	public static void coffeeIn(int money){
		money+=300;//money=money+300;
		money/=50;//money=money/50;
		System.out.print("method coffeeIn: ");
		System.out.println("money�� "+money+"���̴�.");
		//System.out.printf("money�� %d���̴�.",money);
	}//coffeeIn

	public static void coffeeIn(String money){
		money=money.replace('o','z');
		money+="�ȳ�";
		System.out.print("method coffeeIn: ");
		System.out.println("money�� "+money+"��.");
	}//coffeeIn

	public static int coffee(int money,int coffeeValue){
		if(coffeeValue<=100){
			return -1;
		}
		int cups=-1;   //���ܳ��ñ� �غ�
		if(money > 0){
			cups=money/coffeeValue;
		}
		return cups;
	}//coffee
	
	public static int coffee(int money){
		return coffee(money,200);
	}//coffee
	
	public static void printCoffee(int cups){
		if(cups>0){
			System.out.println("Ŀ�� "+cups+"�� �Դϴ�.");
			//System.out.printf("Ŀ�� %d�� �Դϴ�.",cups);
		}else{
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
	}//printCoffee
}