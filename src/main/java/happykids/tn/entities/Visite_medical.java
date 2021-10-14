package happykids.tn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Visite_medical {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_visite;
	@Temporal(TemporalType.DATE)
	private Date date_visite;
 
	private double taille; 
	private double poids; 
	
	private String remarques; 
	 
	@ManyToOne
	@JoinColumn(name="medecin_id")
	private Medecin medecin; 
	
	@ManyToOne
	@JoinColumn(name="eleve_id")
	private Eleve eleve ;

	public int getId_visite() {
		return id_visite;
	}

	public void setId_visite(int id_visite) {
		this.id_visite = id_visite;
	}

	public Date getDate_visite() {
		return date_visite;
	}

	public void setDate_visite(Date date_visite) {
		this.date_visite = date_visite;
	}

	

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	

	
}
