package kr.co.infopub.chap143146;

 public class CarUtil {
 	public static void print(Car car){
 		//�޼���
 		car.show();//1-->?
 		System.out.println(car.speed());//2-->
 	}
 	public static void showInstance(Car car){
         if(car instanceof Bus){
         	Bus b=(Bus)car;
         	b.move();
         }else if(car instanceof Truck){
         	Truck t=(Truck)car;
         	t.tone();
         }
 	}
 }
