package fr.sabri.test;

public class Ville {
	
	public static  int nbreInstance=0;
	protected static int nbreInstancep=0;
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	
	public Ville() {
		nbreInstance++;
		nbreInstancep++;
		System.out.println("Création d'une Ville");
		nomVille="Inconnu";
		nomPays="Inconnu";
		nbreHabitants=0;
	}
	
	public Ville(String nomVille,String nomPays, int nbreHabitants) {
		nbreInstance++;
		nbreInstancep++;
		System.out.println("création ville avec paramétre");
		this.nomVille=nomVille;
		this.nomPays=nomPays;
		this.nbreHabitants=nbreHabitants;
	}
	
	public String getNomVille() {
		return this.nomVille;
	}
	
	public void setNomVille(String nomVille) {
		this.nomVille=nomVille;
	}
	
	String toString() {
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s)";
	}

}
