package controllers;
import java.util.Scanner;
import services.UserService;
import clinique.User;
public class UserController {

	
	 private UserService userService;
	    private Scanner scanner;
	    public UserController(UserService userService) {
	        this.userService = userService;
	        this.scanner = new Scanner(System.in);
	    }
	    
	    
	    public void createUser(User user1) {
	        System.out.println("Enter user details:");
	        System.out.print("id: ");
	        int id = scanner.nextInt();
	        System.out.print("Nom: ");
	        String nom = scanner.nextLine();
	        System.out.print("Prenom: ");
	        String prenom = scanner.nextLine();
	        System.out.print("Age: ");
	        int age = scanner.nextInt();
	        System.out.print("Login: ");
	        String login = scanner.nextLine();
	        System.out.print("Password: ");
	        String password = scanner.nextLine();
	        System.out.print("Adresse: ");
	        String adress = scanner.nextLine();
	        System.out.print("Phone number: ");
	       int phonenumber = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character 
	        User user11 = new User(1,"","",10, "","", "",00);
	        User newUser =  userService.addUser(user11);
	        System.out.println("User created successfully.");
	    }
	    
	    
	    public void readUserByLogin() {
	        System.out.println("Enter user login to read: ");
	        String login = scanner.nextLine();
	        User user = userService.getUserByLogin(login);
	        if (user != null) {
	            System.out.println("User details:\n" + user);
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	
	
	    public void updateUser() {
	        System.out.println("Enter user login to update: ");
	        String login = scanner.nextLine();
	        User existingUser = userService.getUserByLogin(login);
	        if (existingUser != null) {
	            System.out.println("Enter updated user details:");
	            System.out.println("Enter user details:");
		        System.out.print("id: ");
		        int id = scanner.nextInt();
	            System.out.print("Nom: ");
		        String nom = scanner.nextLine();
		        System.out.print("Prenom: ");
		        String prenom = scanner.nextLine();
		        System.out.print("Age: ");
		        int age = scanner.nextInt();
		        System.out.print("Login: ");
		        String login1 = scanner.nextLine();
		        System.out.print("Password: ");
		        String password = scanner.nextLine();
		        System.out.print("Adresse: ");
		        String adress = scanner.nextLine();
		        System.out.print("Phone number: ");
		        int phonenumber = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline character 
	            User updatedUser = new User(id, nom, prenom, age, login, password, adress, phonenumber);
	            userService.updateUser(updatedUser);
	            System.out.println("User updated successfully.");
	        } else {
	            System.out.println("User not found for update.");
	        }
	    }
	
	    public void deleteUser() {
	        System.out.println("Enter user login to delete: ");
	        String login = scanner.nextLine();
	        User user = userService.readUserByLogin(login);
	        if (user != null) {
	            userService.deleteUser(user);
	            System.out.println("User deleted successfully.");
	        } else {
	            System.out.println("User not found.");
	        }
	    }
	    
}
