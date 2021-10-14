package happykids.tn.controleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

import happykids.tn.entities.Actualite;
import happykids.tn.service.IActualiteservice;
@Controller
public class ActualiteControlleur {
	@Autowired
	IActualiteservice actualiteService;
	

	@InitBinder
	public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {
	    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
	    binder.registerCustomEditor(Date.class, "date_actualite" ,new CustomDateEditor(dateFormat, true));  
	    /*final SimpleDateFormat heureFormat = new SimpleDateFormat("HH:mm:ss", locale);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(heureFormat, true));  */
	}
 
	@RequestMapping("/deleteActualite")
	public String delete(@RequestParam int id , RedirectAttributes res) { 
		actualiteService.deleteActualite(id);
		res.addFlashAttribute("msg" , "Suppresion effectué avec succeés");
		return "redirect:/listActualites" ; 
	}
	@RequestMapping("/ajoutActualite")
	public String ajout(Model model) {
		model.addAttribute("ACTUALITE",new Actualite() ); 
		return "ajoutActualite" ; 
	}
	@RequestMapping("/listActualites")
	public String all(Model model) {
		model.addAttribute("ACTUALITE",actualiteService.getAll() ); 
		return "listActualites" ; 
	}
	@RequestMapping("/showActualite")
	public String show(Model model,  @RequestParam int id) {
		model.addAttribute("ACTUALITE",new Actualite() ); 
		model.addAttribute("INFOA", actualiteService.getByID(id) ); 
		return "editActualite" ; 
	}
	@RequestMapping("/addActualite" )
	public String add(@Valid Actualite a,RedirectAttributes res) { 
		actualiteService.addActualite(a.getNom_actualite(), a.getDate_actualite(), a.getDescription(), a.getType_actualite());
		res.addFlashAttribute("msg","Ajout d'actualité avec succées");
		return "redirect:/listActualites" ; 
	}
	@RequestMapping("/editActualite")
	public String edit(@Valid Actualite a,@RequestParam String desc ,RedirectAttributes res) {
		actualiteService.editActualite(a.getId_actualite(), a.getNom_actualite(), a.getDate_actualite(),desc, a.getType_actualite());
		res.addFlashAttribute("msg", "Modification d'actualité avec succées");
		return "redirect:/listActualites" ; 
	}
	
}
