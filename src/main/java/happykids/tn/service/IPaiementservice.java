package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Paiement;

public interface IPaiementservice   {
	public void addPaiement(int ideleve,Date date_paiement ,String mois,int annee,double montant, String remarque);
	public void editPaiement(int num_paiement,int ideleve,Date date_paiement ,String mois,int annee,double montant, String remarque);

	public Paiement getById(int num_paiement);
	public List<Paiement> getAll();

}
