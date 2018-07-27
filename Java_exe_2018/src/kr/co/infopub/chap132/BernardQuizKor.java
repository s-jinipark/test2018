package kr.co.infopub.chap132;
public class BernardQuizKor {

	public int toInt(String a){
		return Integer.parseInt(a.trim());
	}
	public String toStrings(int a){
		return (a+"");
	}
	public String toStrings(int m,int n){
		return (""+m+n);
	}
	public int toInt(String a,int n){
        //return Integer.parseInt(a.charAt(n)+"");
		return a.charAt(n)-'0';
	}
	public int length(int a){
		return (a+"").length();
	}
	public int length(String s){
		return s.length();
	}
	public int [] toArray(String s){
		int count=length(s);
		int [] qui=new int [count];
		for(int i=0;i<count;i++){
			qui[i]=s.charAt(i)-'0';//'2'-'0'=���� 2
			//qui[i]=this.toInt(s.charAt(i)+"");
		}
		return qui;
	}
	//n��°�� ���� ���� n+1�� °�� �߷� 
	public String make(String s){
		int count=length(s);
		StringBuffer sb=new StringBuffer();
		int tcount=0;
		while(count>tcount){  
			String tes=make(s,tcount);
			sb.append(tes);
			tcount+=toInt(tes,1);//"12"==>1�� 2�� ==>2ĭ ����
		}
		return sb.toString();
	}//
	public String make(String s,int n){
		int count=length(s);
		int tempCount=0;
		StringBuffer sb=new StringBuffer();
		int [] qui=toArray(s);  //
		int num=toInt(s,n);
		for(int i=n;i<count;i++){
			if(num==qui[i]){
				tempCount++;
			}else{
				sb.append(toStrings(num,tempCount));
				break;
			}
			if(i==count-1){  //������ ���� ó������. 
				sb.append(toStrings(num,tempCount));
				break;
			}
		}
		return sb.toString();
	}//
	//n ��°  Bernard ���
	public void make(int n){
		String s="1";
		for(int i=0;i<n;i++){
			s=make(s);
		}
		print(this.toArray(s));
	}//
	//������ �迭 ���
	public static void print(int [] a){
		int m=a.length;
		for(int i=0;i<m;i++){
			System.out.print(a[i]);
		}
		System.out.print("\t\tcount:   "+m);
		System.out.println();
	}//
}
