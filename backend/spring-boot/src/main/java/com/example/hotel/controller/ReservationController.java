
package com.example.hotel.controller;

import com.example.hotel.model.Reservation;
import com.example.hotel.repo.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationRepository repo;
    public ReservationController(ReservationRepository repo){ this.repo = repo; }

    @PostMapping
    public ResponseEntity<Reservation> create(@RequestBody Reservation r){
        Reservation saved = repo.save(r);
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> get(@PathVariable Long id){
        Optional<Reservation> r = repo.findById(id);
        return r.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> update(@PathVariable Long id, @RequestBody Reservation r){
        if(!repo.existsById(id)) return ResponseEntity.notFound().build();
        r.setId(id);
        Reservation saved = repo.save(r);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        if(!repo.existsById(id)) return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
