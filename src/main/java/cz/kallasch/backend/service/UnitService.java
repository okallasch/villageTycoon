package cz.kallasch.backend.service;

import cz.kallasch.backend.entity.UnitEntity;
import cz.kallasch.backend.repository.UnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitService {

    private UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository){
        this.unitRepository = unitRepository;
    }

    public void save(UnitEntity unitEntity){
        unitRepository.save(unitEntity);
    }

    public List<UnitEntity> findAll(){
        return unitRepository.findAll();
    }

    public Optional<UnitEntity> findById(Long id) {
        return unitRepository.findById(id);
    }

    public UnitEntity findByName(String unitName) {
        return unitRepository.findByName(unitName);
    }
}
