package ro.tefacprogramator.m4.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.tefacprogramator.m4.examen.entity.Toy;
import ro.tefacprogramator.m4.examen.service.ToyService;

@RestController
@RequestMapping
@CrossOrigin
public class ToyController {
    @Autowired
    public ToyService toyService;

    @PostMapping("/toy/add")
    public String addToys(@RequestBody Toy t1) {
        if(toyService.addToy(t1)) {
            return "success";
        }
        return "failed";
    }

    @GetMapping("/toy/getAll")
    public List<Toy> getAll() {
        if(toyService.getAllToys() != null) {
            return toyService.getAllToys();
        } 
        return null;
        //return "There are no toys in the database.";
    }
}
