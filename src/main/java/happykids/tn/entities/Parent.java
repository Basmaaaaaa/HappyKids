package happykids.tn.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Parent extends User{
   
	private int num_tel2; 
	 
	
	@OneToMany(mappedBy="parent", cascade= CascadeType.ALL)
	private List<Eleve> eleve;

	public int getNum_tel2() {
		return num_tel2;
	}

	public void setNum_tel2(int num_tel2) {
		this.num_tel2 = num_tel2;
	}


	public List<Eleve> getEleve() {
		return eleve;
	}

	public void setEleve(List<Eleve> eleve) {
		this.eleve = eleve;
	} 
	
}
