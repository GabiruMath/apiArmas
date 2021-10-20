package gabiruTestes.AulaTroll.controller;

import gabiruTestes.AulaTroll.domain.Armas;
import gabiruTestes.AulaTroll.services.ArmasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Armas")
public class ArmaController {
    @Autowired
    private ArmasService arrServ;

    @PostMapping
    public void saveArma(@RequestBody Armas gun){
        arrServ.saveArma(gun);
    }

    @GetMapping("/{codSerie}")
    public Armas getArma(@PathVariable int codSerie){
        return arrServ.getArma(codSerie);
    }

    @GetMapping
    public List<Armas> getArmas(){
        return arrServ.getArmas();
    }

    @DeleteMapping("/{codSerie}")
    public void deleteArma(@PathVariable int codSerie){
        arrServ.deleteArma(codSerie);
    }

}
