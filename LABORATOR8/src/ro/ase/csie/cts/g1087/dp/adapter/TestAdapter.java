package ro.ase.csie.cts.g1087.dp.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CaracterFantastic dragon = new CaracterFantastic("Dragonul albastru", 1000);
        dragon.seDeplaseaza();
        dragon.esteLovit(200);
        dragon.seVindeca(100);
        
        DonaldDuck donald= new DonaldDuck();
        donald.setPower(500);
        donald.move(100, 100);
        donald.primesteLovitura(50);
        donald.reincarca(50);
        
        ArrayList<ACMECaracterJoc> caractere = new ArrayList<>();
        caractere.add(dragon);
        
        AdaptorDisneyLaAcme adaptorDonald=new AdaptorDisneyLaAcme(donald);
        caractere.add(adaptorDonald);
        System.out.println("-----------------------------");
        
        for(ACMECaracterJoc caracter:caractere) {
        caracter.seDeplaseaza();
        caracter.esteLovit(50);
        }
	}
	
}
