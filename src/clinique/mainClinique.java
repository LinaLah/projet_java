package clinique;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashSet;

public class mainClinique {

	public static void main(String[] args) {
		
		
		System.out.println("******** Classe User ********");
		System.out.println();
		User user1 = new User("laila","laila",20);
		System.out.println(user1.toString());
		
		
		System.out.println("******** Classe Employés ********");
		System.out.println();
		Employés employé1=new Employés("lina", "lina", 20,"kkk");
		System.out.println(employé1.toString());
		
		
		System.out.println("******** Classe Infirmiers ********");
		System.out.println();
		Infirmiers infirmier1=new Infirmiers("mohamed", "saleh",30,5, "kkk");
		System.out.println(infirmier1.toString());
		
		
		System.out.println("******** Classe Medecins ********");
		System.out.println();
		Medecins medecin1=new Medecins("mohamed", "mohamed", 50, "neurologue", 20, "kk");
		System.out.println(medecin1.toString());
		
		
		System.out.println("******** Classe Patients ********");
		System.out.println();
		Patients patient1=new Patients("mohamed","mansour", 60, "diabète", "insuline");
		System.out.println(patient1.toString());
		
		
		System.out.println("******** Classe Produits ********");
		System.out.println();
		Produit produit1=new Produit("TV", "samsung", 1500);
		System.out.println(produit1.toString());
		produit1.prixenpromo("TV",1500,1200);
		
		//Tableau
		
		System.out.println("******** Tableau ********");
		System.out.println();
		int taille = 10;
		int tab[]=new int[10];
		for(int i=0;i<taille;i++)
		{
			tab[i]=i;
		}
		System.out.println(	);
		for(int i=0;i<taille;i++)
		{
			System.out.print(	tab[i]+"|");
		}
		System.out.println(	);
		
		
		//Try and Catch
		
		System.out.println("******** Try Catch ********");
		System.out.println();
			int taille1 = 5;
			int tab1[]=new int[5];
			for(int i=0;i<taille1+1;i++)
			{try {
				tab1[i]=i;
			     }
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("vous avez depassé la taille de votre tableau");
			}
			}
			System.out.println(	);
			for(int i=0;i<taille1;i++)
			{
				System.out.print(	tab1[i]+"|");
			}
			System.out.println(	);
			
			
			
		//Map
			System.out.println("******** Map ********");
			System.out.println();
			
			System.out.println("******** HashMap ********");
			System.out.println("******** Map non Ordonné ********");
			System.out.println();
			Map<String,Integer> map1 = new HashMap<>();
			{
				map1.put("Fathi", 20);
				map1.put("Jawher", 27);
				map1.put("Anas", 21);
			}
			for (Map.Entry mapentry : map1.entrySet()) {
				 System.out.println("clé: "+mapentry.getKey() 
				 + " | valeur: " + mapentry.getValue());
				 }
			
			System.out.println(map1.containsKey("Aymen"));
			
			System.out.println("******** TreeMap ********");
			System.out.println("******** Map Ordonné ********");
			System.out.println();
			Map<String,Integer> map2 = new TreeMap<>();
			{
				map2.put("Dali", 20);
				map2.put("Aymen", 27);
				map2.put("Emir", 25);
				map2.put("Amin", 23);
				map2.put("Becem", 21);
			}
			for (Map.Entry mapentry : map2.entrySet()) {
				 System.out.println("clé: "+mapentry.getKey() 
				 + " | valeur: " + mapentry.getValue());
				 }
		//Set
			System.out.println("******** SET ********");
			System.out.println();
			
			System.out.println("******** HashSet ********");
			System.out.println("******** Set non Ordonné ********");
			
			 HashSet<String> hset = new HashSet<String>();
			 hset.add("walid");
			 hset.add("haythem");
			 hset.add("Lina");
			 hset.add("heni");
			 System.out.println();
			 for(String valeur:hset)
				 {System.out.print(valeur+"|");
			 
				 }
			
			 System.out.println();
			 System.out.println();
				
				System.out.println("******** TreeSet ********");
				System.out.println("******** Set Ordonné ********");
				System.out.println();
				
				TreeSet<String> tset = new TreeSet<String>();
				
				 tset.add("walid");
				 tset.add("haythem");
				 tset.add("Lina");
				 tset.add("heni");
				 
				 System.out.println();
				 for(String valeur:tset)
					 {System.out.print(valeur+"|");
				 
					 }
				 
				 System.out.println();
				 System.out.println();
			}

		
		
		
		
		
		
		
	}
	
	
	
	
	
	

