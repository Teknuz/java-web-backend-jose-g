package py.edu.ucsa.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
        public String saludo(){
            return ("Hola UCSA");
        }

    @GetMapping("/saludo-personalizado")
    public String saludoPersonalizado(@RequestParam String name){
        return "Hola " + name +", conseguiste el saludo personalizado correctamente !";
    }
}
