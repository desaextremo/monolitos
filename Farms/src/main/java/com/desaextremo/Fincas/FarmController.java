package com.desaextremo.Fincas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author desaextremo
 */
@Controller
public class FarmController {
    @Autowired
    private FarmRepository repositorio;
    
    @GetMapping("/")
    public String viewHomePage(Model modelo) {
        List<Farm> listFarm = repositorio.findAll();
        modelo.addAttribute("listFarm",listFarm);
        return "index";
    }
    
    @GetMapping("/addFarm")
    public String addNewFarm(Model model) {
        Farm farm = new Farm();
        model.addAttribute("farm", farm);
        return "newfarm";
    }
    
    @PostMapping("/save")
    public String saveFarm(@ModelAttribute("farm") Farm farm) {
        repositorio.save(farm);
        return "redirect:/";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        Farm farm = repositorio.findById(id).get();
        model.addAttribute("farm", farm);
        return "update";
    }
 
    @GetMapping("/deleteFarm/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        repositorio.deleteById(id);
        return "redirect:/";
 
    }
}
