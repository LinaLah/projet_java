package clinique;

public class Employés extends User {
	
	//constructeur
	
	public Employés ( String nom, String prenom, int age, String login) {
		
		super(nom, prenom, age);
		this.login=login;
		
		
	}
	
	//méthodes
	 
		@Override
		
		public String toString() {
			
			return "employé{" +"nom="+nom+",prenom="+prenom+",age="+age+"}";
			
		
	}
		
		
	
		
		
		
	
	

}
