package com.digitalhouse.junit.practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void siElAnimalEsPesado() {
        Animal caballo = new Animal("Caballo", "Grande", 3000);
        Animal perro = new Animal("Perro", "Mediano", 20);

        boolean esPesado = caballo.esPesado();
        boolean esPesado1 = perro.esPesado();

        assertEquals(true, caballo.esPesado());
        assertFalse(esPesado1);
    }

}