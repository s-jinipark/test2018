package kr.co.infopub.chap170;
public class LottoAnalysisMain {

	public static void main(String[] args) {
		LottoAnalysis lan=new LottoAnalysis();
		String[] lottos=lan.getLottos(LottoData.data[0]);
		System.out.println();
		for(int i=0;i<lottos.length;i++){
			System.out.print(lottos[i]+" ");
		}
		System.out.println();
		//System.out.println(09+"");// ���� 8���� 
		//09�� ���� 0���� �����ϴ� ���� 10�� ���ڷ� ��ȯ
		System.out.println(lan.to10("09"));//
		
		int a[]=lan.toInt(LottoData.data[0]);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
