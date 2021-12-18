package ro.tefacprogramator.m4.examen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class Type {
    @Id
    @Column(name="TypeID")
    private int typeID;

    @Column(name="TypeName")
    private String typeName;
    
    public int getTypeID() {
        return typeID;
    }
    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    
}
