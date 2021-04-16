package ro.ase.csie.cts.g1087.flyweight;
//pt a gestiona starea temp
public class ContextEcran {

	int x;
	int y;
	String culoareTextura;
	protected ContextEcran(int x, int y, String culoareTextura) {
		super();
		this.x = x;
		this.y = y;
		this.culoareTextura = culoareTextura;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getCuloareTextura() {
		return culoareTextura;
	}
	public void setCuloareTextura(String culoareTextura) {
		this.culoareTextura = culoareTextura;
	}
	
	
}
