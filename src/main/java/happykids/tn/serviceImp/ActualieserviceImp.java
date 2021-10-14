package happykids.tn.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import happykids.tn.dao.IActualiteDAO;
import happykids.tn.entities.Actualite;
import happykids.tn.service.IActualiteservice;

@Service
@Transactional
public class ActualieserviceImp implements IActualiteservice {
	@Autowired
	IActualiteDAO actualiteDAO;

	@Override
	public void addActualite(String nom_actualite,  Date date_actualite, String description,
			String type_actualite) {
		Actualite a = new Actualite();
		a.setNom_actualite(nom_actualite);
		a.setDatePublication(new Date());
		a.setDate_actualite(date_actualite);
		a.setDescription(description);
		a.setType_actualite(type_actualite);
		actualiteDAO.save(a);

	}

	@Override
	public void editActualite(int id_actualite, String nom_actualite,  Date date_actualite,
			String description, String type_actualite) {
		Actualite a = actualiteDAO.findOne(id_actualite);
		a.setNom_actualite(nom_actualite);
		a.setDatePublication(new Date());
		a.setDate_actualite(date_actualite);
		a.setDescription(description);
		a.setType_actualite(type_actualite);
		actualiteDAO.save(a);

	}

	@Override
	public void deleteActualite(int id_actualite) {
		actualiteDAO.delete(id_actualite);

	}

	@Override
	public Actualite getByID(int id_actualite) {

		return actualiteDAO.findOne(id_actualite);
	}

	@Override
	public List<Actualite> getAll() {

		return actualiteDAO.findAll();
	}

}
