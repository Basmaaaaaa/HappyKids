package happykids.tn.service;

import java.util.List;

import happykids.tn.entities.Groupe;

public interface IGroupeservice  {
 
	// add, edit, delete, getAll, getByID
	public void addGroupe(String nom_groupe);
	public void editGroupe(int id_groupe , String nom_groupe);
	public void deleteGroupe(int id_groupe);
	public Groupe getByID(int id_groupe);
	public List <Groupe> getAll();
}
