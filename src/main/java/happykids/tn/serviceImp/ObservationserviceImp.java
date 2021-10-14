package happykids.tn.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IEleveDAO;
import happykids.tn.dao.IEnseignantDAO;
import happykids.tn.dao.IObservationDAO;
import happykids.tn.entities.Observation;
import happykids.tn.service.IObservationservice;

@Service
@Transactional
public class ObservationserviceImp implements IObservationservice{
	@Autowired
	IObservationDAO observationDAO;
	@Autowired
	IEleveDAO eleveDAO;
	@Autowired
	IEnseignantDAO ensDAO;
	
	
	@Override
	public void addObservation(String message,  int ideleve, int enseignant) {
		Observation ob= new Observation();
		ob.setMessage(message);
		ob.setDate_observation(new Date());
		ob.setEleve(eleveDAO.findOne(ideleve));
		ob.setEnseignant(ensDAO.findOne(enseignant));
		observationDAO.save(ob);
		
	}

	@Override
	public void editObservation(int idObservation, String message,  int ideleve) {
		Observation ob=observationDAO.findOne(idObservation);
		ob.setMessage(message);
		ob.setDate_observation(new Date());
		ob.setEleve(eleveDAO.findOne(ideleve));
		observationDAO.save(ob);
		
	}

	@Override
	public void deleteObservation(int idObservation) {
		observationDAO.delete(idObservation);
		
	}

	@Override
	public Observation getById(int idObservation) {
		return observationDAO.findOne(idObservation);
		
	}

	@Override
	public List<Observation> getAll() {
	
		return observationDAO.findAll();
	}




}
