package com.training.example.JacocoExample;

import static org.junit.Assert.*;
import org.junit.Test;

public class HolaTest {
    @Test
    public void testSaludar() {
        Hola saludo = new Hola();
        assertEquals("Hola Andres", saludo.saludar(" Andres"));

    }
}
