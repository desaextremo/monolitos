package com.desaextremo.games;

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
public class GameController {
    @Autowired
    private GameRepository repositorio;
    
    @GetMapping("/")
    public String viewHomePage(Model modelo) {
        List<Games> listGame = repositorio.findAll();
        modelo.addAttribute("listGame",listGame);
        return "index";
    }
    
    @GetMapping("/addGame")
    public String addNewGame(Model model) {
        Games game = new Games();
        model.addAttribute("game", game);
        return "newgame";
    }
    
    @PostMapping("/save")
    public String saveFarm(@ModelAttribute("game") Games game) {
        repositorio.save(game);
        return "redirect:/";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        Games game = repositorio.findById(id).get();
        model.addAttribute("game", game);
        return "update";
    }
 
    @GetMapping("/deleteGame/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        repositorio.deleteById(id);
        return "redirect:/";
 
    }
}
