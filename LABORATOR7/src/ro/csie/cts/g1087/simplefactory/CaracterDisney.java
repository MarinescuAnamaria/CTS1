package ro.csie.cts.g1087.simplefactory;

public class CaracterDisney extends SuperErouAbstract {

	boolean cuAcordParental;
	
	public CaracterDisney(String nume, int puncteViata, boolean acordParental) {
		super(nume, puncteViata);
		this.cuAcordParental = acordParental;
	}

	@Override
	public void seDeplaseaza() {
		
	}
	
	
}
