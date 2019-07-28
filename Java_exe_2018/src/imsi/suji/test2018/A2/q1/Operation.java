package imsi.suji.test2018.A2.q1;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	/**
	 * ���ڿ� �и� ���
	 *
	 * @param inputData String �Էµ�����(���ڿ�)
	 * @return List [0]: ���ڷ� ������ ���ڿ�, [1]: ���ڷ� ������ ���ڿ�
	 */
	public List<String> getStrList(String inputData) {
		List<String> strList = new ArrayList<String>();
		StringBuilder str = new StringBuilder();
		StringBuilder num = new StringBuilder();
		////////////////////// ������� ���� (1) ---------------->

		for (int i=0; i< inputData.length() ; i++ ) {
			char tmp_ch = inputData.charAt(i);
			//System.out.println(">" + tmp_ch);
			if (tmp_ch >= 'A' && tmp_ch <= 'Z') {
				str.append(tmp_ch);
			}
			if (tmp_ch >= '0' && tmp_ch <= '9') {
				num.append(tmp_ch);
			}
		}
		strList.add(str.toString());
		strList.add(num.toString());
		///////////////////////////// <-------------- ������� ���� (1)
		return strList;
	}

	/**
	 * ���ο� ���ڿ��� �����ϴ� ���
	 *
	 * @param strList List [0]: ���ڷ� ������ ���ڿ�, [1]: ���ڷ� ������ ���ڿ�
	 * @return String ���ο� ���ڿ�
	 */
	public String getNewStr(List<String> strList) {
		String newStr = "";
		StringBuilder tmp = new StringBuilder();
		String str = strList.get(0);
		String num = strList.get(1);
		int str_len = str.length();
		int num_len = num.length();
		
		////////////////////// ������� ���� (2) ---------------->

		for (int i=0 ; i<6 ; i++) { // 6ȸ ����
			
			if ( i < str_len) {
				tmp.append(str.charAt(i));
			}	
			if ( i < num_len) {
				tmp.append(num.charAt(i));
			}	
			
		}
		newStr = tmp.toString();
		///////////////////////////// <-------------- ������� ���� (2)
		return newStr;
	}

	public static boolean isStringDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
