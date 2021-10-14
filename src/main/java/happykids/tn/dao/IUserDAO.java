package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.User; 

public interface IUserDAO extends JpaRepository<User, Integer> {
    public User findByLogin(String login); 
}
