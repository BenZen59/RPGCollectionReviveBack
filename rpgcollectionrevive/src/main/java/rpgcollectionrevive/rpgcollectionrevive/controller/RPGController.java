package rpgcollectionrevive.rpgcollectionrevive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rpgcollectionrevive.rpgcollectionrevive.exception.ResourceNotFoundException;
import rpgcollectionrevive.rpgcollectionrevive.model.RPG;
import rpgcollectionrevive.rpgcollectionrevive.repository.RPGRepository;

import java.util.*;
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
    @GetMapping("/gb")
    public List<RPG> getAllGB(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("GB");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/gba")
    public List<RPG> getAllGBA(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("GBA");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/gbc")
    public List<RPG> getAllGBC(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("GBC");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/gc")
    public List<RPG> getAllGC(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("GC");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/nes")
    public List<RPG> getAllNES(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("NES");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/3ds")
    public List<RPG> getAll3DS(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("3DS");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/ds")
    public List<RPG> getAllDS(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("DS");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/switch")
    public List<RPG> getAllSwitch(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("Switch");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/pc")
    public List<RPG> getAllPC(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PC");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/pc98")
    public List<RPG> getAllPC98(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PC98");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/ps1")
    public List<RPG> getAllPS1(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PS1");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/ps2")
    public List<RPG> getAllPS2(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PS2");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/ps3")
    public List<RPG> getAllPS3(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PS3");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/ps4")
    public List<RPG> getAllPS4(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PS4");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/ps5")
    public List<RPG> getAllPS5(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("PS5");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/psp")
    public List<RPG> getAllPSP(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("psp");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/snes")
    public List<RPG> getAllSNES(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("SNES");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/wii")
    public List<RPG> getAllWii(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("Wii");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }
    @GetMapping("/wiiu")
    public List<RPG> getAllWiiU(){
        List<RPG> rpgList = rpgRepository.findAllBySupport("Wii U");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getSupport().compareTo(rpg2.getSupport()));
        return rpgList;
    }

    @GetMapping("/unknowrpg")
    public List<RPG> getAllunknowRPG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("? RPG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/adv")
    public List<RPG> getAllADV(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("ADV");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/arpg")
    public List<RPG> getAllunknowARPG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("A-RPG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/card")
    public List<RPG> getAllCARD(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("CARD");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/crpg")
    public List<RPG> getAllCRPG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("C-RPG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/drpg")
    public List<RPG> getAllDRPG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("D-RPG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }@GetMapping("/hrpg")
    public List<RPG> getAllHRPG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("H-RPG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/hslg")
    public List<RPG> getAllHSLG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("H-SLG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/mmo")
    public List<RPG> getAllMMO(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("MMO");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/rogue")
    public List<RPG> getAllROGUE(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("ROGUE");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/shoot")
    public List<RPG> getAllSHOOT(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("SHOOT");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/sim")
    public List<RPG> getAllSIM(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("SIM");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/srpg")
    public List<RPG> getAllShootSRPG(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("S-RPG");
        Collections.sort(rpgList, (rpg1, rpg2) -> rpg1.getGenre().compareTo(rpg2.getGenre()));
        return rpgList;
    }
    @GetMapping("/trpg")
    public List<RPG> getAllShoot(){
        List<RPG> rpgList = rpgRepository.findAllByGenre("T-RPG");
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
        rpg.setBoxrpg(rpgDetails.getBoxrpg());

        RPG updatedRPG = rpgRepository.save(rpg);
        return ResponseEntity.ok(updatedRPG);
    }
}
