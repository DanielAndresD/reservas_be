package com.mtic.reservas_be.controllers;


import com.mtic.reservas_be.exceptions.ReservasNotFoundException;
import com.mtic.reservas_be.models.Reservas;
import com.mtic.reservas_be.repositories.ReservasRepository;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReservasController {

    private final ReservasRepository reservasRepository;

    public ReservasController(ReservasRepository reservasRepository) {
        this.reservasRepository = reservasRepository;
    }

    @GetMapping("/reservas/{IdReserva}")
    Reservas getReservas(@PathVariable String IdReserva){
        return reservasRepository.findById(IdReserva)
                .orElseThrow(() -> new ReservasNotFoundException("No se encontro la reserva con el Id: " + IdReserva));
    }
    @PostMapping("/reservas")
    Reservas newReservas(@RequestBody Reservas reserva) {
        return reservasRepository.save(reserva);
    }
}