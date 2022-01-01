package cz.kallasch.backend.repository;

import cz.kallasch.backend.entity.StockPileEntity;
import cz.kallasch.backend.entity.UserEntity;
import org.hsqldb.rights.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StockPileRepository extends JpaRepository<StockPileEntity, Long> {

    @Query (value = " select * from stockpile c where c.user_entity_id = :user",
    nativeQuery = true)
    StockPileEntity findByUser(@Param("user") Long id);

}
