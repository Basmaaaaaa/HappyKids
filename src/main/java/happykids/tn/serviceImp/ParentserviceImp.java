package happykids.tn.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IParentDAO;
import happykids.tn.entities.Parent;
import happykids.tn.service.IParentservice;

@Service
@Transactional
public class ParentserviceImp implements IParentservice {
	@Autowired
	IParentDAO parentDAO;

	@Override
	public void addParent(String nom, String prenom, String adresse, int numTel, String login, String motdepasse,
			 int num_tel2) {
		Parent p = new Parent();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAdresse(adresse);
		p.setNumTel(numTel);
		p.setLogin(login);
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		String mdp_crypte = encoder.encodePassword(motdepasse, null);
		p.setMotdepasse(mdp_crypte);
		p.setRoleUser("ROLE_PARENT");
		p.setActive(true);
		p.setNum_tel2(num_tel2);
		
		parentDAO.save(p);
	}

	@Override
	public void editParent(int id, String nom, String prenom, String adresse, int numTel, String login, int num_tel2) {
		Parent p = parentDAO.findOne(id);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAdresse(adresse);
		p.setNumTel(numTel);
		p.setLogin(login);
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		
		
		
		p.setNum_tel2(num_tel2);
		
		parentDAO.save(p);

	}

	@Override
	public void deleteParent(int id) {
		parentDAO.delete(id);

	}

	@Override
	public Parent getById(int id) {

		return parentDAO.findOne(id);
	}

	@Override
	public List<Parent> getAll() {

		return parentDAO.findAll();
	}

}
