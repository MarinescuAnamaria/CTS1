package ro.ase.csie.cts.g1087.factorymethod;

import ro.csie.cts.g1087.simplefactory.CaracterDCComics;
import ro.csie.cts.g1087.simplefactory.CaracterDisney;
import ro.csie.cts.g1087.simplefactory.CaracterMarvel;
import ro.csie.cts.g1087.simplefactory.SuperErouAbstract;
import ro.csie.cts.g1087.simplefactory.TipErou;

public class FactoryTemaUniversala extends FactoryAbstract {

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterDisney(nume, 100, false);
			break;
		case MARVEL:
			superErou = new CaracterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou = new CaracterDCComics(nume, 500, 100);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;
	}
	

}
