package kr.co.infopub.chap149;
public class SeaAirplaneMain {

	public static void main(String[] args) {
		SeaAirplane sea =new SeaAirplane("CS110");
		Plane p=sea;
		Ship  s=sea;
		SeaAirplaneUtil.show(sea);//SeaAirplane�� �ƱԸ�Ʈ��
		SeaAirplaneUtil.show(p);//Plane�� �ƱԸ�Ʈ��
		SeaAirplaneUtil.show(s);//Ship �� �ƱԸ�Ʈ��
		SeaAirplaneUtil.showOnly(sea);//
		SeaAirplaneUtil.showPlane(sea);
	}
}
