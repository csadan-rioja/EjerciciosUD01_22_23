package com.iescomercio.programacion.ejercicios1;



import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {
    private Ejercicios1 ejercicios = new Ejercicios1();

    @Test
    void testCalcularMediaAritmetica() {
        String input = "5\n7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.calcularMediaAritmetica());
    }

    /*
    @Test
    void testCalcularLongitudYArea() {
        String input = "5.5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.calcularLongitudYArea());
    }

    @Test
    void testTruncarNumeroDecimal() {
        String input = "8.7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.truncarNumeroDecimal());
    }*/

    @Test
    void testVerificarMayorEdad() {
        String input = "20\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.verificarMayorEdad());
    }

    @Test
    void testVerificarParidad() {
        String input = "13\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.verificarParidad());
    }

    @Test
    void testConvertirAMayuscula() {
        String input = "a\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.convertirAMayuscula());
    }

    @Test
    void testObtenerSiguienteLetra() {
        String input = "b\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.obtenerSiguienteLetra());
    }

    @Test
    void testVerificarRango() {
        String input = "150\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.verificarRango());
    }

    @Test
    void testVerificarRangoInverso() {
        String input = "50\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.verificarRangoInverso());
    }

    @Test
    void testVerificarMinuscula() {
        String input = "a\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.verificarMinuscula());
    }

    @Test
    void testCalcularMediaTruncada() {
        String input = "7\n8\n9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.calcularMediaTruncada());
    }

    @Test
    void testCalcularPrecioConIVA() {
        String input = "10\n21\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.calcularPrecioConIVA());
    }

    @Test
    void testConvertirSegundosAHorasMinutosSegundos() {
        String input = "3600\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.convertirSegundosAHorasMinutosSegundos());
    }

    @Test
    void testCalcularTotalPatas() {
        String input = "10\n5\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> ejercicios.calcularTotalPatas());
    }
}
