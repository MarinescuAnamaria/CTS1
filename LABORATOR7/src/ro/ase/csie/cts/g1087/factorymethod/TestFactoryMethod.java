package ro.ase.csie.cts.g1087.factorymethod;

import ro.csie.cts.g1087.simplefactory.FactorySuperErou;
import ro.csie.cts.g1087.simplefactory.SuperErouAbstract;
import ro.csie.cts.g1087.simplefactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		boolean esteTemaFantasy = true;
		
		FactoryAbstract factoryCaractere = null;
		
		if(esteTemaFantasy) {
			factoryCaractere = new FactoryTemaFantasy();
		} else {
			factoryCaractere = new FactoryTemaUniversala();
		}
		
		SuperErouAbstract superCaracter = 
				factoryCaractere.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter = factoryCaractere.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = factoryCaractere.getSuperErou(TipErou.DC, "Batman");
		
	}

}
