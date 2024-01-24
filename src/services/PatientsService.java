package services;

import java.util.ArrayList;
import java.util.List;
import clinique.Patients;

public class PatientsService {
	
	
	 private List<Patients> patients;
	    public PatientsService() {
	        this.patients = new ArrayList<>();
	    }

	    // Ajouter un nouvel utilisateur
	    public void addPatients(Patients patient) {
	        patients.add(patient);
	    }
	
	    // Trouver un utilisateur par login
	    public Patients getPatientsbyLogin(String login) {
	        for (Patients patients : patients) {
	            if (patients.getlogin().equals(login)) {
	                return patients;
	            }
	        }
	        return null; // Utilisateur non trouvé
	    } 
	    
	    // Mettre à jour les informations d'un utilisateur
	    public void updatePatients(Patients updatedPatients) {
	       Patients existingPatients = getPatientsbyLogin(updatedPatients.getlogin());
	        if (existingPatients != null) {
	            // Mettre à jour les informations de l'utilisateur existant
	            existingPatients.setnom(updatedPatients.getnom());
	            existingPatients.setprenom(updatedPatients.getprenom());
	            existingPatients.setage(updatedPatients.getage());
	            existingPatients.setmaladies(updatedPatients.getmaladies());
	            existingPatients.settraitements(updatedPatients.gettraitements());
	        } else {
	            System.out.println("Patient not found.");
	        }
	    }
	    
	    
	    // Supprimer un utilisateur
	    public void deletePatients(String login) {
	    	Patients patient = getPatientsbyLogin(login);
	        if (patients != null) {
	        	patients.remove(patient);
	            System.out.println("Patients deleted successfully.");
	        } else {
	            System.out.println("Patients not found.");
	        }
	    }
	    
	    // Liste des utilisateurs
	    public List<Patients> getPatients() {
	        return patients;
	    }
	    // Méthode de test pour afficher la liste des utilisateurs
	    public void displayPatients() {
	        for (Patients patient : patients) {
	            System.out.println(patient.toString());
	        }
	    }  
	    
}
