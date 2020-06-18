package imsi.inflearn.top50.C1StringArray.T12;

import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {


	public static void main(String[] args) {
		String s = "ccaabbb";
		System.out.println(solve(s));
	}
	
    public static int solve(String s) {
    	// 1
    	int start =0, end =0, length =0, counter =0;
    	Map<Character, Integer> map = new HashMap<>();
    	
    	// 2
    	while (end < s.length() ) {
    		char endChar = s.charAt(end); // 0 ���� 
    		map.put(endChar, map.getOrDefault(endChar, 0)+1);
    		
    		if (map.get(endChar) == 1) counter++; // 1 �� �� �� ���� +
    		end++;
    		// 3 
    		while (counter > 2) { // 3���� ������ ���ڿ� ����
    			char startChar = s.charAt(start);
    			map.put(startChar, map.get(startChar)-1);
    			if (map.get(startChar)==0) counter--;
    			start++;
    		}
    		
    		length = Math.max(length, end-start); // ���� �� ���̸� length �� ����
    	}
    	return length;

    }
	
}
