package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Admin;

public interface IAdminDAO extends JpaRepository<Admin, Integer> {

}
