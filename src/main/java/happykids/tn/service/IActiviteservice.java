package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Activite;


public interface IActiviteservice {
	
		// add,  edit , delete,getById , getAll
	public void addActivite(String nom ,String description , int idgroupe, Date date );
	public void editActivite(int idActivite,String nom, String description , int idgroupe, Date date  );
	public void deleteActivite(int idActivite );
	public Activite getById(int idActivite);
	public List<Activite> getAll();

}
