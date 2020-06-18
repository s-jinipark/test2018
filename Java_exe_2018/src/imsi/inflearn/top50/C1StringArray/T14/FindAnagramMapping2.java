package imsi.inflearn.top50.C1StringArray.T14;

import java.util.HashMap;

public class FindAnagramMapping2 {
		
		public static void main(String[] args) {
			int[] A = {12, 28, 46, 32, 50};
			int[] B = {50, 12, 32, 46, 28};
			int [] result = anagramMappings(A, B);
			print(result);
		}
		
		public static void print(int[] result) {
			for(int i=0; i< result.length; i++) {
				System.out.print(result[i]+" ");
			}
		}

	    public static int[] anagramMappings(int[] A, int[] B) {
	        int l = A.length;
	        int[] res = new int[l];
	        
	        // Map �� �� ��ٸ� �Ƹ� �������� �ذ� ���� ��
	        for (int i=0 ; i< A.length ; i++) {
	        	
	        	int tmp = A[i];
	        	
	        	for (int j=0; j< B.length ; j++) {
	        		if (tmp == B[j] ) {
	        			res[i] = j;
	        			break;
	        		}
	        	}
 	        }
	        
	        // for loop �̹Ƿ�  ȿ������ �ɸ� ��
	        
	        return res;
	    }
}
