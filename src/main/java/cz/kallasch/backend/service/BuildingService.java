package cz.kallasch.backend.service;

import cz.kallasch.backend.entity.BuildingEntity;
import cz.kallasch.backend.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;


    public List<BuildingEntity> findAll(){
        return buildingRepository.findAll();
    }

    public void save(BuildingEntity buildingEntity){
        buildingRepository.save(buildingEntity);
    }

    public Optional<BuildingEntity> findById(Long id) {
        return buildingRepository.findById(id);
    }
}
