package ro.tefacprogramator.m4.examen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="toy")
public class Toy {
    @Id
    @Column(name="ToyID")
    private int toyID;

    @Column(name="Description")
    private String description;

    @Column(name="Price")
    private double price;

    @Column(name="TypeID")
    private int typeID;

    @Column(name="CategoryID")
    private int categoryID;

    public int getToyID() {
        return toyID;
    }
    public void setToyID(int toyID) {
        this.toyID = toyID;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getTypeID() {
        return typeID;
    }
    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }
    public int getCategoryID() {
        return categoryID;
    }
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    
}
