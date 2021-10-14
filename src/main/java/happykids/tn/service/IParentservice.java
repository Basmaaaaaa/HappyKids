package happykids.tn.service;

import java.util.List;

import happykids.tn.entities.Parent;

public interface IParentservice {

	// add, edit, delete, getAll, getByID
	public void addParent(String nom, String prenom, String adresse, int numTel, String login, String motdepasse,
			 int num_tel2);

	public void editParent(int id, String nom, String prenom, String adresse, int numTel, String login, int num_tel2);

	public void deleteParent(int id);

	public Parent getById(int id);

	public List<Parent> getAll();

}
