package kr.co.infopub.chap189;
import java.util.*;
public  class HTimer extends TimerTask {
	private boolean state=true;
	private long howSeconds=0;//�� milliseconds���� ����� ���ΰ�?
	private int count=0;
	private int from=0;//������� �� milliseconds�� ������ ���ΰ�?
	private int interval=0;//�� milliseconds�������� �ݺ��� ���ΰ�?
	private Timer timer;
	public HTimer(){
		init();
	}
	public void init(){
		timer=new Timer();
	}
	public void run(){
		if(!state){
			commit();
		}else{
			if(howSeconds/interval<=count){
				commit();
				end();
			}else{
				commit();
			}
		}
		count++; //1000�� ���� 100�� �����̸� 10�� �ݺ�
	}
	public void start(long howSeconds, int from,int interval){
		System.out.println("I start--");
		this.interval=interval;
		this.from=from;
		this.howSeconds=howSeconds;
		state=true;
		timer.schedule(this,from,interval);//������
	}
	public void start(int interval){//�����ε�
		start(0,0,interval);//0�ʵ��� 0���� ��������->1�� 
		state=false;
	}
	public void start(){//�����ε�
		start(0,0,1000);//
		state=false;
	}
	public void end(){
		this.cancel();
		System.out.println("I'm dead--");
	}
	public synchronized void commit(){
		System.out.println((count)+" "+new Date());
	}
}
