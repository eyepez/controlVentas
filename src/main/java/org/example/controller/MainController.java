package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/clientes")
    public String mostrarFormularioClientes(Model model) {
        // Aquí puedes agregar lógica si es necesario
        return "clientes"; // Devuelve el nombre de la vista (clientes.html)
    }

//    @GetMapping("/formulario")
//    public String mostrarFormulario() {
//        return "ventaForm"; // Nombre de la plantilla Thymeleaf para mostrar el formulario
//    }
//
//    @PostMapping("/calcularPrecioTotal")
//    public String calcularPrecioTotal(@RequestParam int cantidad,
//                                      @RequestParam String descripcion,
//                                      @RequestParam double precioUnitario,
//                                      Model model) {
//        double precioTotal = cantidad * precioUnitario;
//        model.addAttribute("precioTotal", precioTotal);
//        return "ventaForm";
//    }
}
