package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Paiement;

public interface IPaiementDAO extends JpaRepository<Paiement, Integer>{

}
