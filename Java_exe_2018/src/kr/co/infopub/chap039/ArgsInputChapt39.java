package kr.co.infopub.chap039;
public class ArgsInputChapt39 {
//java kr.co.infopub.chap039.ArgsInputChapt39 hello java200
	public static void main(String[] args) {
		if(args.length<=0){
			System.out.println("�ƱԸ�Ʈ�� ����.");
		}else if(args.length==1){
			System.out.println("�ƱԸ�Ʈ 1��: "+args[0]);
		}else if(args.length==2){
			System.out.printf("�ƱԸ�Ʈ 2��: %s %s",args[0],args[1]);
		}else{
			System.out.printf("Too many!!");
		}
	}
}
