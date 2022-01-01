package cz.kallasch.controller;

import cz.kallasch.backend.entity.UnitEntity;
import cz.kallasch.backend.service.UnitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/html", method = RequestMethod.POST)
public class UnitControllerThymeleaf {

    @Autowired
    private UnitService unitService;

    @GetMapping("units")
    public String getUnit(Model model) {
        List<UnitEntity> units = unitService.findAll();
        model.addAttribute("unitList", units);
        return "units";
    }
}
