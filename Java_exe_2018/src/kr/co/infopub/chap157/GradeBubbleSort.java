package kr.co.infopub.chap157;
public class  GradeBubbleSort
{
	public  static Grade[ ] bubble(Grade [] a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j].compareTo(a[j+1])>0){  
					Grade temp=a[j+1];  //����
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}

