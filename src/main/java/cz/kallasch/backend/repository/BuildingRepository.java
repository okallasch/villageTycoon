package cz.kallasch.backend.repository;

import cz.kallasch.backend.entity.BuildingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<BuildingEntity, Long> {

}
