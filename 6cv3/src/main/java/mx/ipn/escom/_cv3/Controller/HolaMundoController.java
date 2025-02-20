package mx.ipn.escom._cv3.Controller;


import mx.ipn.escom._cv3.Models.Mensaje;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo(Model model) {
        Mensaje mensaje = new Mensaje("¡Hola, mundo desde Spring");
        model.addAttribute("mensaje", mensaje);
        return "hola"; // Nombre del archivo HTML en templates
    }
}
