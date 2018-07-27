package kr.co.infopub.chap171;
public class LottoCounting {
	private int [] lotto;
	private int [] count;
	public LottoCounting(int[] lotto){
		setLotto(lotto);
	}
	public LottoCounting(){
	}
	public void setLotto(int[] lotto){
		this.lotto=lotto;
	}
	private boolean isSame(int [] a, int b){
		boolean isS=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==b){
				isS=true;
				break;
			}
		}
		return isS;
	}
	public void make(int [][] outlotto){
		int width=outlotto.length;
		int depth=outlotto[0].length;
		count=new int[width];
		for(int i=0;i<width;i++){
			prints(outlotto[i]);//
			counts(outlotto[i],i);
		}
	}
	private void counts(int [] a, int b){
		int nums=a.length;
		for(int i=0;i<nums;i++){
			if(isSame(a,lotto[i])){
				count[b]++;
			}
		}
	}
	//�迭�� ����ϴ� �޼��� 
	public  void prints(int [] nums){
		System.out.print("[");
		for(int i=0;i<nums.length-1;i++){
			System.out.print(nums[i]+" , ");
		}
		System.out.println(nums[nums.length-1]+"]");
	}
	public void printLotto(){
		System.out.println("-----------------------");
		prints(lotto);
		System.out.println("-----------------------");
		for(int i=0;i<count.length;i++){
			System.out.println(i+"��° �ζ� ���: "+count[i]+"�� ����");
		}
		System.out.println();
	}
}
