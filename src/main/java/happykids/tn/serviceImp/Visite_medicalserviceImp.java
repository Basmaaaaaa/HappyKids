package happykids.tn.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IEleveDAO;
import happykids.tn.dao.IMedecinDAO;
import happykids.tn.dao.IVisite_medicalDAO;
import happykids.tn.entities.Visite_medical;
import happykids.tn.service.IVisite_medicalservice;

@Service
@Transactional
public class Visite_medicalserviceImp implements IVisite_medicalservice {
	@Autowired
	IVisite_medicalDAO visite_medicalDAO;
	@Autowired
	IMedecinDAO medecinDAO;
	@Autowired
	IEleveDAO eleveDAO;

	@Override
	public void addVisite_medical(int ideleve, double taille, double poids, 
			String remarques, int idmedecin) {
		Visite_medical v = new Visite_medical();
		v.setEleve(eleveDAO.findOne(ideleve));
		v.setDate_visite(new Date()); 
		v.setTaille(taille);
		v.setPoids(poids);
		
		v.setRemarques(remarques); 
		v.setMedecin(medecinDAO.findOne(idmedecin));
		visite_medicalDAO.save(v);

	}

	@Override
	public void editVisite_medical(int id_visite,int ideleve,   double taille, double poids,
			 String remarques) {
		Visite_medical v = visite_medicalDAO.findOne(id_visite);
		v.setEleve(eleveDAO.findOne(ideleve));
		v.setDate_visite(new Date()); 
		v.setTaille(taille);
		v.setPoids(poids); 
		
		v.setRemarques(remarques); 
		visite_medicalDAO.save(v);

	}

	@Override
	public void deleteVisite_medical(int id_visite) {
		visite_medicalDAO.delete(id_visite);

	}

	@Override
	public Visite_medical getByID(int id_visite) {

		return visite_medicalDAO.findOne(id_visite);
	}

	@Override
	public List<Visite_medical> getAll() {

		return visite_medicalDAO.findAll();
	}
	 

}
