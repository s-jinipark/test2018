package kr.co.infopub.chap088;
public class WarMain {

	public static void main(String[] args) {
		Platoon platoon =new Platoon("Cobra");//Cobra�Ҵ�
		
		Squad firstsquad=new Squad();
		firstsquad.setPlatoonName(platoon.getPlatoonName());
		Squad secondsquad=new Squad("Stinger");
		secondsquad.setPlatoonName(platoon.getPlatoonName());
		Squad thirdsquad=new Squad(platoon);
		thirdsquad.setSquadName("Abangardo");
		Squad fourthsquad=new Squad(platoon,"Tiger");
		
		platoon.showPlatoonName();
		firstsquad.showSquad();
		secondsquad.showSquad();
		thirdsquad.showSquad();
		fourthsquad.showSquad();
	}
}
