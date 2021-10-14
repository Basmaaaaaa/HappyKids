package happykids.tn.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IEnseignantDAO;
import happykids.tn.dao.IGroupeDAO;
import happykids.tn.entities.Enseignant;
import happykids.tn.service.IEnseignantservice;

@Service
@Transactional
public class EnseignantserviceImp implements IEnseignantservice {
	@Autowired
	IEnseignantDAO enseignantDAO;
	@Autowired
	IGroupeDAO groupeDAO;
	
	@Override
	public void addEnseignant(String nom, String prenom, String adresse, int numTel, String login, String motdepasse,
			  String specialite, int groupe) {
		Enseignant e = new Enseignant();
		e.setNom(nom);
		e.setPrenom(prenom);
		e.setAdresse(adresse);
		e.setNumTel(numTel);
		e.setLogin(login); 
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		String mdp_crypte = encoder.encodePassword(motdepasse, null); 
		e.setMotdepasse(mdp_crypte); 
		e.setRoleUser("ROLE_ENSEIGNANT");
		e.setGroupe(groupeDAO.findOne(groupe));
		e.setActive(true);
		e.setSpecialite(specialite); 
		enseignantDAO.save(e);

	}

	@Override
	public void editEnseignant(int id, String nom, String prenom, String adresse, int numTel, String login,
			String motdepasse,  String specialite, int groupe) {
		Enseignant e = enseignantDAO.findOne(id);
		e.setNom(nom);
		e.setPrenom(prenom);
		e.setAdresse(adresse);
		e.setNumTel(numTel);
		e.setLogin(login);
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		String mdp_crypte = encoder.encodePassword(motdepasse, null);
		e.setGroupe(groupeDAO.findOne(groupe));
		e.setMotdepasse(mdp_crypte); 
		e.setSpecialite(specialite);
		enseignantDAO.save(e);

	}

	@Override
	public void deleteEnseignant(int id) {
		enseignantDAO.delete(id);

	}

	@Override
	public Enseignant getByID(int id) {

		return enseignantDAO.findOne(id);
	}

	@Override
	public List<Enseignant> getAll() {

		return enseignantDAO.findAll();
	}

}
