package kr.co.infopub.chap080;
public class Car 
{
   //����ʵ� Field
   private int speed = 0;
   private int direction = 0;
   //������  Constructor
   public Car() 
   {
   }
   //�޼��� Method
   public void speedUp() 
   {
     speed+=5;
   }
   public void speedDown() 
   {
     speed-=5;
   }
   public int curSpeed(){
	return speed;
   }
   public void turnDirect(int dir) 
   {
     direction+=dir;
   }
   public int curDirect(){
	return direction;
   }
}