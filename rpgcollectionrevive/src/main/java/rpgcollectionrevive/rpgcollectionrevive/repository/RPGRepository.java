package rpgcollectionrevive.rpgcollectionrevive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rpgcollectionrevive.rpgcollectionrevive.model.RPG;

@Repository
public interface RPGRepository extends JpaRepository<RPG, Integer> {
}
