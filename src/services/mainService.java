package services;


import clinique.Employés;
import clinique.User;
import clinique.Infirmiers;
import clinique.Medecins;
import clinique.Patients;
import clinique.Produit;



public class mainService {
	
public static void main(String[] args) {
		
		
		System.out.println("******** Classe UserService ********");
		System.out.println();
		User user = new User("laila","laila",20);
		UserService userservice1= new UserService();
		userservice1.addUser(user);
		String login=user.getlogin();
		userservice1.getUserByLogin(login);
		userservice1.updateUser(user);
		userservice1.deleteUser(login);
		
		
		System.out.println("******** Classe EmployesService ********");
		System.out.println();
		Employés employe1=new Employés("lina", "lina", 20,"kkk");
	    EmployesService employeservice1= new EmployesService();
		employeservice1.addEmployes(employe1);
		String login1=employe1.getlogin();
		employeservice1.getEmployesbyLogin(login1);
		employeservice1.updateEmployes(employe1);
		employeservice1.deleteEmployes(login);
		
		
		System.out.println("******** Classe InfirmiersService ********");
		System.out.println();
		Infirmiers infirmier1=new Infirmiers("lina", "lina", 20,5,"kkk");
	    InfirmiersService infirmierservice1= new InfirmiersService();
		infirmierservice1.addInfirmiers(infirmier1);
		String login2=infirmier1.getlogin();
		infirmierservice1.getInfirmiersbyLogin(login2);
		infirmierservice1.updateInfirmiers(infirmier1);
		infirmierservice1.deleteInfirmiers(login);
		
		
		System.out.println("******** Classe MedecinsService ********");
		System.out.println();
		Medecins medecin1=new Medecins("lina", "lina", 20,"kkk",10,"lina");
	    MedecinsService medecinservice1= new MedecinsService();
		medecinservice1.addMedecins(medecin1);
		String login3=medecin1.getlogin();
		medecinservice1.getMedecinsbyLogin(login3);
		medecinservice1.updateMedecins(medecin1);
		medecinservice1.deleteMedecins(login);
		
		
		System.out.println("******** Classe PatientsService ********");
		System.out.println();
		Patients patient1=new Patients("lina", "lina", 20,"kkk","kk");
	    PatientsService patientservice1= new PatientsService();
		patientservice1.addPatients(patient1);
		String login4=patient1.getlogin();
		patientservice1.getPatientsbyLogin(login4);
		patientservice1.updatePatients(patient1);
		patientservice1.deletePatients(login);
		
		
		System.out.println("******** Classe ProduitsService ********");
		System.out.println();
		Produit produit1=new Produit("jkl", "jkg", 20);
	    ProduitsService produitservice1= new ProduitsService();
		produitservice1.addProduits(produit1);
		String nomproduit1=produit1.getnomproduit();
		produitservice1.getProduitsbyName(nomproduit1);
		produitservice1.updateProduits(produit1);
		produitservice1.deleteProduits(nomproduit1);
		
		
		
		
}
		

}
