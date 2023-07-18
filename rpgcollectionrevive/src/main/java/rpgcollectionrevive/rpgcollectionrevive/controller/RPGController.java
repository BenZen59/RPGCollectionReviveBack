package rpgcollectionrevive.rpgcollectionrevive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpgcollectionrevive.rpgcollectionrevive.exception.ResourceNotFoundException;
import rpgcollectionrevive.rpgcollectionrevive.model.RPG;
import rpgcollectionrevive.rpgcollectionrevive.repository.RPGRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000" )
@RestController
@RequestMapping("/api/v1/")
public class RPGController {
    @Autowired
    private RPGRepository rpgRepository;

    @GetMapping("/rpgname")
    public List<RPG> getAllRPGname(){
        List<RPG> rpgList = rpgRepository.findAll();
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getName().compareTo(rpg2.getName()));
        return rpgList;
    }
    @GetMapping("/rpgsupport")
    public List<RPG> getAllRPGsupport(){
        List<RPG> rpgList = rpgRepository.findAll();
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/rpgdeveloper")
    public List<RPG> getAllRPGdeveloper(){
        List<RPG> rpgList = rpgRepository.findAll();
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getDeveloper().compareTo(rpg2.getDeveloper()));
        return rpgList;
    }
    @GetMapping("/rpggenre")
    public List<RPG> getAllRPGgenre(){
        List<RPG> rpgList = rpgRepository.findAll();
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
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
