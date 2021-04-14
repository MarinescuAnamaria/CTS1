package ro.ase.csie.cts.g1087.dp.adapter;

public abstract class DecoratorCaracter extends ACMECaracterJoc {
	ACMECaracterJoc caracter=null;

	protected DecoratorCaracter(String nume, int puncteViata, ACMECaracterJoc caracter) {
		super(nume, puncteViata);
		this.caracter = caracter;
	}

	@Override
	public void seDeplaseaza() {
		this.caracter.seDeplaseaza();
		
	}

	@Override
	public void esteLovit(int puncte) {
		// TODO Auto-generated method stub
		this.caracter.esteLovit(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		// TODO Auto-generated method stub
		this.caracter.seVindeca(puncte);
	}
	

}
