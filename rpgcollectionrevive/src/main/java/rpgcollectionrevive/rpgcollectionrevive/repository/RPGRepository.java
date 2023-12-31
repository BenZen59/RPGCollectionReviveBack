package rpgcollectionrevive.rpgcollectionrevive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rpgcollectionrevive.rpgcollectionrevive.model.RPG;

import java.util.List;

@Repository
public interface RPGRepository extends JpaRepository<RPG, Integer> {
    List<RPG> findAllBySupport(String support);

    List<RPG> findAllByGenre(String genre);
}
