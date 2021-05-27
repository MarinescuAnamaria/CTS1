package ro.ase.csie.cts.g1087.factorymethod;

import ro.csie.cts.g1087.simplefactory.CaracterDCComics;
import ro.csie.cts.g1087.simplefactory.CaracterDisney;
import ro.csie.cts.g1087.simplefactory.CaracterMarvel;
import ro.csie.cts.g1087.simplefactory.SuperErouAbstract;
import ro.csie.cts.g1087.simplefactory.TipErou;

public class FactoryTemaFantasy extends FactoryAbstract {

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterFantasyDisney(nume, 100);
			break;
		case MARVEL:
			superErou = new CaracterFantasyMarvel(nume, 500);
			break;
		case DC:
			superErou = new CaracterFantasyDCComics(nume, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;
	}

}
