package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Actualite;

public interface IActualiteDAO extends JpaRepository<Actualite, Integer>{

}
