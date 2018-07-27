package kr.co.infopub.chap132;
public class BernardQuiz {

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
		//System.out.println("count:  "+count);
		//String ss="";
		StringBuffer sb=new StringBuffer();
		//int [] qui=toArray(s);
		//print(qui);
		int tcount=0;
		//int num=qui[0];
		//System.out.println("num:  "+num);
		while(count>tcount){  
			String tes=make(s,tcount);
			//ss+=tes;
			sb.append(tes);
			//System.out.println("ss:  "+ss);
			tcount+=toInt(tes,1);//"12"==>1�� 2�� ==>2ĭ ����
			//System.out.println("i:  "+tcount);
		}
		//return ss;
		return sb.toString();
	}//
	public String makef(String s){
		int count=length(s);
		//System.out.println("count:  "+count);
		String ss="";
		//int [] qui=toArray(s);
		//print(qui);
		int tcount=0;
		//int num=qui[0];
		//System.out.println("num:  "+num);
		while(count>tcount){  
			String tes=makef(s,tcount);
			ss+=tes;
			//System.out.println("ss:  "+ss);
			tcount+=toInt(tes,0);//"12"==>1�� 2�� ==>2ĭ ����
			//System.out.println("i:  "+tcount);
		}
		return ss;
	}//
	//n��°�� �ִ� ���� + ��ΰ� �� String���� ���
	public String make(String s,int n){
		int count=length(s);
		//System.out.println("==< count:  "+count);
		int tempCount=0;
		StringBuffer sb=new StringBuffer();
		int [] qui=toArray(s);  //
		//if(n>=count){return null;}
		int num=toInt(s,n);
		//System.out.println("==< num:  "+num);
		for(int i=n;i<count;i++){
			if(num==qui[i]){
				tempCount++;
			}else{
				//ss+=this.toStrings(num,tempCount);
				sb.append(toStrings(num,tempCount));
				break;
			}
			if(i==count-1){  //������ ���� ó������. 
				//ss+=this.toStrings(num,tempCount);
				sb.append(toStrings(num,tempCount));
				break;
			}
		}
		return sb.toString();
		
	}//
   //n��°�� �ִ� ���� + ��ΰ� �� String���� ���
	  public String makef(String s,int n){
		  int count=length(s);
		  //System.out.println("==< count:  "+count);
		  int tempCount=0;
		  String ss="";
		  int [] qui=toArray(s);  //
		  //if(n>=count){return null;}
		  int num=toInt(s,n);
		  //System.out.println("==< num:  "+num);
		  for(int i=n;i<count;i++){
			  if(num==qui[i]){
				  tempCount++;
			  }else{
				  ss+=this.toStrings(tempCount,num);
				  break;
			  }
			  if(i==count-1){  //������ ���� ó������. 
				  ss+=this.toStrings(tempCount,num);
				  break;
			  }
		  }
		  return ss;
		
	  }//
	//n ��°  Bernard ���
	public void make(int n){
		String s="1";
		for(int i=0;i<n;i++){
			s=make(s);
		}
		print(this.toArray(s));
		
	}//
    //n ��°  Bernard ���
	public void makef(int n){
		String s="1";
		for(int i=0;i<n;i++){
	 		s=makef(s);
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
