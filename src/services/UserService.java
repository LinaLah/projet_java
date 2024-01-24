package services;
import java.util.ArrayList;
import java.util.List;
import clinique.User;

public class UserService {

	 private List<User> users;
	    public  UserService() {
	        this.users = new  ArrayList<>();
	    }
	    
	    // Ajouter un nouvel utilisateur
	    public void addUser(User user) {
	        users.add(user);
	    }
	    
	    // Trouver un utilisateur par login
	    public User getUserByLogin(String login) {
	        for (User user : users) {
	            if (user.getlogin().equals(login)) {
	                return user;
	            }
	             
	        }
	        return null;  // Utilisateur non trouvé
	    }
	    
	    
	    // Mettre à jour les informations d'un utilisateur
	    public void updateUser(User updatedUser) {
	        User existingUser = getUserByLogin(updatedUser.getlogin());
	        if (existingUser != null) {
	            // Mettre à jour les informations de l'utilisateur existant
	            existingUser.setnom(updatedUser.getnom());
	            existingUser.setprenom(updatedUser.getprenom());
	            existingUser.setadress(updatedUser.getadress());
	            existingUser.setpassword(updatedUser.getpassword());
	            existingUser.setage(updatedUser.getage());
	            existingUser.setphonenumber(updatedUser.getphonenumber());
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    
	    
	    // Supprimer un utilisateur
	    public void deleteUser(String login) {
	        User user = getUserByLogin(login);
	        if (user != null) {
	            users.remove(user);
	            System.out.println("User deleted successfully.");
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    
	    // Liste des utilisateurs
	    public List<User> getUsers() {
	        return users;
	    }
	    // Méthode de test pour afficher la liste des utilisateurs
	    public void displayUsers() {
	        for (User user : users) {
	            System.out.println(user.toString());
	        }
	    }

		
		

		
}
