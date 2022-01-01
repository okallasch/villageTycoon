package cz.kallasch.rest_controller;

import cz.kallasch.backend.entity.UnitEntity;
import cz.kallasch.backend.service.UnitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping
    public List<UnitEntity> units(){
        log.info("Requesting units");
        return unitService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UnitEntity> unit(@PathVariable Long id){
        log.info("Requesting unit id: " + id);
        return unitService.findById(id);
    }

}
