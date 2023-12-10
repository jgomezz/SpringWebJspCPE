package pe.edu.tecsup.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

	@GetMapping("/formulario")
	public String form() {
		
		return "form"; // WEB-INF/jsp/form.jsp

		
	}
	
}
