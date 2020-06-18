package imsi.inflearn.top50.C1StringArray.T07;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones2 {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J, S));
	}

	public static int solve(String jew, String stone) {

		int count = 0;
		// 1 ������ ��ҹ��ڸ� �����ؼ� ���� �־�� �Ѵ�
		// 2 aA -> 2��
		// 3 ���濡 ���� aA �� ���������� ��̾����� üũ
		
		// �ߺ��� ������� �ʴ� HashSet ����
		Set<Character> set = new HashSet<>();
		for (char jewChar : jew.toCharArray()) {
			set.add(jewChar); // a, A ����
		}
		
		for (char stoneChar : stone.toCharArray()) {
			if (set.contains(stoneChar)) {
				count++;
			}
		}
		
		return count;
	}

}
