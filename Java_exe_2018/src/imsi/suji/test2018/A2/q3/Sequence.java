package imsi.suji.test2018.A2.q3;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
	/**
	 * ���Ӽ� ��� �˻� ���
	 *
	 * @param inputData List �Էµ�����(���ڿ� ���)
	 * @return List ���Ӽ� ���
	 */
	public List<String> getSequenceList(List<String> inputData) {
		List<String> sequenceList = new ArrayList<>();
		//////////////////////// ������� ���� (1) ---------------->

		for (String s : inputData) {
			//System.out.println(">" + s);
			// 1 ~ 9 ���� ?
			int prev = 0;
			boolean isSeq = true;
			for (int i = 0 ; i < s.length() ; i++ ) {
				char tmp = s.charAt(i);
				if ( i > 0 ) {
					if (Integer.parseInt(tmp+"") != prev+1) {
						isSeq = false;
						break;
					} 
				}
				prev = Integer.parseInt(tmp+"");
			}
			if (isSeq) {
				sequenceList.add(s);
			}
		}
		///////////////////////////// <-------------- ������� ���� (1)
		return sequenceList;
	}

	/**
	 * ���� ū �� ���� ���
	 *
	 * @param sequenceList List ���Ӽ� ���
	 * @return int ���� ū ��
	 */
	public int getMaxNum(List<String> sequenceList) {
		int maxNum = 0;
		List<Integer> num = new ArrayList<Integer>();
		StringBuilder str = new StringBuilder();
		int max = 0;
		int min = 0;
		//////////////////////// ������� ���� (2) ---------------->
		// min ���� ���� ū���� �־��
		min = Integer.MAX_VALUE;
		
		// [1] ���� ū �� �˻�
		for (String s : sequenceList) {

			//System.out.println(">" + s);
			int tmp = Integer.parseInt(s);
			if (max < tmp) {
				max = tmp;
			}
			// [2] ���� ���� �� �˻�
			if (min > tmp) {
				min = tmp;
			}
			
		}
		
		//System.out.println("=>" + min + " / " + max);
		
		int comp1 = Integer.parseInt( min + "" + max );
		int comp2 = Integer.parseInt( max + "" + min );
		
		if ( comp1 > comp2 ) {
			maxNum = comp1;
		} else {
			maxNum = comp2;
		}
		
		///////////////////////////// <-------------- ������� ���� (2)
		return maxNum;
	}
}
