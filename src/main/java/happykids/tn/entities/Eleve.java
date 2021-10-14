package happykids.tn.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Eleve {
 
	@Id 
	private int qr_code;
	private String nomEleve; 
	private String prenomEleve;
	@Temporal(TemporalType.DATE)
	private Date date_naissance;
	
	private String typeSanguin; 
	
	@OneToMany(mappedBy="eleve", cascade= CascadeType.ALL)
	private List<Observation> observations ; 
	
	@OneToMany(mappedBy="eleve", cascade= CascadeType.ALL)
	private List<Visite_medical> visete_medicales ;
	
	@ManyToOne
	@JoinColumn(name="groupe_id")
	private Groupe groupe; 
	 
	
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Parent parent ; 
	
	@OneToMany(mappedBy="eleve", cascade= CascadeType.ALL)
	private List<Paiement> paiements;

	
	
	
	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public int getQr_code() {
		return qr_code;
	}

	public void setQr_code(int qr_code) {
		this.qr_code = qr_code;
	}

	 

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public List<Visite_medical> getVisete_medicales() {
		return visete_medicales;
	}

	public void setVisete_medicales(List<Visite_medical> visete_medicales) {
		this.visete_medicales = visete_medicales;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public List<Paiement> getPaiements() {
		return paiements;
	}

	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}

	public String getNomEleve() {
		return nomEleve;
	}

	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}

	public String getPrenomEleve() {
		return prenomEleve;
	}

	public void setPrenomEleve(String prenomEleve) {
		this.prenomEleve = prenomEleve;
	}

	public String getTypeSanguin() {
		return typeSanguin;
	}

	public void setTypeSanguin(String typeSanguin) {
		this.typeSanguin = typeSanguin;
	}
	
	
	
	

}
