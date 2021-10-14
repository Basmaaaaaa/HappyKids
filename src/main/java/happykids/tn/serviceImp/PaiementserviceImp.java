package happykids.tn.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IEleveDAO;
import happykids.tn.dao.IPaiementDAO;
import happykids.tn.entities.Paiement;
import happykids.tn.service.IPaiementservice;
@Transactional
@Service
public class PaiementserviceImp implements IPaiementservice {
	@Autowired
	IEleveDAO eleveDAO;
	@Autowired
	IPaiementDAO paiementDAO;

	@Override
	public void addPaiement(int ideleve,Date date_paiement, String mois, int annee, double montant, String remarque) {
		Paiement P = new Paiement();
		P.setEleve(eleveDAO.findOne(ideleve));
		P.setDate_paiement(date_paiement);
		P.setMois(mois);
		P.setAnnee(annee);
		P.setMontant(montant);
		P.setRemarque(remarque);
	
		paiementDAO.save(P);

	}

	@Override
	public void editPaiement(int num_paiement, int ideleve,Date date_paiement, String mois, int annee, double montant,
			String remarque) {
		Paiement P = paiementDAO.findOne(num_paiement);
		P.setEleve(eleveDAO.findOne(ideleve));
		P.setDate_paiement(date_paiement);
		P.setMois(mois);
		P.setAnnee(annee);
		P.setMontant(montant);
		P.setRemarque(remarque);
		
		paiementDAO.save(P);

	}

	@Override
	public Paiement getById(int num_paiement) {
		
		return paiementDAO.findOne(num_paiement);
	}

	@Override
	public List<Paiement> getAll() {
		
		return paiementDAO.findAll();
	}

}
