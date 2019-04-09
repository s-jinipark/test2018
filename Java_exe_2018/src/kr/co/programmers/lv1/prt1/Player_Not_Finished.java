package kr.co.programmers.lv1.prt1;

import java.util.Enumeration;
import java.util.Hashtable;

public class Player_Not_Finished {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player_Not_Finished pnf = new Player_Not_Finished();
		
		String [] participant1 = new String [] { "leo", "kiki", "eden" };	
		String [] completion1 = new String [] { "eden", "kiki" };	
		String rtn1 = "";
		//----------
		String [] participant2 = new String [] { "marina", "josipa", "nikola", "vinko", "filipa" };	
		String [] completion2 = new String [] { "josipa", "filipa", "marina", "nikola" };	
		String rtn2 = "";
		//----------
		String [] participant3 = new String [] { "mislav", "stanko", "mislav", "ana" };	
		String [] completion3 = new String [] { "stanko", "ana", "mislav" };	
		String rtn3 = "";
		//----------
		rtn1 = pnf.solution(participant1, completion1);
		System.out.println("[1] : " + rtn1);
		//----------
		rtn2 = pnf.solution(participant2, completion2);
		System.out.println("[2] : " + rtn2);
		//----------
		rtn3 = pnf.solution(participant3, completion3);
		System.out.println("[3] : " + rtn3);	
	}

	public String solution(String[] participant, String[] completion) {
		// TODO Auto-generated method stub
		System.out.println("p : " + participant.length);
	    System.out.println("c : " + completion.length);
	    Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
	    int same_cnt = 0;
	    String rtn_val = "";
	    // �������� ó��
	    for (int i=0; i<participant.length; i++) {
	    	same_cnt = 0;
	    	for (int j=0; j<participant.length; j++) {
	    		if ( participant[i].equals(participant[j])) {
	    			same_cnt++;
	    		}
	    	}
	    	if (same_cnt > 1) {
	    		ht.put(participant[i], same_cnt);
	    	}
	    }
	    
	    if ( ht.size() > 0) {
		    // �������� ���� ��� ���� �� �´� ��� ����..
		    Enumeration<String> e_k = ht.keys();
		    while (e_k.hasMoreElements()) {
		    	String key = e_k.nextElement().toString();
		    	System.out.println("key : " + key);
		    	System.out.println("cnt : " + ht.get(key));
		    	// ������ ��ܿ� �ش� key, cnt �� �¾ƾ� ...
		    	same_cnt = 0;
		    	for (int j=0; j<completion.length; j++) {
		    		if ( key.equals(completion[j])) {
		    			same_cnt++;
		    		}
		    	}
		    	System.out.println(">" + same_cnt);
		    	if ( ht.get(key) > same_cnt ) {
		    		rtn_val = key;
		    	}
		    	
		    }
		    System.out.println(">>" + rtn_val);
	    } else {
		    // �� �� loop ������.
		    for (int i=0; i<participant.length; i++) {
		    	same_cnt = 0;
		    	for (int j=0; j<completion.length; j++) {
		    		if ( participant[i].equals(completion[j])) {
		    			// ������ ������ stop
		    			same_cnt++;
		    			break;
		    		}
		    	}
		    	if ( same_cnt == 0 ) {
		    		rtn_val = participant[i];
		    	}
		    }
	    }    
		return rtn_val;
	}
}
