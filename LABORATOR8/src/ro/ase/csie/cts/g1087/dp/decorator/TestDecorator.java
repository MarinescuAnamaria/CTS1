package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;
import ro.ase.csie.cts.g1087.dp.adapter.CaracterFantastic;

public class TestDecorator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ACMECaracterJoc dragon = new CaracterFantastic("Dragonul albastru", 1000);
        dragon.seDeplaseaza();
        dragon.esteLovit(200);
        dragon.seVindeca(100);
        //ACMECaracterJoc dragonCuScut= new DecoratorScut(dragon,200);
        dragon=new DecoratorScut(dragon,200);
        dragon.esteLovit(300);
        
        dragon=new DecoratorRanit(dragon);
        dragon.esteLovit(450);
        dragon.seDeplaseaza();
}
}
