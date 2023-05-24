package com.iescomercio.programacion.ejercicios1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ejercicios1Test {

    Ejercicios1 ej1 = new Ejercicios1();

    ByteArrayOutputStream configurarInOut(String input){

        // Redirige la entrada estándar a partir de un ByteArrayInputStream
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirige la salida estándar a un ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        return outputStream;
    }

    void resetInOut(){
        // Restaura la entrada y salida estándar
        System.setIn(System.in);
        System.setOut(System.out);
    }

    private void comprobarMetodo (String entrada, String salida, Function<Void,Void> p){
        ByteArrayOutputStream outputStream = configurarInOut(entrada);

        p.apply(null);

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(salida, consoleOutput);
    }


    @Test
    void saludar() {

        ByteArrayOutputStream outputStream = configurarInOut("Carlos\n");

        ej1.saludar();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals("Hola Carlos", consoleOutput.split("\n")[1]);
    }

    @Test
    void mostrarNumeroIntroducido() {
        ByteArrayOutputStream outputStream = configurarInOut("30654\n");

        ej1.mostrarNumeroIntroducido();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals("Has introducido el numero 30654", consoleOutput);
    }

    @Test
    void mostrarEdadProximoAnio() {
        Random r = new Random();
        int n = r.nextInt(20,89);

        ByteArrayOutputStream outputStream = configurarInOut(n+"\n");

        ej1.mostrarEdadProximoAnio();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(n+1), consoleOutput);
    }

    @Test
    void mostrarAniosParaCumplir18() {
        int n = 10;

        ByteArrayOutputStream outputStream = configurarInOut(n+"\n");

        ej1.mostrarAniosParaCumplir18();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(8), consoleOutput);
    }

    @Test
    void calcularEdad() {
        int n = 10;

        ByteArrayOutputStream outputStream = configurarInOut("2024\n2000\n");

        ej1.calcularEdad();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(24), consoleOutput);
    }

    @Test
    void calcularMediaAritmetica() {
        ByteArrayOutputStream outputStream = configurarInOut("10\n21\n");

        ej1.calcularMediaAritmetica();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(15.5), consoleOutput);
    }

    @Test
    void calcularLongitudYArea() {

        ByteArrayOutputStream outputStream = configurarInOut("21,5\n");

        ej1.calcularLongitudYArea();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("longitud: "+"135.02"), consoleOutput.split("\n")[0]);
        assertEquals(String.valueOf("area: "+"1451.4650000000001"),  consoleOutput.split("\n")[1]);

    }

    @Test
    void truncarNumeroDecimal() {
        comprobarMetodo("21,689\n","21", (Void)->{
            ej1.truncarNumeroDecimal();
            return null;
        });
    }

    @Test
    void verificarMayorEdadTrue() {
        ByteArrayOutputStream outputStream = configurarInOut("21\n");

        ej1.verificarMayorEdad();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(true), consoleOutput);
    }

    @Test
    void verificarMayorEdadFalse() {
        ByteArrayOutputStream outputStream = configurarInOut("17\n");

        ej1.verificarMayorEdad();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(false), consoleOutput);
    }

    @Test
    void verificarParidadPar() {
        ByteArrayOutputStream outputStream = configurarInOut("2\n");

        ej1.verificarParidad();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(true), consoleOutput);
    }

    @Test
    void verificarParidadImpar() {
        ByteArrayOutputStream outputStream = configurarInOut("3\n");

        ej1.verificarParidad();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(false), consoleOutput);
    }

    @Test
    void verificarParidadCero() {
        ByteArrayOutputStream outputStream = configurarInOut("0\n");

        ej1.verificarParidad();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf(true), consoleOutput);
    }

    @Test
    void convertirAMayusculaMinuscula() {
        ByteArrayOutputStream outputStream = configurarInOut("a\n");

        ej1.convertirAMayuscula();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("A"), consoleOutput);
    }

    @Test
    void convertirAMayusculaMayuscula() {
        ByteArrayOutputStream outputStream = configurarInOut("A\n");

        ej1.convertirAMayuscula();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("A"), consoleOutput);
    }

    @Test
    void obtenerSiguienteLetra1() {
        ByteArrayOutputStream outputStream = configurarInOut("b\n");

        ej1.obtenerSiguienteLetra();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("c"), consoleOutput);
    }

    @Test
    void obtenerSiguienteLetra2() {
        ByteArrayOutputStream outputStream = configurarInOut("z\n");

        ej1.obtenerSiguienteLetra();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("a"), consoleOutput);
    }

    @Test
    void obtenerSiguienteLetra3() {
        ByteArrayOutputStream outputStream = configurarInOut("Z\n");

        ej1.obtenerSiguienteLetra();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("A"), consoleOutput);
    }


    @Test
    void verificarRango100() {
        ByteArrayOutputStream outputStream = configurarInOut("100\n");

        ej1.verificarRango();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("true"), consoleOutput);
    }


    @Test
    void verificarRango200() {
        ByteArrayOutputStream outputStream = configurarInOut("200\n");

        ej1.verificarRango();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("true"), consoleOutput);
    }


    @Test
    void verificarRango() {
        ByteArrayOutputStream outputStream = configurarInOut("150\n");

        ej1.verificarRango();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("true"), consoleOutput);
    }


    @Test
    void verificarRangoFuera() {
        ByteArrayOutputStream outputStream = configurarInOut("201\n");

        ej1.verificarRango();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("false"), consoleOutput);
    }

    @Test
    void verificarRangoInverso() {

        ByteArrayOutputStream outputStream = configurarInOut("201\n");

        ej1.verificarRangoInverso();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("true"), consoleOutput);

    }

    @Test
    void verificarRangoInverso100() {

        ByteArrayOutputStream outputStream = configurarInOut("100\n");

        ej1.verificarRangoInverso();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("false"), consoleOutput);

    }

    @Test
    void verificarRangoInverso200() {

        ByteArrayOutputStream outputStream = configurarInOut("200\n");

        ej1.verificarRangoInverso();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("false"), consoleOutput);

    }

    @Test
    void verificarMinuscula() {
        comprobarMetodo("a","true", (Void)->{
            ej1.verificarMinuscula();
            return null;
        });
    }


    @Test
    void verificarMinuscula2() {
        comprobarMetodo("A","false", (Void)->{
            ej1.verificarMinuscula();
            return null;
        });
    }

    @Test
    void calcularMediaTruncada() {
        comprobarMetodo("6,3\n10\n5,25\n","7", (Void)->{
            ej1.calcularMediaTruncada();
            return null;
        });
    }

    @Test
    void calcularPrecioConIVA() {
        comprobarMetodo("25\n21\n","30.25", (Void)->{
            ej1.calcularPrecioConIVA();
            return null;
        });
    }

    @Test
    void convertirSegundosAHorasMinutosSegundos() {
        ByteArrayOutputStream outputStream = configurarInOut("1268\n");

        ej1.convertirSegundosAHorasMinutosSegundos();

        // Obtiene la salida por consola
        String consoleOutput = outputStream.toString().trim();

        resetInOut();

        // Comprueba la salida por consola
        assertEquals(String.valueOf("0"), consoleOutput.split("\n")[0]);
        assertEquals(String.valueOf("21"), consoleOutput.split("\n")[1]);
        assertEquals(String.valueOf("8"), consoleOutput.split("\n")[2]);

    }

    @Test
    void calcularTotalPatas() {
        comprobarMetodo("10\n212\n90\n","3016", (Void)->{
            ej1.calcularTotalPatas();
            return null;
        });

        comprobarMetodo("0\n212\n90\n","2956", (Void)->{
            ej1.calcularTotalPatas();
            return null;
        });
    }

}