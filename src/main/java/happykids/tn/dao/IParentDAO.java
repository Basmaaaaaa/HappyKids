package happykids.tn.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Parent;

public interface IParentDAO extends JpaRepository<Parent, Integer> {

}
