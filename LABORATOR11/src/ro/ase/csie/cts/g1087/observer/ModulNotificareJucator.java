package ro.ase.csie.cts.g1087.observer;

public class ModulNotificareJucator implements InterfataStatusConexiune {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Pop UP ! Conexiune Internet pierduta !");
	}

}
