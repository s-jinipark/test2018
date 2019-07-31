package kr.co.programmers.lv2.prt39;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Prime_Num {

	List<Integer> list = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_Prime_Num fpn = new Find_Prime_Num();
		
		String num = "011";
		
		int rtn1 = fpn.solution(  num );
		System.out.println("[1] > " + rtn1 );
		
		
	}

	public int solution( String num ) {
		int answer = 0; 
		
		char[] test = num.toCharArray();
		int len = test.length;
		
		for (int i=1; i<=len ; i++) {
			perm(test, 0, len, i);
		}
		
		//perm(test, 0, 2, 1);
		
		//set Ȯ��
		for (int i : set) {
			System.out.println(">" + i + "/" + isPrime(i) );
			// �Ҽ����� Ȯ��
			if ( isPrime(i) ) answer++;
		}
		
		return answer;

    } 
	
	// �迭 arr �� ����ؼ� �����͸� ��� �ٴϸ鼭 ��ȯ�ǰ� �ִ� �迭
	// depth �� ���� Ʈ���������� ��� ���̿��� ��ȯ�۾��� �ϰ� �ִ���
	// n �� �迭�ȿ� ����ִ� ���ڸ� ���ϸ� �������̴�
	// k �� ��� �̾Ƴ��� ������ ���� �������� ���ϸ� �������̴�
	public void perm(char[] arr, int depth, int n, int k) {
		
		if ( depth == k ) {
			//print(arr, k);
			//System.out.println(print(arr, k)) ;
			set.add(Integer.parseInt(print(arr, k)));
			return;
		} 
		
		for (int i = depth; i < n ; i++) {
			swap(arr, i, depth);
			perm(arr, depth+1, n, k);
			swap(arr, i, depth);
		}
	}
	
	
	public void swap(char[] arr, int i, int j) { 
		char temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	}

	public String print(char[] arr, int k) { 
		String  rtn = "";
		for (int i = 0; i < k; i++) { 
//			if (i == k - 1) 
//				System.out.println(arr[i]); 
//			else 
//				System.out.print(arr[i] + ","); 
			
			rtn += arr[i]+"";
		} 
		return rtn;
	}

	
	public boolean isPrime(int num) {
		int n = 2;	//������� �Է°��� ������� 
					//������ ������ ������ ����(1�� ���� ����) 
		if (num == 0 || num == 1 ) return false; // 1 ����
		
		boolean flag=true;	//--�Ҽ���~!!!(check~!!!) 
		while(n<num) { 
			if(num%n==0) { 
				flag = false;	//-- �Ҽ��� �ƴϴ�~!!! 
				break;
			} 
			n++; 
		}

		return flag;
	}

}
