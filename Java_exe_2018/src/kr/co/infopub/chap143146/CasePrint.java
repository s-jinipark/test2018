package kr.co.infopub.chap143146;

 public class CasePrint {
 
 	public static void main(String[] args) {
 		Car car1=new Car();
 		Bus bus1=new Bus();//    
 		Car car2=new Bus();// reference ������
 		
 		CarUtil.print(car1);
 		CarUtil.print(bus1);
 		CarUtil.showInstance(bus1);
 	}
 }
