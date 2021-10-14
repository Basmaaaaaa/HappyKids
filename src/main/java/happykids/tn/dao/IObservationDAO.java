package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Observation;

public interface IObservationDAO extends JpaRepository<Observation, Integer>{

}
