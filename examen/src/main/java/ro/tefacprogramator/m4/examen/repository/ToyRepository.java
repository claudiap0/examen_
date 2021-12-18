package ro.tefacprogramator.m4.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ro.tefacprogramator.m4.examen.entity.Toy;

public interface ToyRepository extends JpaRepository<Toy, Integer> {
    // @Query(value="Select t.toyid, t.description, t.price, ty.typename, c.categoryname from Toy t inner join type ty on t.TypeID = ty.Typeid inner join category c on t.categoryid = c.Categoryid", nativeQuery = true)
    // public List<Toy> getToys();
}
