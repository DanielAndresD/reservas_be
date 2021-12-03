package com.mtic.reservas_be.repositories;


import com.mtic.reservas_be.models.Reservas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservasRepository extends MongoRepository<Reservas,Integer> { }
