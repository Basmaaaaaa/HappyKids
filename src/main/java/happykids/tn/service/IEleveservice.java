package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Eleve;


public interface IEleveservice {

	// add, edit, delete, getAll, getByID
	public void addEleve(int qr_code, String nomEleve, String prenomEleve,Date date_naissance, int idparent, int idgroupe, String typeSang); 
	public void editEleve(int qr_code,String nomEleve, String prenomEleve,Date date_naissance, int idparent, int idgroupe, String typeSang );
	public void deleteEleve(int qr_code);
	public Eleve getByID(int qr_code);
	public List<Eleve>  getAll();
}
