package happykids.tn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Paiement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_paiement ; 
	private Date date_paiement ; 
	private String mois; 
	private int annee; 
	private double montant ; 
	private String remarque  ; 
	
	@ManyToOne
	@JoinColumn(name="eleve_id")
	private Eleve eleve ;

	public int getNum_paiement() {
		return num_paiement;
	}

	public void setNum_paiement(int num_paiement) {
		this.num_paiement = num_paiement;
	}

	public Date getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	
	
}
