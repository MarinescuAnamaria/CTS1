package ro.ase.csie.cts.g1087.dp.adapter;

public class AdaptorDisneyLaAcme extends ACMECaracterJoc {

	ActiuniDisney caracterDisney=null;

	public AdaptorDisneyLaAcme(ActiuniDisney caracterDisney) {
		super(caracterDisney.getNume(), caracterDisney.getPower());
		this.caracterDisney = caracterDisney;
	}

	@Override
	public void seDeplaseaza() {
		// TODO Auto-generated method stub
		caracterDisney.move(0,0);
		
	}

	@Override
	public void esteLovit(int puncte) {
		// TODO Auto-generated method stub
		caracterDisney.primesteLovitura(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		// TODO Auto-generated method stub
		caracterDisney.reincarca(puncte);
		
	}
	
	
}
