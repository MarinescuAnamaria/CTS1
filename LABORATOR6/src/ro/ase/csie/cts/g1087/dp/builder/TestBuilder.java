package ro.ase.csie.cts.g1087.dp.builder;

public class TestBuilder {
public static void main(String[] args)
{
	//constr ob
	SuperErou superErou = new SuperErou();
	//initializare atr
	superErou.nume="Superman";
	
	SuperErou superErou2=
			new SuperErou("Batman", 100, false, false, new Arma(), null, null, null);
}

}
