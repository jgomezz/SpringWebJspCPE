package pe.edu.tecsup.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@GetMapping("/formulario")
	public String form() {
		
		return "form"; // WEB-INF/jsp/form.jsp

		
	}
	

	@PostMapping("/sendform")
	public String procesarForm(Model model, @RequestParam("nombre") String nombre) {
		
		
		System.out.println("nombre --> " +  nombre);
		
		String saludo = "Bienvenido " + nombre;

		model.addAttribute("var_saludo", saludo);
		
		return "resultadoForm"; // WEB-INF/jsp/resultadoForm.jsp
	}
	
}
