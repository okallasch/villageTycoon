package cz.kallasch.backend.repository;


import cz.kallasch.backend.entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UnitRepository extends JpaRepository<UnitEntity, Long> {

    @Query("select c from UnitRepository c where c.name = :unitName")
    UnitEntity findByName(String unitName);
}
