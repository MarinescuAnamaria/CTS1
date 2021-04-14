package ro.ase.csie.cts.g1087.dp.facade;

public class APIJocFacade {
	
	public static ProfilJucator getProfil(String ipServer, int port, String numeUtilizator, String parola) {
		ServerJoc server=new ServerJoc(ipServer, port);
		if(server.conectare()) {
			Utilizator utilizator=new Utilizator();
			utilizator.login("Player 1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil= profil.getDateProfil();
			return profil;
			
		}
		else
			return null;
	}
}
