package happykids.tn.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Medecin  extends User{
	
	
	@OneToMany(mappedBy="medecin", cascade= CascadeType.ALL)
	private List<Visite_medical> visites;

	public List<Visite_medical> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite_medical> visites) {
		this.visites = visites;
	}

	 

}
