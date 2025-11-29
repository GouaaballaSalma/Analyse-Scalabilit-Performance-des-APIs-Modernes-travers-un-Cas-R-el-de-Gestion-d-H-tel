
package com.example.hotel.repo;
import org.springframework.data.repository.CrudRepository;
import com.example.hotel.model.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,Long> { }
