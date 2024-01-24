package clinique;

public  class User implements Interface    {

	//déclaration des attributs
	
	protected int id; 
	protected String nom;
	protected String prenom;
	protected int age;
	protected String login;
	protected String password;
	protected String adress;
	protected int phonenumber;
	
	
	//getter et setter
	public int getid() {
		return id;
		
	}
	
	
	public void setid(int id) {
	
	this.id=id;

}
	
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
	
	public String getlogin() {
		return login;
		
	}
	
	
	public void setlogin(String login) {
	
	this.login=login;

}
	
	public String getpassword() {
		return password;
		
	}
	
	
	public void setpassword(String password) {
	
	this.password=password;

}
	
	public String getadress() {
		return adress;
		
	}
	
	
	public void setadress(String adress) {
	
	this.adress=adress;

}
	
	public int getphonenumber() {
		return phonenumber;
		
	}
	
	
	public void setphonenumber(int phonenumber) {
	
	this.phonenumber=phonenumber;

}
	
	//constructeurs
	
	public User (String nom, String prenom, int age)
	{
		
		this.nom=nom;
		this.prenom=prenom;
		this.age= age;
		
	}
	
	public User (int id,String nom, String prenom, int age,String login,String password,String adress , int phonenumber2) {
	
	this.id=id;
	this.nom=nom;
	this.prenom=prenom;
	this.age=age;
	this.login=login;
	this.password=password;
	this.adress=adress;
	this.phonenumber=phonenumber2;
	}
	
	
	
	//méthodes
	
	
	@Override
	
	public String toString( ) {
		
		return "user{"+"nom="+nom+",prenom="+prenom+ ",login="+ login+",password="+password+ 
				",adress="+ adress+ ",phonenumbre="+ phonenumber+ "}";
		
	}


	@Override
	public String prixenpromo() {
		
		return null;
	}


	@Override
	public String methode() {
		// TODO Auto-generated method stub
		return null;
	}


	public String prixenpromo (String nomproduit, float prixproduit, float prixpromo)
	{ 
		int promo=10;
		Boolean a=true;
		
		String result; 
		{
		if (a=true )
				{
			prixpromo= prixproduit*(1-(promo/100))	;
		
		result=  ("le prix en promotion est"+prixpromo);
		return result;
			
		}
		
		 else  
		{
		result=  (nomproduit+" n'est pas en promotion");
		
		System.out.println (result) ;
			
		}
		return result;
		
		
	
	

}
}

	
	public String methode (String nomproduit, float prixproduit, float prixpromo)
	{ 
		
		Boolean a;
		int promo=10;
		prixpromo= prixproduit*(1-(promo/100))	;
		String result=(a=true)? "le prix en promotion est"+prixpromo:nomproduit+" n'est pas en promotion";
		
		System.out.println (result);
		 
		return result;
		
	
	}


	
}

