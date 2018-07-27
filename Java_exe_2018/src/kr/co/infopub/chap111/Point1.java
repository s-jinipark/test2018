package kr.co.infopub.chap111;
public class Point1 {
	private double x;  //x��ǥ 
	private double y;  //y��ǥ 
	public Point1(double x,double y){
		this.x=x;
		this.y=y;
	}
	public Point1(Point1 xp){
		this.x=xp.getX();
		this.y=xp.getY();
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double d) {
		x = d;
	}
	public void setY(double d) {
		y = d;
	}
	public String toString(){
		return "("+x+" , "+y+")";
	}
}
