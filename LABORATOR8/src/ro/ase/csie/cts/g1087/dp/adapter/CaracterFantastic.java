package ro.ase.csie.cts.g1087.dp.adapter;

public class CaracterFantastic extends ACMECaracterJoc {

	public CaracterFantastic(String nume, int puncteViata) {
		super(nume, puncteViata);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(String.format("%s se deplaseaza pe ecran", nume));
		
	}

	@Override
	public void esteLovit(int puncte) {
		System.out.println(String.format("%s este lovit si pierde %d puncte", nume, puncte));
	}
	public void seVindeca(int puncte) {
		System.out.println(String.format("%s se vindeca si primeste %d puncte ", nume, puncte));
		
	}

}
