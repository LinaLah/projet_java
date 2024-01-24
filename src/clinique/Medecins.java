package clinique;

public class Medecins extends User {
	
	//déclaration des attributs
	
	private String spécialité;
	private int expérience;
	
	//constructeurs
	
public Medecins (String nom, String prenom, int age, String spécialité, int expérience, String login) {
		
		
		super(nom,prenom,age);
		this.spécialité=spécialité;
		this.expérience=expérience;
		this.login=login;
		
	}
	

//getter et setter
	
public String getspécialité() {
	return spécialité;
	
}


public void setspécialité(String spécialité) {

this.spécialité=spécialité;

}
	
public int getexpérience() {
	return expérience;
	
}


public void setexpérience(int expérience) {

this.expérience=expérience;

}
	
//méthodes
	@Override
	public String toString () {
		
		return "medecin{"+"nom=" + nom + ",prenom=" + prenom + ",age=" + age +
		",spécialité" + spécialité+ ",expérience="+expérience+"}";
		
		
		
		
		
	}
	
  
	
	
	
	
	
	
	
}
