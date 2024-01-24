package services;

import java.util.ArrayList;
import java.util.List;
import clinique.Employés;


public class EmployesService {

	 private List<Employés> employes;
	    public EmployesService() {
	        this.employes = new ArrayList<>();
	    }
	    
	    // Ajouter un nouvel utilisateur
	    public void addEmployes(Employés employe) {
	        employes.add(employe);
	    }
	
	    // Trouver un utilisateur par nom
	    public Employés getEmployesbyLogin(String login) {
	        for (Employés employes : employes) {
	            if (employes.getlogin().equals(login)) {
	                return employes;
	            }
	        }
	        return null; // Utilisateur non trouvé
	    } 
	    
	    // Mettre à jour les informations d'un utilisateur
	    public void updateEmployes(Employés updatedEmployes) {
	       Employés existingEmployes = getEmployesbyLogin(updatedEmployes.getlogin());
	        if (existingEmployes != null) {
	            // Mettre à jour les informations de l'utilisateur existant
	            existingEmployes.setnom(updatedEmployes.getnom());
	            existingEmployes.setprenom(updatedEmployes.getprenom());
	            existingEmployes.setage(updatedEmployes.getage());
	          
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    
	    // Supprimer un utilisateur
	    public void deleteEmployes(String login) {
	        Employés employe = getEmployesbyLogin(login);
	        if (employes != null) {
	        	employes.remove(employe);
	            System.out.println("Employes deleted successfully.");
	        } else {
	            System.out.println("Employe not found.");
	        }
	    }
	    
	    // Liste des utilisateurs
	    public List<Employés> getEmployes() {
	        return employes;
	    }
	    // Méthode de test pour afficher la liste des utilisateurs
	    public void displayEmployes() {
	        for (Employés employe : employes) {
	            System.out.println(employe.toString());
	        }
	    }  
	    
	    
	    
	  
}
