package happykids.tn.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IUserDAO;
import happykids.tn.entities.User;
import happykids.tn.service.IUserservice;

@Transactional
@Service
public class UserserviceImp implements IUserservice{
	@Autowired
	IUserDAO  userDAO ;

	@Override
	public User getUserByLoginnnn(String login) {
		// TODO Auto-generated method stub
		return userDAO.findByLogin(login);
	} 

}
