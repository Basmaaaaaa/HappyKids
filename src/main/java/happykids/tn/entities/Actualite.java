package happykids.tn.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Actualite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_actualite;
	private String nom_actualite; 
	@Temporal(TemporalType.DATE)
	private Date datePublication;
	@Temporal(TemporalType.DATE)
	private Date date_actualite;
	private String description;
	private String type_actualite; 
 
	@ManyToMany(mappedBy = "actualites")
	private List<Groupe> groupes ;

	public int getId_actualite() {
		return id_actualite;
	}

	public void setId_actualite(int id_actualite) {
		this.id_actualite = id_actualite;
	}

	public String getNom_actualite() {
		return nom_actualite;
	}

	public void setNom_actualite(String nom_actualite) {
		this.nom_actualite = nom_actualite;
	}


	public Date getDate_actualite() {
		return date_actualite;
	}

	public void setDate_actualite(Date date_actualite) {
		this.date_actualite = date_actualite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType_actualite() {
		return type_actualite;
	}

	public void setType_actualite(String type_actualite) {
		this.type_actualite = type_actualite;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

}
