package happykids.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import happykids.tn.entities.Message;

 

public interface IMessageDAO extends  JpaRepository<Message, Integer>{

}
