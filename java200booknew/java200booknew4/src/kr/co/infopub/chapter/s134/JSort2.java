package kr.co.infopub.chapter.s134;

public class JSort2 {
	
	/**
	 * 
	 * <pre>
	 * BubbleSort : �ٷ� ���� �迭���� �ڽ��� �迭���� ���Ͽ� �ڽ��� �� ���� ���� ��� �ڸ��� �ٲپ� �ش�. 
	 * 					�׸��Ͽ� �迭 ���̸�ŭ 1ȸ���ϸ� ���� ������ �迭���� ���� ū ���� �ȴ�. 
	 * 					�� ���� ���� ū ���� �� ������ �迭�ڸ��� �����ϰ� �ٽ� �ڸ��� �ٲپ� �ִ� �۾��� �� �ش�.
	 * 					�迭 ���̸�ŭ ȸ���ϸ� ������ �Ϸ�ȴ�. </pre>
	 */
	public static void BubbleSort(int[] n){
		for(int i=0; i<n.length-1; i++){
			for(int j=0; j<n.length-1-i; j++){
				if(n[j]>n[j+1]){
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}//��������
	/** 
	 * <pre>
	 * InsertSort : ������ ���������� �Ǿ��ִ��� Ȯ���� ���ٰ� ������ ���Ŀ� ����Ǵ°�� 
	 * 				  �ٸ� ���� �ӽ� �����Ѵ�. �׸��� �� ����Ǵ� �ڸ��� ���, ����Ǵ� �ڸ��� �� ������ �� ĭ��
	 * 				  �ڷ� �̵��Ͽ� �� ������ ���ش�. �׷��� ���� �� �ڸ� �ڸ��� ��� �ӽ� ������ �ξ��� ���� �����Ѵ�.
	 * 				  �̷� ������� �ݺ��ϸ� ������ �ȴ�.</pre>
	 */
	public static void InsertSort(int[] n){	
		for (int i = 0; i < n.length; i++) {
			int temp=n[i];
			int j=i-1;
			while(j>=0 && n[j]> temp){					//���� ���� �� Ŭ ���� ���� ���� �ٷ� ���� ��ġ�� �־� �ش�.
				n[j+1]=n[j];
				j--;
			}
			n[j+1]=temp;
		}
	
	}//��������
	
	
	
	/**
	 * <pre>
	 * SelectSort : �迭�� ���̸�ŭ ȸ���ϸ鼭 ���� �������� ������ ���� �� ���� ���� ���ڸ��� ���� ��ü�� �ش�.
	 * 				   �ٽ� ������ �߿��� �ּҰ��� ���س��� �������� �������� ������. 
	 * </pre>
	 */
	public static void SelectSort(int n[]){
		
		
		for (int i = 0; i < n.length; i++) {
			int k = i;
			for(int j = i+1;j<n.length;j++){
				 if(n[j] < n[k]){
					 k = j;
				 }
				 
			}
			int temp=n[i];
			n[i]=n[k];
			n[k]=temp;	
			
		}	
		
	}
	//���� ���� ��
	
	/**
	 * <pre>
	 * QuickSort : �迭�� ������ �߰� �κ��� pivot���� �����ϰ� ���غ��� ������ ��������, ũ�� ���������� �ű��.
	 * 				  �� �۾��� �Ϸ�Ǹ� �� �� ���� �κ��� �߰� �κ��� �������� ���ϰ� 
	 * 				  ������ �������� , ũ�� ���������� �ű�� �۾��� �ݺ��Ѵ�.
	 * </pre>
	 */

	
		public static void QuickSort(int[] nn, int start, int end){
			int left =start; 
			int right=end;
			int mid=nn[(start+end)/2];
			do{
					//A
				while((nn[left]<mid) && (left < end)){
					left++;
					
				}
				while((mid<nn[right]) && (right>start)){
					right--;
				}
					//B
				if(left<=right){
					
					int temp=nn[left];			
					nn[left]=nn[right];
					nn[right]=temp;
					left++;
					right--;
				}
			}while(left<right);
			//C
			if(start<right){
				QuickSort(nn,start,right);
			}
			//D
			if(left<end){
				QuickSort(nn,left,end);
			}
		}
		/**
		 * ó�� QuickSort�� �Է¹޾Ƽ� �迭�� ���� ������ �Ű������� �Ѱ��ִ� �۾��� �����Ѵ�.  
		 */
		public static void QuickSort(int[] n){
			QuickSort(n,0,n.length-1);
		}
			
	
		
	
	/**
	 * <pre>
	 * ���� ����
	 * static �޼ҵ�� ��ü �������� ClassName.MethodName���� ����� �� �ִ�. </br>
	 * ���� count�� �迭 ���� -1 �� ���� (�ε��� ��ȣ�� 0���� �����ϱ� ������.) 
	 * �ߺ� for���� �̿��� outer for���� 0~ �迭 ������ ������ �ɶ����� �ݺ��ǰ� �Ѵ�.
	 * Inner For���� 0~�迭 �� - 1 -i ���� �ݺ��Ͽ� ���� ū ���� ���� ���������� �̵���Ű��, �� ���� ����� 
	 * ���� ������ - 1 �� ��ġ��Ű�� �����̴�.
	 * if ������ ������ �־� (ù��° ���ڿ� �ι�° ���ڸ� ��) ū ���� �� ������ ��� �ְ�, ���� ���� ��������
	 * ū���� ���������� �̵���Ű�� swap ������ �ݺ��� �Ͼ�� �ȴ�.
	 *   </pre>
	 * @param n  = �����ϰ� ���� ���� (int�� �迭)
	 */
	public static void ascSort(int [] n){
		int count = n.length;
		for(int i=0;i<count-1;i++){
			for(int j=0;j<count-1-i;j++){
				if(n[j] > n[j+1]){
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}
	
	/**
	 * 
	 *  �Ķ���ͷ� �Էµ� ������ ���ڵ�(int �� �迭 n)
	 *  �� �ε��� ��ȣ��� (0~ n�� ��������) ����ϴ� �޼ҵ�.
	 * @param n ����� ����ϰ��� �ϴ� ��Ʈ �迭 (int �迭 ����)
	 */
	public static void print(int []n){
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}	

}
