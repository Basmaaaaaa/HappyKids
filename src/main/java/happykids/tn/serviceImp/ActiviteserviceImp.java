package happykids.tn.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IActiviteDAO;
import happykids.tn.dao.IGroupeDAO;
import happykids.tn.entities.Activite;
import happykids.tn.service.IActiviteservice;
@Service
@Transactional
public class ActiviteserviceImp implements IActiviteservice{
	@Autowired
	 IActiviteDAO activiteDAO;
	@Autowired
	IGroupeDAO  groupeDAO;

	@Override
	public void addActivite( String nom, String description, int idgroupe, Date date ) {
		Activite a = new Activite();
		a.setNom(nom);
		a.setDateActivite(date);
		a.setDatePublication(new Date());
		a.setDescription(description);
		a.setGroupe(groupeDAO.findOne(idgroupe));
		activiteDAO.save(a);
	
	}

	@Override
	public void editActivite(int idActivite,String nom,   String description, int idgroupe, Date date ) {
		Activite a =activiteDAO.findOne(idActivite);
		a.setNom(nom);
		a.setDateActivite(date);
		a.setDatePublication(new Date());
		a.setDescription(description);
		a.setGroupe(groupeDAO.findOne(idgroupe));
		activiteDAO.save(a);	
		
	}

	@Override
	public void deleteActivite(int idActivite) {
		activiteDAO.delete(idActivite);
		
	}

	@Override
	public Activite getById(int idActivite) {
		
		return activiteDAO.findOne(idActivite) ;
	}

	@Override
	public List<Activite> getAll() {
		
		return activiteDAO.findAll();
	}




}
