package kr.co.jungsuk.ch11;
class P28_AsciiPrint{
	public static void main(String[] args) {
		char ch = ' ';
		for(int i=0; i < 95; i++)  // ����(' ')������ ���ڵ��� ����Ѵ�.
			System.out.print(ch++);
	}
}
