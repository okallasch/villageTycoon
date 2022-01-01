package cz.kallasch.controller;

import cz.kallasch.backend.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/html/buy", method = RequestMethod.POST)
public class BuyControllerThymeleaf {

    @Autowired
    private UnitService unitService;

    @GetMapping("/unit/{unitName}")
    public String buy(Model model, @RequestParam String unitName){
        unitService.findByName(unitName);
        return "buyUnit";
    }
}
