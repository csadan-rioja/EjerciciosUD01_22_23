package com.iescomercio.programacion.ejercicios1;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class Ejercicios1 {

    public static void main(String[] args) {
        Ejercicios1 ejercicios = new Ejercicios1();
        ejercicios.saludar();
    }

    /**
     * Implementa el método de tal forma que muestre al usuario el mensaje "Introducir nombre: ".
     * El usuario introducirá el nombre y posteriormente se mostrará por consola el mensaje "Hola <nombre>".
     * En el caso de introducir el nombre Carlos, el mensaje será Hola Carlos.
     * */
    public void saludar() {

        Scanner s = new Scanner(System.in);

        System.out.println("Introducir nombre: ");
        String nombre = s.nextLine();

        System.out.println("Hola "+nombre);
    }

    /**
     * Implementa el método de tal forma que muestre al usuario el mensaje "Introducir nombre: ".
     * El usuario introducirá el nombre y posteriormente se mostrará por consola el mensaje "Hola <nombre>".
     * En el caso de introducir el nombre Carlos, el mensaje será Hola Carlos.
     **/
    public void mostrarNumero() {
    }

    /**
     * Escribir un programa que pida al usuario un número y responda
     * “Has introducido el número N”, donde N es el número introducido por el usuario.
     * */
    public void mostrarNumeroIntroducido() {
    }

    /**
     * Pedir al usuario su edad, y mostrar la que tendrá el próximo año.
     * */
    public void mostrarEdadProximoAnio() {
    }

    /**
     * Pedir al usuario su edad y mostrar cuántos años quedan para que cumpla 18 años.
     * */
    public void mostrarAniosParaCumplir18() {
    }

    /**
     * Pedir al usuario el año actual y el de nacimiento del usuario, y devolver su edad.
     * Suponiendo que en el año en curso el usuario ya ha cumplido años.
     * */
    public void calcularEdad() {
    }

    /**
     * El tipo short permite almacenar valores entre un rango (investiga cuál es).
     * Escribe un programa que permita al usuario comprobar que si se incrementa el
     * valor de una variable short en 1 cuando tiene el máximo valor,
     * el nuevo valor es el mínimo del rango.
     * */
    public void incrementarShort() {
    }


    /**
     * Escribe un programa que permita calcular
     * la media aritmética de dos números que introduce el usuario.
     * */
    public void calcularMediaAritmetica() {
    }

    /**
     * Escribe un programa que calcule la longitud y el área de una circunferencia.
     * Para ello, el usuario debe introducir el radio (puede haber decimales).
     *
     *Longitud = 2*Pi*radio
     * Area = Pi*radio*radio
     * */
    public void calcularLongitudYArea() {
    }

    /**
     * Escribe un programa que devuelva un número entero obtenido de truncar un número
     * con decimales introducido por el usuario.
     * */
    public void truncarNumeroDecimal() {
    }

    /**
     * Escribe un programa que pida al usuario
     * su edad y devuelva si es mayor de edad.
     * No utilizar condicionales.
     * */
    public void verificarMayorEdad() {
    }

    /**
     * Escribe un programa que pida al usuario un número y
     * devolverá true si es par y false si no es par. No utilizar condicionales.
     * */
    public void verificarParidad() {
    }

    /**
     * Inicializa una variable con una letra, devolver su correspondiente mayúscula.
     * */
    public void convertirAMayuscula() {
    }

    /*
     * Inicializa una variable con una letra, devolver la siguiente en el alfabeto.
     * En caso de que sea la z devolver la a (o Z la A)
     * */
    public void obtenerSiguienteLetra() {
    }

    /**
     * Dado un número, devuelve verdadero si se encuentra
     * en el rango de 100 a 200 (ambos incluidos). No utilizar condicionales.
     * */
    public void verificarRango() {
    }

    /**
     * Dado un número, devuelve verdadero si se encuentra
     * fuera del rango de 100 a 200 (ambos incluidos). No utilizar condicionales
     * */
    public void verificarRangoInverso() {
    }

    /**
     * Inicializa una variable con un carácter. Devuelve true si es minúscula y false si es mayúscula o cualquier otro carácter.
     * Investiga a qué rango pertenece las minúsculas y al rango que pertenece las mayúsculas.
     * */
    public void verificarMinuscula() {
    }

    /**
     * Escribe un programa que solicite las notas del primer, segundo y tercer trimestre.
     * El programa debe mostrar la nota media del curso sin decimales, sin redondear, a través del truncamiento.
     * */
    public void calcularMediaTruncada() {
    }


    /**
     * Escribe un programa que calcule el precio con IVA de un producto.
     * El usuario deberá introducir el precio del producto y el IVA a aplicar.
     * El programa devolverá el precio del producto aplicándole el IVA.
     * */
    public void calcularPrecioConIVA() {
    }

    /**
     * Escribe un programa que solicite al usuario una cantidad de segundos.
     * El programa mostrará cuántas horas, minutos y segundos hay en el número de
     * segundos introducidos.
     * */
    public void convertirSegundosAHorasMinutosSegundos() { }

    /**
     * Un biólogo está interesado en calcular el número total de patas de los animales que ha capturado. Para ello, debes escribir una aplicación que le solicite:
     * -	Número de hormigas capturadas (6 patas)
     * -	Número de arañas capturadas (8 patas)
     * -	Número de cochinillas capturadas (14 patas)
     * El programa debe mostrar el número de patas totales de los animales capturados.
     * */
    public void calcularTotalPatas() {
    }
}

