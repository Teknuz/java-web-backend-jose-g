package py.edu.ucsa.java_web_backend_jose.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/api/saludo")
    public String saludar(){
        return "Hola a todos desde Spring-Rest";
    }
    @GetMapping("/api/saludo-personalizado")
    public String saludarPersonalizado(@RequestParam String nombre){
        return "Hola " + nombre + ", bienvenido al curso";
    }

}
