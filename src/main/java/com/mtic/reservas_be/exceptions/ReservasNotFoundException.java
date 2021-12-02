package com.mtic.reservas_be.exceptions;

public class ReservasNotFoundException extends RuntimeException {
    public ReservasNotFoundException(String message) {
        super(message);
    }
}