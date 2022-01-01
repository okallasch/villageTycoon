package cz.kallasch.backend.repository;

import cz.kallasch.backend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query(value = " select * from users c where c.name = :userName", nativeQuery = true)
    UserEntity findByName(@Param("userName") String userName);

}
