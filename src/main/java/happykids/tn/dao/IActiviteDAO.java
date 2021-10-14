package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Activite;

public interface IActiviteDAO extends JpaRepository<Activite,Integer>{

}
