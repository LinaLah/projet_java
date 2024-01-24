package services;

import java.util.ArrayList;
import java.util.List;

import clinique.Patients;
import clinique.Produit;


public class ProduitsService {
	
	 private List<Produit> produits;
	    public ProduitsService() {
	        this.produits = new ArrayList<>();
	    }

	    // Ajouter un nouvel utilisateur
	    public void addProduits(Produit produit) {
	        produits.add(produit);
	    }
	
	    // Trouver un utilisateur par login
	    public Produit getProduitsbyName(String nomproduit) {
	        for (Produit produit : produits) {
	            if (produit.getnomproduit().equals(nomproduit)) {
	                return produit;
	            }
	        }
	        return null; // Utilisateur non trouvé
	    } 
	
	
	    // Mettre à jour les informations d'un utilisateur
	    public void updateProduits(Produit updatedProduits) {
	       Produit existingProduits = getProduitsbyName(updatedProduits.getnomproduit());
	        if (existingProduits != null) {
	            // Mettre à jour les informations de l'utilisateur existant
	            existingProduits.setnomproduit(updatedProduits.getnomproduit());
	            existingProduits.setmarqueproduit(updatedProduits.getmarqueproduit());
	            existingProduits.setprixproduit(updatedProduits.getprixproduit());
	          
	        } else {
	            System.out.println("Patient not found.");
	        }
	    }
	    
	    
	    // Supprimer un utilisateur
	    public void deleteProduits(String nomproduit) {
	    	Produit produit = getProduitsbyName(nomproduit);
	        if (produits != null) {
	        	produits.remove(produit);
	            System.out.println("Produit deleted successfully.");
	        } else {
	            System.out.println("Produit not found.");
	        }
	    }
	    
	    // Liste des utilisateurs
	    public List<Produit> getProduits() {
	        return produits;
	    }
	    // Méthode de test pour afficher la liste des utilisateurs
	    public void displayProduits() {
	        for (Produit produit : produits) {
	            System.out.println(produit.toString());
	        }
	    }  
	    
	    
}
