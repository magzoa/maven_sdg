package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
//Habilitar el modulo MVC
@EnableWebMvc
//Cargamos las clases ubicadas en el paquete de HomeController 
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	//metodo de configuración que sera gestionado por spring
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
resolver.setPrefix("/WEB-INF/views/");//prefijo de ubicación del archivo 
		resolver.setSuffix(".jsp");  //sufijo del nombre del archivo
		return resolver;
	}
}
