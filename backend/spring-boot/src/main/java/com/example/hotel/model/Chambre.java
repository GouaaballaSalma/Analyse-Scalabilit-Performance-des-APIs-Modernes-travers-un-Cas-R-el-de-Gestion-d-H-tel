
package com.example.hotel.model;
import jakarta.persistence.*;

@Entity
public class Chambre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private double prix;
    private boolean disponible;
    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getType(){return type;}
    public void setType(String type){this.type=type;}
    public double getPrix(){return prix;}
    public void setPrix(double prix){this.prix=prix;}
    public boolean isDisponible(){return disponible;}
    public void setDisponible(boolean disponible){this.disponible=disponible;}
}
