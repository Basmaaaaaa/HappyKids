package happykids.tn.serviceImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IMessageDAO;
import happykids.tn.dao.IUserDAO;
import happykids.tn.entities.Message;
import happykids.tn.service.IMessageservice;
@Service
@Transactional
public class MessageserviceImp implements IMessageservice {
	@Autowired
	IMessageDAO messageDAO;
	@Autowired
	IUserDAO userDAO;

	@Override
	public void send(Date date_envoie, String sujet, String contenue, int idemmetteur, int idrecepteur) {
		Message msg=new Message();
		msg.setDate_envoie(date_envoie);
		msg.setSujet(sujet);
		msg.setContenue(contenue);  
		msg.setUserr(userDAO.findOne(idemmetteur));
		msg.setUtilisateur(userDAO.findOne(idrecepteur));
		
		
	}

	@Override
	public void deleteMessage(int id_message) {
		messageDAO.delete(id_message);
		
	}

	 

	@Override
	public List<Message> getAll(int id) {
		List<Message> msg = new ArrayList<Message>();
		List<Message> all = messageDAO.findAll();
		for(int i=0; i<all.size();i++) {
			if(all.get(i).getUtilisateur().getId()==id) {
				msg.add(all.get(i));
			}
		}
		return msg;
	}

	@Override
	public Message getMessageById(int id) {
		// TODO Auto-generated method stub
		return messageDAO.findOne(id);
	}


	 
}
