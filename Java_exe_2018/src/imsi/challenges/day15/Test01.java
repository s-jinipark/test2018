package imsi.challenges.day15;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		String[][] tickets = {
			{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}
		};
		
		String[] an = t.solution(tickets);
		
		System.out.println(an);

	}
	
    public String[] solution(String[][] tickets) {
    	String[] answer = null;
    	int len = tickets.length;
    	
    	// sort
    	//Arrays.sort(tickets);
    	/*   // ���� �߻�
    	 Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.String; cannot be cast to java.lang.Comparable
				at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320) 
    	 */
    	
    	List<String[]> ticket_list = new ArrayList<String[]>();
    	List<String> rtn_list = new ArrayList<String>();
    	
    	for (int i=0 ; i<tickets.length ; i++) {
    		System.out.println(">" + tickets[i][0] + " / " + tickets[i][1] );
    		// �ϴ��� List �� �־�� �� ��
    		//List<String> t_list = new ArrayList<String>();
    		ticket_list.add( tickets[i] );
    		
    	}
    	
    	// �׻� ICN ���׿��� ���
    	String first = "ZZZ";
    	int first_idx = 0;
//    	for (int i=0 ; i<tickets.length ; i++) {
//    		//System.out.println(">" + tickets[i][0] + " / " + tickets[i][1] );
//    		if ("ICN".contentEquals(tickets[i][0]) ) {
//    			//System.out.println( first.compareTo( tickets[i][1] ) ) ; 
//    			// �����ϸ� 0, 	�ռ��� -1 , �ڸ� 1
//    			if ( first.compareTo( tickets[i][1] ) < 0 ) {
//    				first = tickets[i][1];
//    			}
//    		}
//    	}

    	for (int i=0 ; i<ticket_list.size() ; i++) {
		
    		if ("ICN".equals( ticket_list.get(i)[0] ) ) {
    			System.out.println( first.compareTo( ticket_list.get(i)[1] ) ) ; 
    			// �����ϸ� 0 , �ռ��� - , �ڸ� +
			
				if ( first.compareTo( ticket_list.get(i)[1] ) < 0 ) {
					first = ticket_list.get(i)[1];
					first_idx = i;
				}
    		}
    	}
    	
    	// ó�� 
    	rtn_list.add(ticket_list.get(first_idx)[0]); // ICN
    	rtn_list.add(ticket_list.get(first_idx)[1]);
    	ticket_list.remove(first_idx);
    	
    	String next = "ZZZ";
    	int next_idx = 0;
    	// while �� �ݺ�
    	while (ticket_list.size() >0) {
    		//first �׳� ���
        	for (int i=0 ; i<ticket_list.size() ; i++) {
        		
        		if (first.equals( ticket_list.get(i)[0] ) ) {
        			System.out.println( next.compareTo( ticket_list.get(i)[1] ) ) ; 
        			// �����ϸ� 0 , �ռ��� - , �ڸ� +
    			
    				if ( next.compareTo( ticket_list.get(i)[1] ) > 0 ) {
    					next = ticket_list.get(i)[1];
    					next_idx = i;
    				}
        		}
        	}
        	// ó��
        	rtn_list.add(ticket_list.get(next_idx)[1]);
        	ticket_list.remove(next_idx);
        	//first = ticket_list.get(next_idx)[1];
        	next = "ZZZ";
        	next_idx = 0;
    	}
    	
    	
    	for (int i=0 ; i < rtn_list.size() ; i++ ) {
    		System.out.println( rtn_list.get(i) );
    	}
    	
    	
        return answer;
    }
    // ������ �� �ȵ�
} 
