package com.coretime.api.presentacion.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // ¡OJO: Usa @Controller, NO @RestController para vistas HTML!
public class LoginController {
	
	@GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // Esto busca 'login.html' en la carpeta templates
    }
    
    // Agregamos una ruta raíz temporal para facilitar las pruebas
    @GetMapping("/")
    public String inicio() {
        return "redirect:/login";
    }

}
