package happykids.tn.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Enseignant  extends User{
	 
	private String specialite;
	
 
	
	@ManyToOne
	@JoinColumn(name="groupe_id")
	private Groupe groupe; 
	
	
	@OneToMany(mappedBy="enseignant")
	private List<Observation> obs ; 
	
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public List<Observation> getObs() {
		return obs;
	}

	public void setObs(List<Observation> obs) {
		this.obs = obs;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	
	

}
