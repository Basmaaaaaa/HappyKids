package happykids.tn.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IMedecinDAO;
import happykids.tn.entities.Medecin;
import happykids.tn.service.IMedecinservice;

@Service
@Transactional
public class MedecinserviceImp implements IMedecinservice {
	@Autowired
	IMedecinDAO medecinDAO;

	@Override
	public void addMedecin(String nom, String prenom, String adresse, int numTel, String login, String motdepasse) {
		Medecin m = new Medecin();
		m.setNom(nom);
		m.setPrenom(prenom);
		m.setAdresse(adresse);
		m.setNumTel(numTel);
		m.setLogin(login);
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		String mdp_crypte = encoder.encodePassword(motdepasse, null);
		m.setMotdepasse(mdp_crypte); 
		m.setRoleUser("ROLE_MEDECIN");
		m.setActive(true);
		medecinDAO.save(m);

	}

	@Override
	public void editMedecin(int id, String nom, String prenom, String adresse, int numTel, String login,
			String motdepasse) {
		Medecin m = medecinDAO.findOne(id);
		m.setNom(nom);
		m.setPrenom(prenom);
		m.setAdresse(adresse);
		m.setNumTel(numTel);
		m.setLogin(login);
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		String mdp_crypte = encoder.encodePassword(motdepasse, null);
		m.setMotdepasse(mdp_crypte);

		medecinDAO.save(m);

	}

	@Override
	public void deleteMedecin(int id) {
		medecinDAO.delete(id);

	}

	@Override
	public Medecin getById(int id) {

		return medecinDAO.findOne(id);
	}

	@Override
	public List<Medecin> getAll() {

		return medecinDAO.findAll();
	}

	@Override
	public void bloquerMedecin(int id) {
		Medecin m = medecinDAO.findOne(id); 
		m.setActive(false);
		medecinDAO.save(m); 
	}

	


}
