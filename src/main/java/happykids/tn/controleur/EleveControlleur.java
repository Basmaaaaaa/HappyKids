package happykids.tn.controleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.service.IEleveservice;
import happykids.tn.service.IGroupeservice;
import happykids.tn.service.IParentservice;

@Controller
public class EleveControlleur {
	@Autowired
	IEleveservice eleveService;
	@Autowired
	IParentservice parentService;
	@Autowired
	IGroupeservice groupeService;
	
	@InitBinder
	public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {
	    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));  
	    /*final SimpleDateFormat heureFormat = new SimpleDateFormat("HH:mm:ss", locale);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(heureFormat, true));  */
	}

 


	@RequestMapping("/listEleves")
	public String all(Model model) {
		model.addAttribute("ELEVE", eleveService.getAll());
		return "listEleves";
	}

	@RequestMapping("/ajoutEleve")
	public String ajout(Model model) { 
		model.addAttribute("LP", parentService.getAll());
		model.addAttribute("LG", groupeService.getAll());
		
		return "ajoutEleve" ; 
	}
	@RequestMapping("/showEleve")
	public String show( Model model, @RequestParam int id) {
		model.addAttribute("El", eleveService.getByID(id));
		model.addAttribute("LP", parentService.getAll());
		model.addAttribute("LG", groupeService.getAll());
		return "editEleve";
	}

	@RequestMapping("/addEleve")
	public String add(@RequestParam int qr, @RequestParam String nom, @RequestParam String prenom,
			@RequestParam Date date_naissance,@RequestParam int groupe ,@RequestParam int parent , @RequestParam String  typeS, RedirectAttributes res) {
		eleveService.addEleve(qr, nom, prenom, date_naissance, parent, groupe, typeS);
		res.addFlashAttribute("msg", "Ajout d'un élève avec succées");
		return "redirect:/listEleves";
	}
 
	@RequestMapping("/editEleve")
	public String edit(@RequestParam int qr, @RequestParam String nom, @RequestParam String prenom,
			@RequestParam Date date_naissance,@RequestParam int groupe ,@RequestParam int parent, @RequestParam String  typeS , RedirectAttributes res) {
		eleveService.editEleve(qr, nom, prenom, date_naissance,parent, groupe, typeS);
		res.addFlashAttribute("msg","Modification d'un élève avec succées");
		return "redirect:/listEleves";
	}

	@RequestMapping("/deleteEleve")
	public String delete(@RequestParam int id, RedirectAttributes res) {
		eleveService.deleteEleve(id);
		res.addFlashAttribute("msg", "Suppresion d'un élève avec succées");
		return "redirect:/listEleves";
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}