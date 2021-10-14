package happykids.tn.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idObservation ; 
	private String message ; 
	private Date date_observation;  // date systeme
	@ManyToOne
	@JoinColumn(name="eleve_id")
	private Eleve eleve;
	@ManyToOne
	@JoinColumn(name="enseignant_id")
	private Enseignant enseignant ; 
	
	
	public int getIdObservation() {
		return idObservation;
	}
	public void setIdObservation(int idObservation) {
		this.idObservation = idObservation;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate_observation() {
		return date_observation;
	}
	public void setDate_observation(Date date_observation) {
		this.date_observation = date_observation;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	} 
	
	
	

}
