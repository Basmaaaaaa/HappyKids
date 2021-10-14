package happykids.tn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_message;
	private Date date_envoie;
	private String sujet ; 
	private String contenue; 
	
	@ManyToOne
	@JoinColumn(name="emmetteur_id")
	private User userr ; 
	
	@ManyToOne
	@JoinColumn(name="recepteur_id")
	private User utilisateur ;

	public int getId_message() {
		return id_message;
	}

	public void setId_message(int id_message) {
		this.id_message = id_message;
	}

	public Date getDate_envoie() {
		return date_envoie;
	}

	public void setDate_envoie(Date date_envoie) {
		this.date_envoie = date_envoie;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContenue() {
		return contenue;
	}

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	public User getUserr() {
		return userr;
	}

	public void setUserr(User userr) {
		this.userr = userr;
	}

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
 

 
	 
}
