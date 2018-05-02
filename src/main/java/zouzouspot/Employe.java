package zouzouspot;

public abstract class Employe extends Personne implements Salarie{
	
	private int salaire;
	private String dureeContrat;
	
	public abstract void travailler();

	public void recevoirPaiement() {
		// TODO Auto-generated method stub
		
	}

}
