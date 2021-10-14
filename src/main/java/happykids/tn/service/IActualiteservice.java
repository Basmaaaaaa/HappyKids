package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Actualite;

public interface IActualiteservice {
	 
	// add, edit, delete, getAll, getByID
	
	public void addActualite( String nom_actualite,Date date_actualite,String description,String type_actualite);
	public void editActualite(int id_actualite , String nom_actualite,Date date_actualite,
			String description,String type_actualite);
	public void deleteActualite(int id_actualite);
	public Actualite getByID(int id_actualite);
	public List <Actualite> getAll();
	
}
