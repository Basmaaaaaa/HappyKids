package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Observation;

public interface IObservationservice {
    //add delete edit getAll getById
	public void addObservation(String message,  int ideleve, int enseignant);
	public void  editObservation(int idObservation ,String message, int ideleve);
	public void deleteObservation(int idObservation );
	public Observation getById(int idObservation);
	public List<Observation> getAll();
}
