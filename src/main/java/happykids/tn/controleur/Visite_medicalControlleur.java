package happykids.tn.controleur;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.entities.User;
import happykids.tn.service.IEleveservice;
import happykids.tn.service.IMedecinservice;
import happykids.tn.service.IVisite_medicalservice;

@Controller
public class Visite_medicalControlleur {
	@Autowired
	IVisite_medicalservice visiteService; 
	@Autowired
	IEleveservice eleveService;
	
 
	@RequestMapping("/listVisites")
	public String all(Model model) {
		model.addAttribute("VISITE", visiteService.getAll());
		return "listVisites";
	}
	@RequestMapping("/ajoutVisite")
	public String ajout(Model model) {  
		model.addAttribute("LE", eleveService.getAll());
		return "ajoutVisite" ; 
	}

	@RequestMapping("/showVisite")
	public String show( Model model, @RequestParam int id) {
		model.addAttribute("VM", visiteService.getByID(id)); 
		model.addAttribute("LE", eleveService.getAll());
		return "editVisite";
	}
	
	@RequestMapping("/addVisite")
	public String add(HttpServletRequest request, @RequestParam int eleve, @RequestParam double taille,@RequestParam double poid ,
			@RequestParam String remarque, RedirectAttributes res) {
		User u = (User) request.getSession().getAttribute("USER");
		visiteService.addVisite_medical(eleve, taille, poid, remarque, u.getId());
		res.addFlashAttribute("msg", "Ajout d'une visite médical avec succées");
		return "redirect:/listVisites";
	}
	
	@RequestMapping("/editVisite")
	public String edit(  @RequestParam int id,@RequestParam int eleve,  @RequestParam double taille,
			@RequestParam double poid,@RequestParam String remarque,RedirectAttributes res) {
	 	visiteService.editVisite_medical(id, eleve,   taille, poid, remarque);
		res.addFlashAttribute("msg","Modification d'une visite médical avec succées");
		return "redirect:/listVisites";
	}
	@RequestMapping("/deleteVisite")
	public String delete(@RequestParam int id,RedirectAttributes res) { 
		visiteService.deleteVisite_medical(id);
		res.addFlashAttribute("msg", "Suppresion d'une visite médical avec succées");
		return "redirect:/listVisites" ; 
	}
	
	
}
