package org.example.controller;

import org.example.model.Cliente;
import org.example.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/clientes")
    public String mostrarFormularioClientes(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes";
    }

    @PostMapping("/clientes")
    public String guardarCliente(@ModelAttribute Cliente cliente, Model model) {
        System.out.println(cliente.toString());
        try {
            clienteService.guardarCliente(cliente);
        } catch (Exception e) {
            // Captura cualquier excepción relacionada con la base de datos
            String errorMessage = "Ha ocurrido un error al guardar el cliente. Por favor, inténtalo nuevamente.";
            model.addAttribute("errorMessage", errorMessage);
            return "clientes"; // Regresa a la página de clientes con el mensaje de error
        }
        return "redirect:/clientes";
    }

}
