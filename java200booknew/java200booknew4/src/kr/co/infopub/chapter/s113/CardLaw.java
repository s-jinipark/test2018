package kr.co.infopub.chapter.s113;
public class CardLaw {
	public boolean thirdCardPlayer(int x) { //�÷��̾��� �� ��° ī�� 
		boolean isC = false;
		if (x < 6) { // �÷��̾��� ī�� �� ���� ���� 0~5������ ��
			isC = true;
		}
		return isC;
	}
	public boolean thirdCardDealer(int x, int y) { //������ �� ��° ī�带 �޴� ����
		boolean isC = false;
		if (x < 3) { //���� ī�� �� ���� ���� 0, 1, 2 �� ��
			isC = true;
		}else if (x == 3 && y != 8) { 
			// ���� ī�� �� ���� ���� 3�̰� �÷��̾� �� ��° ī�尡 8�� �ƴ� ��
			isC = true;
		}else if (x == 4 && (y > 1 && y < 8)) {
			//���� ī�� �� ���� ���� 4�̰� �÷��̾� �� ��° ī�尡 2~7�� ��
			isC = true;
		}else if (x == 5 && (y > 3 && y < 8)) {
			//���� ī�� �� ���� ���� 5�̰� �÷��̾� �� ��° ī�尡 4~7�� ��
			isC = true;
		}else if (x == 6 && (y > 5 && y < 8)) {
			//���� ī�� �� ���� ���� 6�̰� �÷��̾� �� ��° ī�尡 6, 7�� ��
			isC = true;
		}	
		return isC;
	}
	public boolean stand(int x, int y) { //���ĵ尡 �Ǵ� ����
		boolean isC = false;
		if (x > 5 && x < 8) { // �÷��̾��� �� ���� ī�� ���� 6, 7�� ��
			if (x == y) { // ������ �� ���� ī�� ���� �÷��̾��� �� ���� ī�� �հ� ���� ��
				isC = true;
			}
			isC = true;
		}else if (y == 7) { //������ �� ���� ī�� ���� 7�� ��
			isC = true;
		}	
		return isC;
	}
	public boolean natural(int x, int y) { // ���� ó���� �Ǵ� ����
		boolean isE = false;
		if (x > 7 && x < 10) {
			isE = true;
		}else if (y > 7 && y < 10) {
			isE = true;
		}
		return isE;
	}
}
