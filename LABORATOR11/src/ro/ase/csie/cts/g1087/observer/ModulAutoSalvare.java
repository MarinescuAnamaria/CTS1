package ro.ase.csie.cts.g1087.observer;

public class ModulAutoSalvare implements InterfataStatusConexiune {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Salvare automata joc");
	}

}
