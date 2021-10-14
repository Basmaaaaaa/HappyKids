package happykids.tn.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IGroupeDAO;
import happykids.tn.entities.Groupe;
import happykids.tn.service.IGroupeservice;

@Service
@Transactional
public class GroupeserviceImp implements IGroupeservice {
	@Autowired
	IGroupeDAO groupeDAO;

	@Override
	public void addGroupe(String nom_groupe) {
		Groupe g = new Groupe();
		g.setNom_groupe(nom_groupe);
		groupeDAO.save(g);

	}

	@Override
	public void editGroupe(int id_groupe, String nom_groupe) {
		Groupe g = groupeDAO.findOne(id_groupe);
		g.setNom_groupe(nom_groupe);
		groupeDAO.save(g);

	}

	@Override
	public void deleteGroupe(int id_groupe) {
		groupeDAO.delete(id_groupe);

	}

	@Override
	public Groupe getByID(int id_groupe) {

		return groupeDAO.findOne(id_groupe);
	}

	@Override
	public List<Groupe> getAll() {

		return groupeDAO.findAll();
	}
	 
}
