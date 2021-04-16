package ro.ase.csie.cts.g1087.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		ContextEcran contextCladire1=new ContextEcran(100,50, "Albastru");
		ContextEcran contextCladire2=new ContextEcran(200,150, "Albastru");
		ContextEcran contextCladire3=new ContextEcran(200,550, "Rosu");
		
		InterfataModel3D modelCladire=FactoryModel3D.getModel3D("Cladire");
		modelCladire.afisareEcran(contextCladire1);
		modelCladire.afisareEcran(contextCladire2);
		modelCladire.afisareEcran(contextCladire3);

	}

}
