
package happykids.tn.controleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.entities.Activite;
import happykids.tn.entities.Enseignant;
import happykids.tn.entities.User;
import happykids.tn.service.IActiviteservice;
import happykids.tn.service.IEnseignantservice;
import happykids.tn.service.IGroupeservice;

@Controller
public class ActiviteControlleur {
	@Autowired
	IActiviteservice activiteService;
	@Autowired
	IGroupeservice groupeService;
	@Autowired
	IEnseignantservice ensService ; 
	
	
	@InitBinder
	public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {
	    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
	    binder.registerCustomEditor(Date.class, "dateActivite" ,new CustomDateEditor(dateFormat, true));  
	    /*final SimpleDateFormat heureFormat = new SimpleDateFormat("HH:mm:ss", locale);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(heureFormat, true));  */
	}
	
	@RequestMapping("/listActivites")
	public String all(Model model) {
		model.addAttribute("ACTIVITE", activiteService.getAll());
		return "listActivites";
	}
	@RequestMapping("/ajoutActivite")
	public String ajout(Model model, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("USER"); 
		Enseignant e = ensService.getByID(user.getId());
		model.addAttribute("ACTIVITE",  new Activite());
		model.addAttribute("GR",e.getGroupe().getId_groupe());
			return "ajoutActivite";
	}
	
	@RequestMapping("/showActivite")
	public String show(Model model , @RequestParam  int id) {
		model.addAttribute("ACTIVITE",  new Activite());
		model.addAttribute("AC", activiteService.getById(id)); 
		return "editActitvite"; 
	}


	@RequestMapping("/addActivite")
	public String add(@Valid Activite a  ,  @RequestParam  int idG, RedirectAttributes res) {
		activiteService.addActivite(a.getNom(),  a.getDescription(), idG,a.getDateActivite() );
		res.addFlashAttribute("msg", "Ajout d'une activité avec succées");
		return "redirect:/listActivites" ;
	}
	
	@RequestMapping("/editActivite")
	public String edit(@Valid Activite a  , @RequestParam String desc ,@RequestParam  int idG,  RedirectAttributes res) {
		activiteService.editActivite(a.getIdActivite(),a.getNom(), desc, idG,a.getDateActivite() );
		res.addFlashAttribute("msg", "Modification d'une activité avec succées");
		return "redirect:/listActivites" ;
	
	}

	@RequestMapping("/deleteActivite")
	public String delete(@RequestParam int id , RedirectAttributes res) {
		activiteService.deleteActivite(id);
		res.addFlashAttribute("msg", "Suppresion d'une activité avec succées");
		return "redirect:/listActivites" ;
	
	}
	
	
}
