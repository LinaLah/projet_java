package services;

import java.util.ArrayList;
import java.util.List;
import clinique.Medecins;

public class MedecinsService {
	
	 private List<Medecins> medecins;
	    public MedecinsService() {
	        this.medecins = new ArrayList<>();
	    }

	    // Ajouter un nouvel utilisateur
	    public void addMedecins(Medecins medecin) {
	        medecins.add(medecin);
	    }
	
	    // Trouver un utilisateur par login
	    public Medecins getMedecinsbyLogin(String login) {
	        for (Medecins medecins : medecins) {
	            if (medecins.getlogin().equals(login)) {
	                return medecins;
	            }
	        }
	        return null; // Utilisateur non trouvé
	    } 
	    
	    // Mettre à jour les informations d'un utilisateur
	    public void updateMedecins(Medecins updatedMedecins) {
	       Medecins existingMedecins = getMedecinsbyLogin(updatedMedecins.getlogin());
	        if (existingMedecins != null) {
	            // Mettre à jour les informations de l'utilisateur existant
	            existingMedecins.setnom(updatedMedecins.getnom());
	            existingMedecins.setprenom(updatedMedecins.getprenom());
	            existingMedecins.setage(updatedMedecins.getage());
	            existingMedecins.setspécialité(updatedMedecins.getspécialité());
	            existingMedecins.setexpérience(updatedMedecins.getexpérience());
	        } else {
	            System.out.println("Medecin not found.");
	        }
	    }
	    
	    // Supprimer un utilisateur
	    public void deleteMedecins(String login) {
	    	Medecins medecin = getMedecinsbyLogin(login);
	        if (medecins != null) {
	        	medecins.remove(medecin);
	            System.out.println("Medecins deleted successfully.");
	        } else {
	            System.out.println("Medecins not found.");
	        }
	    }
	    
	    // Liste des utilisateurs
	    public List<Medecins> getMedecins() {
	        return medecins;
	    }
	    // Méthode de test pour afficher la liste des utilisateurs
	    public void displayMedecins() {
	        for (Medecins medecin : medecins) {
	            System.out.println(medecin.toString());
	        }
	    }  
	    
	    
}
