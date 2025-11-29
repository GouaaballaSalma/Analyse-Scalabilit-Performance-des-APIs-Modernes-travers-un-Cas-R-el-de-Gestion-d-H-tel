
package com.example.hotel.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    private Chambre chambre;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    @Column(columnDefinition = "TEXT")
    private String preferences;

    // getters/setters omitted for brevity - add as needed
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Client getClient(){return client;}
    public void setClient(Client client){this.client=client;}
    public Chambre getChambre(){return chambre;}
    public void setChambre(Chambre chambre){this.chambre=chambre;}
    public LocalDate getDateDebut(){return dateDebut;}
    public void setDateDebut(LocalDate dateDebut){this.dateDebut=dateDebut;}
    public LocalDate getDateFin(){return dateFin;}
    public void setDateFin(LocalDate dateFin){this.dateFin=dateFin;}
    public String getPreferences(){return preferences;}
    public void setPreferences(String preferences){this.preferences=preferences;}
}
