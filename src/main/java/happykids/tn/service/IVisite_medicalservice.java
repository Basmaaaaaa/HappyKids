package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Visite_medical;

public interface IVisite_medicalservice {
 
	

	// add, edit, delete, getAll, getByID
	public void addVisite_medical(int ideleve , double taille, double poids, 
			String remarques,int idmedecin );
	
	public void editVisite_medical(int id_visite,int ideleve,  double taille, double poids,
			String remarques );
	
	public void deleteVisite_medical(int id_visite);
	public Visite_medical getByID(int id_visite);
	public List<Visite_medical>  getAll();
}
