package ro.ase.csie.cts.g1087.factorymethod;

import ro.csie.cts.g1087.simplefactory.SuperErouAbstract;
import ro.csie.cts.g1087.simplefactory.TipErou;

public abstract class FactoryAbstract {
	
	public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
