package ro.ase.csie.cts.g1087.composite;

public class TestComposite {
	
	public static void main(String[ ] args) {
		GrupCaractere grup1=new GrupCaractere("Grup1");
		grup1.adaugaNod(new CaracterNPC("Soldat1", 100));
		grup1.adaugaNod(new CaracterNPC("Soldat2", 100));
		
		GrupCaractere grup2=new GrupCaractere("Grup2");
		grup2.adaugaNod(new CaracterNPC("Soldat3", 200));
		grup2.adaugaNod(new CaracterNPC("Tanc", 500));
		
		GrupCaractere grupNivelJoc=new GrupCaractere("Level 2");
		grupNivelJoc.adaugaNod(new CaracterNPC("lEVEL bOSS", 1000));
		grupNivelJoc.adaugaNod(grup1);
		grupNivelJoc.adaugaNod(grup2);
		
		grupNivelJoc.atacaJucator("Superman");
		grupNivelJoc.seRetrage();
		grupNivelJoc.getNod(0).seDeplaseaza();
		
		
	}

}
