package happykids.tn.service;

import java.util.List;

import happykids.tn.entities.Medecin;

public interface IMedecinservice {
 
	// add, edit, delete, getAll, getByID
	public void addMedecin(String nom, String prenom, String adresse, int numTel, String login, String motdepasse);
	public void editMedecin(int id ,String nom, String prenom, String adresse, int numTel, String login, String motdepasse);
	public void deleteMedecin(int id);
	public Medecin getById(int id);
	public List<Medecin> getAll();
	public void bloquerMedecin(int id); 
	
	
}
