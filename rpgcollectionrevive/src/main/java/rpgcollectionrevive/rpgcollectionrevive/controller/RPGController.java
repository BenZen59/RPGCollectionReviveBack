package rpgcollectionrevive.rpgcollectionrevive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
}
