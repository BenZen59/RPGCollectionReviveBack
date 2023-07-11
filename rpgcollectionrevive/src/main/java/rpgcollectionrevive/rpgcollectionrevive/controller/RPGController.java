package rpgcollectionrevive.rpgcollectionrevive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpgcollectionrevive.rpgcollectionrevive.exception.ResourceNotFoundException;
import rpgcollectionrevive.rpgcollectionrevive.model.RPG;
import rpgcollectionrevive.rpgcollectionrevive.repository.RPGRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000" )
@RestController
@RequestMapping("/api/v1/")
public class RPGController {
    @Autowired
    private RPGRepository rpgRepository;
    //get all rpg
    @GetMapping("/rpg")
    public List<RPG> getAllRPG(){
        return rpgRepository.findAll();
    }

    // create rpg
    @PostMapping("/rpg")
    public RPG createRPG(@RequestBody RPG rpg){
        return rpgRepository.save(rpg);
    }

    //get rpg by id
    @GetMapping("/rpg/{id}")
    public ResponseEntity<RPG> getRPGById(@PathVariable Integer id){
        RPG rpg = rpgRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RPG not exist with id:" + id));
        return ResponseEntity.ok(rpg);
    }

    //update RPG
    @PutMapping("/rpg/{id}")
    public ResponseEntity<RPG> updateRPG(@PathVariable Integer id, @RequestBody RPG rpgDetails){
        RPG rpg = rpgRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RPG not exist with id:" + id));
        rpg.setName(rpgDetails.getName());
        rpg.setSupport(rpgDetails.getSupport());
        rpg.setGenre(rpgDetails.getGenre());
        rpg.setDeveloper(rpgDetails.getDeveloper());
        rpg.setImagerpg(rpgDetails.getImagerpg());

        RPG updatedRPG = rpgRepository.save(rpg);
        return ResponseEntity.ok(updatedRPG);
    }
}
