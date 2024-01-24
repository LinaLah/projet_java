package clinique;

public class Patients extends User {
	
	//déclaration des attributs
	
	private String nom;
	private String prenom;
	private int age;
	private String maladies;
	private String traitements;
	
	//constructeurs
	
	public Patients (String nom, String prenom, int age, String maladies, String traitements) {
		
		super (nom,prenom, age);
		this.maladies=maladies;
		this.traitements=traitements;
		
		
	}
	
	//getter et setter
	
	public String getnom() {
		return nom;
		
	}
	
	
	public void setnom(String nom) {
	
	this.nom=nom;

}
	public String getprenom() {
		return prenom;
		
	}
	
	
	public void setprenom(String prenom) {
	
	this.prenom=prenom;

}
	
	public int getage() {
		return age;
		
	}
	
	
	public void setage(int age) {
	
	this.age=age;

}
	
	public String getmaladies() {
		return maladies;
		
	}
	
	
	public void setmaladies(String maladies) {
	
	this.maladies=maladies;

}
	
	public String gettraitements() {
		return traitements;
		
	}
	
	
	public void settraitements(String traitements) {
	
	this.traitements=traitements;

}
	
	//méthodes
	@Override
	
	public String toString () {
		
		return "Patient{"+ "nom="+nom+",prenom="+prenom+",age="+age+",maladies="+maladies+
				",traitements="+traitements+"}";
		
		
		
	}

}
