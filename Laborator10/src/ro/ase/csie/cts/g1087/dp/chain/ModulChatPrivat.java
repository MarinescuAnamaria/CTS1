package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatPrivat extends NodChainAbstract{
	
	private static final String Nume_Modul = "Modul Chat Privat";

	public ModulChatPrivat() {
		super(Nume_Modul);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		// TODO Auto-generated method stub
		if(mesaj.getDestinatie(). isEmpty() || mesaj.getDestinatie().equals("@Everyoane")) {
			if(this.next!=null)
				this.next.procesareMesajChat(mesaj);
			
		}
		else
		{
			//procesare mesaj privat
			System.out.println(String.format("Mesaj privat pentru %s = %s",
					mesaj.getDestinatie(), mesaj.getContinut()));
		}
	}

}
