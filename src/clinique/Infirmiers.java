package clinique;

public class Infirmiers extends User {
	
	//déclaration des attributs
	private int experience;
	
	
	
	//constructeur
	
	public Infirmiers (String nom, String prenom, int age, int experience, String login) {
		
		
		super(nom, prenom,age);
		
		this.experience=experience;
		this.login=login;
		
		
		
		
	}
	
	//getter et setter
	
	
	public int getexperience() {
		return experience;
		
	}
	
	
	public void setexperience(int experience) {
	
	this.experience=experience;

}
	
	//méthodes
	
	@Override
	public String toString () {
		
		return "infirmier{"+"nom=" + nom + ",prenom=" + prenom+ ",age=" +age+
				",expérience="+experience+"}";
		
		
		
		
		
	}
	

}
