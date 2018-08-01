package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Informar a Spring que es un controlador

@Controller
public class HomeController {
	
	
		//Responder a la raiz de la aplicación
	@RequestMapping("/")
	public String index() {
		
		
				//nombre de la pagina a responder
		return "/index";
	} 
	
	
	
	

}
