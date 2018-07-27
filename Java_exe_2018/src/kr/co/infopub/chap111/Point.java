package kr.co.infopub.chap111;
public class Point {
	private double x;  //x��ǥ 
	private double y;  //y��ǥ 
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public Point(Point xp){
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
	public boolean equals(Object obj){
		boolean isE=false;
		Point temp=(Point)obj;
		if(temp.getX()==x && temp.getY()==y){
			isE=true;
		}
		return isE;
	}
	public int hashCode(){
		int temp=0;
		temp=((int)this.x+(int)this.y)+37;
		return temp;
	}
}
