package clinique;

public class Produit {
	//déclaration des attributs
	
	private String nomproduit;
	private String marqueproduit;
	private float prixproduit;
	 
	//constructeurs
	public Produit (String nomproduit, String marqueproduit, float prixproduit)
	{
		
		this.nomproduit=nomproduit;
		this.marqueproduit=marqueproduit;
		this.prixproduit= prixproduit;
		
	}
	
	//getter et setter
	
	public String getnomproduit() {
		return nomproduit;
		
	}
	
	
	public void setnomproduit(String nomproduit) {
	
	this.nomproduit=nomproduit;

}
	
	public String getmarqueproduit() {
		return marqueproduit;
		
	}
	
	
	public void setmarqueproduit(String marqueproduit) {
	
	this.marqueproduit=marqueproduit;

}
	
	public float getprixproduit() {
		return prixproduit;
		
	}
	
	
	public void setprixproduit(float prixproduit) {
	
	this.prixproduit=prixproduit;

}
	
	//méthodes
	
	@Override
	
	public String toString() {
		
		return "Produit{" +"nom du produit="+nomproduit+",marque du produit="
		+marqueproduit+",prix du produit"+prixproduit+"}";
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
