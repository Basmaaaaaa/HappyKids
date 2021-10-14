package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Enseignant;

public interface IEnseignantDAO extends JpaRepository<Enseignant, Integer>{

}
