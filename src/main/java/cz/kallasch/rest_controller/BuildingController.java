package cz.kallasch.rest_controller;


import cz.kallasch.backend.entity.BuildingEntity;
import cz.kallasch.backend.service.BuildingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/building")
@Slf4j
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping
    public List<BuildingEntity> buildings(Model model){
        log.info("Request List of Buildings");
        return buildingService.findAll();

    }

    @GetMapping("/{id}") public Optional<BuildingEntity> building(@PathVariable Long id){
        log.info("Request Building id: " + id);
        return buildingService.findById(id);
    }

    {

    }

}
