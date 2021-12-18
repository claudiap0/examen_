package ro.tefacprogramator.m4.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.examen.entity.Toy;
import ro.tefacprogramator.m4.examen.repository.ToyRepository;

@Service
public class ToyService {
    @Autowired
    public ToyRepository repo;

    public boolean addToy(Toy t1) {
        Toy toy = t1;

        if(toy != null 
            && toy.getDescription() != null 
            && toy.getPrice() != 0 
            && toy.getTypeID() != 0
            && toy.getCategoryID() != 0) {
                repo.save(t1);
                return true;
        } return false;
    }

    public List<Toy> getAllToys() {
        return repo.findAll();
    }
}
