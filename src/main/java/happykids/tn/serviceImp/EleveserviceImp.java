package happykids.tn.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IEleveDAO;
import happykids.tn.dao.IGroupeDAO;
import happykids.tn.dao.IParentDAO;
import happykids.tn.entities.Eleve;
import happykids.tn.service.IEleveservice;

@Service
@Transactional
public class EleveserviceImp implements IEleveservice {
	@Autowired
	IEleveDAO eleveDAO;
	@Autowired
	IParentDAO parentDAO;
	@Autowired
	IGroupeDAO groupeDAO;

	@Override
	public void addEleve(int qr_code,String nomEleve, String prenomEleve, Date date_naissance, int idparent, int idgroupe, String typeSang ) {
		Eleve el = new Eleve();
		el.setQr_code(qr_code);
		el.setNomEleve(nomEleve);
		el.setPrenomEleve(prenomEleve);
		el.setDate_naissance(date_naissance);
		el.setParent(parentDAO.findOne(idparent));
		el.setGroupe(groupeDAO.findOne(idgroupe));
		el.setTypeSanguin(typeSang);
		eleveDAO.save(el);

	}

	@Override
	public void editEleve(int qr_code, String nomEleve, String prenomEleve, Date date_naissance, int idparent,
			int idgroupe, String typeSang) {
		Eleve el = eleveDAO.findOne(qr_code);
		el.setNomEleve(nomEleve);
		el.setPrenomEleve(prenomEleve);
		el.setDate_naissance(date_naissance);
		el.setParent(parentDAO.findOne(idparent));
		el.setGroupe(groupeDAO.findOne(idgroupe));
		el.setTypeSanguin(typeSang);
		eleveDAO.save(el);

	}

	@Override
	public void deleteEleve(int qr_code) {
		eleveDAO.delete(qr_code);

	}

	@Override
	public List<Eleve> getAll() {

		return eleveDAO.findAll();
	}

	@Override
	public Eleve getByID(int qr_code) {

		return eleveDAO.findOne(qr_code);
	}
 
	 
}
