package com.ejemplo.crud.controllers;

import com.ejemplo.crud.domains.Accion;
import com.ejemplo.crud.services.AccionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    private final AccionService accionService;

    public HomeController(AccionService accionService) {
        this.accionService = accionService;
    }

    @RequestMapping("/home")
    public String getHome(Model model){
        model.addAttribute("acciones", accionService.findAll());
        return "home";
    }

    @RequestMapping("/")
    public String getRoot(Model model){
        model.addAttribute("acciones", accionService.findAll());
        return "home";
    }
}
