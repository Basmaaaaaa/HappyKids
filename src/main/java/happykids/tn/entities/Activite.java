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
public class Activite {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idActivite ; 
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateActivite ; 
	@Temporal(TemporalType.DATE)
	private Date datePublication ; 
	private String description ; 
	
	@ManyToOne
	@JoinColumn(name="groupe_id")
	private Groupe groupe;

	public int getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public Date getDateActivite() {
		return dateActivite;
	}

	public void setDateActivite(Date dateActivite) {
		this.dateActivite = dateActivite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
 
	
	

}
