package happykids.tn.service;

import java.util.List;

import happykids.tn.entities.Enseignant;

public interface IEnseignantservice {

	// add, edit, delete, getAll, getByID
	public void addEnseignant(String nom, String prenom, String adresse, int numTel, String login, String motdepasse,
			 String specialite, int groupe);

	public void editEnseignant(int id, String nom, String prenom, String adresse, int numTel, String login,
			String motdepasse,  String specialite,  int groupe);

	public void deleteEnseignant(int id);

	public Enseignant getByID(int id);

	public List<Enseignant> getAll();

}
