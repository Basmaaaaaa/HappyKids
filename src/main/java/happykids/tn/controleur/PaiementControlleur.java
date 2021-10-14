package happykids.tn.controleur;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.service.IEleveservice;
import happykids.tn.service.IPaiementservice;

@Controller
public class PaiementControlleur {
	@Autowired
	IPaiementservice paiementService;
	@Autowired
	IEleveservice eleveService;
 
	
	@RequestMapping("/ajoutPaiement")
	public String Ajout(Model model) { 
		model.addAttribute("LE", eleveService.getAll());
		
		return "ajoutPaiement" ; 
		
	
	}
	@RequestMapping("/listPaiement")
	public String ajout(Model model) {
		model.addAttribute("PAIEMENT", paiementService.getAll());
		return "listPaiement" ; 
	}
	

	
	@RequestMapping("/showPaiement")
	public String show(Model model,  @RequestParam int id) {
		model.addAttribute("LE", eleveService.getAll());
		model.addAttribute("INFOP",paiementService.getById(id)); 
		return "editPaiement";
				
	}
	@RequestMapping("/addPaiement")
	public String add(@RequestParam int eleve, @RequestParam String mois, @RequestParam int annee, @RequestParam double montant, 
			@RequestParam String remarque , RedirectAttributes res) { 
		paiementService.addPaiement( eleve,new Date() ,mois, annee, montant, remarque);
		res.addFlashAttribute("msg", "Ajout de paiement effectuée avec succées"); 
		return "redirect:/listPaiement" ; 
	}
	
	@RequestMapping("/editPaiement")
	public String edit(@RequestParam int id,@RequestParam int eleve, @RequestParam String mois,
			@RequestParam int annee, @RequestParam double montant,@RequestParam String remarques, RedirectAttributes res)  { 
		paiementService.editPaiement(id,eleve, new Date() ,mois, annee, montant, remarques);
		res.addFlashAttribute("msg", "Modification de paiement effectuée avec succées"); 
		return "redirect:/listPaiement" ; 
	}
	}
