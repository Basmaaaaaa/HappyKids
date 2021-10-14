package happykids.tn.service;

import java.util.Date;
import java.util.List;

import happykids.tn.entities.Message;

public interface IMessageservice {
	 
	// send, delete, getAll
	public void send(Date date_envoie,String sujet,String contenue,int idemmetteur,int idrecepteur);
	public void deleteMessage(int id_message);
	public List<Message> getAll(int id);
	public Message getMessageById(int id); 
	
}
