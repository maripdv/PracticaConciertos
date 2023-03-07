/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PracticaConciertos.PracticaConcierto.controller;

import com.PracticaConciertos.PracticaConcierto.entity.Concierto;
import com.PracticaConciertos.PracticaConcierto.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ConciertoController {
    @Autowired
    private IConciertoService ConciertoService;

    @GetMapping("/conciertoN")
    public String crearPersona(Model model) {
        List<Concierto> listaConciertos = ConciertoService.verConcierto();
        model.addAttribute("concierto", new Concierto());//"persona"-> como lo leemos en el html //envia el objeto al html
        model.addAttribute("conciertos", listaConciertos);
        return "crear";
    }

    @GetMapping("/listaConciertos")
    public String index(Model model) {
        List<Concierto> listaConcierto = ConciertoService.verConcierto();
        model.addAttribute("titulo", "Tabla Concierto");
        model.addAttribute("conciertos", listaConcierto);
        return "listaConciertos";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(Concierto concierto) {
        ConciertoService.eliminarConcierto(concierto);
        return "redirect:/listaConciertos";
    }
    
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto){
        ConciertoService.guardarConcierto(concierto);
        return "redirect:/";
    }
}

