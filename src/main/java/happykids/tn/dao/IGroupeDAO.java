package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Groupe;

public interface IGroupeDAO extends JpaRepository<Groupe, Integer> {

}
