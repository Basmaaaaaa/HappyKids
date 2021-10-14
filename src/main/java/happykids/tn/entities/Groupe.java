package happykids.tn.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Groupe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_groupe;
	private String nom_groupe;
	
	@OneToMany(mappedBy="groupe", cascade= CascadeType.ALL)
	private List<Eleve> eleves; 
	
	@OneToMany(mappedBy="groupe", cascade= CascadeType.ALL)
	private List<Activite> activite ; 
 
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "groupe_actualite",
	        joinColumns = @JoinColumn(name = "groupe_id", referencedColumnName = "id_groupe"),
	        inverseJoinColumns = @JoinColumn(name = "actualite_id", referencedColumnName = "id_actualite"))
	private List<Actualite> actualites;
	
  
	
	@OneToMany(mappedBy="groupe", cascade= CascadeType.ALL)
	private List<Enseignant> enseignant ;
	
	
	public List<Activite> getActivite() {
		return activite;
	}

	public void setActivite(List<Activite> activite) {
		this.activite = activite;
	}

	public int getId_groupe() {
		return id_groupe;
	}

	public void setId_groupe(int id_groupe) {
		this.id_groupe = id_groupe;
	}

	public String getNom_groupe() {
		return nom_groupe;
	}

	public void setNom_groupe(String nom_groupe) {
		this.nom_groupe = nom_groupe;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public List<Actualite> getActualites() {
		return actualites;
	}

	public void setActualites(List<Actualite> actualites) {
		this.actualites = actualites;
	}

	public List<Enseignant> getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(List<Enseignant> enseignant) {
		this.enseignant = enseignant;
	}

 

}
