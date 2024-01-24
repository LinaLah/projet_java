package services;

import java.util.ArrayList;
import java.util.List;
import clinique.Infirmiers;


public class InfirmiersService {
	
	 private List<Infirmiers> infirmiers;
	    public InfirmiersService() {
	        this.infirmiers = new ArrayList<>();
	    }
	
	    // Ajouter un nouvel utilisateur
	    public void addInfirmiers(Infirmiers infirmier) {
	        infirmiers.add(infirmier);
	    }
	
	    // Trouver un utilisateur par login
	    public Infirmiers getInfirmiersbyLogin(String login) {
	        for (Infirmiers infirmiers : infirmiers) {
	            if (infirmiers.getlogin().equals(login)) {
	                return infirmiers;
	            }
	        }
	        return null; // Utilisateur non trouvé
	    } 
	    
	    // Mettre à jour les informations d'un utilisateur
	    public void updateInfirmiers(Infirmiers updatedInfirmiers) {
	       Infirmiers existingInfirmiers = getInfirmiersbyLogin(updatedInfirmiers.getlogin());
	        if (existingInfirmiers != null) {
	            // Mettre à jour les informations de l'utilisateur existant
	            existingInfirmiers.setnom(updatedInfirmiers.getnom());
	            existingInfirmiers.setprenom(updatedInfirmiers.getprenom());
	            existingInfirmiers.setage(updatedInfirmiers.getage());
	            existingInfirmiers.setexperience(updatedInfirmiers.getexperience());
	            
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    
	    // Supprimer un utilisateur
	    public void deleteInfirmiers(String login) {
	        Infirmiers infirmier = getInfirmiersbyLogin(login);
	        if (infirmiers != null) {
	        	infirmiers.remove(infirmier);
	            System.out.println("Employes deleted successfully.");
	        } else {
	            System.out.println("Infirmier not found.");
	        }
	    }
	    
	    // Liste des utilisateurs
	    public List<Infirmiers> getInfirmiers() {
	        return infirmiers;
	    }
	    // Méthode de test pour afficher la liste des utilisateurs
	    public void displayInfirmiers() {
	        for (Infirmiers infirmier : infirmiers) {
	            System.out.println(infirmier.toString());
	        }
	    }  
	    
	    
	    
	    
}
