package com.Reto31.reto.Repository;

import com.Reto31.reto.Model.Reservation;
import com.Reto31.reto.Repository.Crud.ReservationCrudRepositoryInterfaz;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationCrudRepositoryInterfaz reservationCrudRepositoryInterfaz;
    
   public List <Reservation> getReservationAll(){
        return (List<Reservation>) reservationCrudRepositoryInterfaz.findAll();
   } 
  
   public Optional <Reservation> getReservationId(Integer id){
       return reservationCrudRepositoryInterfaz.findById(id);
   }
        
   public Reservation saveReservation(Reservation   reservation){
       return reservationCrudRepositoryInterfaz.save(reservation);
   }     
}