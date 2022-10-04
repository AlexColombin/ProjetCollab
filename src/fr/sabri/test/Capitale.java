package fr.sabri.test;

public class Capitale extends Ville {
	
	private String monument;
	
	public Capitale() {
		super();
		monument="aucun";		
	}
	
	public Capitale(String nomVille,String nomPays, int nbreHabitants,String monument) {
		super(nomVille,nomPays,nbreHabitants);
		this.monument=monument;
	}
	
	public String decrisToi() {
		return super.decrisToi()+ "\n \t ==>>" + this.monument+ " en est un monument";
	}

}
