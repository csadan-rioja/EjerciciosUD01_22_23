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
        ejercicios.mostrarNumero();
        ejercicios.mostrarNumeroIntroducido();
        ejercicios.mostrarEdadProximoAnio();
        ejercicios.mostrarAniosParaCumplir18();
        ejercicios.calcularEdad();
        ejercicios.incrementarShort();
        ejercicios.calcularMediaAritmetica();
        ejercicios.calcularLongitudYArea();
        ejercicios.truncarNumeroDecimal();
        ejercicios.verificarMayorEdad();
        ejercicios.verificarParidad();
        ejercicios.convertirAMayuscula();
        ejercicios.obtenerSiguienteLetra();
        ejercicios.verificarRango();
        ejercicios.verificarRangoInverso();
        ejercicios.verificarMinuscula();
        ejercicios.calcularMediaTruncada();
        ejercicios.calcularPrecioConIVA();
        ejercicios.convertirSegundosAHorasMinutosSegundos();
        ejercicios.calcularTotalPatas();
    }

    public void saludar() {
        System.out.println("Hola, encantado de conocerte.");
    }

    public void mostrarNumero() {
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("El número introducido es: " + numero);
    }

    public void mostrarNumeroIntroducido() {
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Has introducido el número " + n);
    }

    public void mostrarEdadProximoAnio() {
        System.out.println("Introduce tu edad:");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        System.out.println("El próximo año tendrás " + (edad + 1) + " años");
    }

    public void mostrarAniosParaCumplir18() {
        System.out.println("Introduce tu edad:");
        Scanner scanner = new Scanner(System.in);
        int edadActual = scanner.nextInt();
        int aniosParaCumplir18 = 18 - edadActual;
        System.out.println("Quedan " + aniosParaCumplir18 + " años para que cumplas 18 años");
    }

    public void calcularEdad() {
        System.out.println("Introduce el año actual:");
        Scanner scanner = new Scanner(System.in);
        int añoActual = scanner.nextInt();
        System.out.println("Introduce tu año de nacimiento:");
        int añoNacimiento = scanner.nextInt();
        int edadUsuario = añoActual - añoNacimiento;
        System.out.println("Tu edad es " + edadUsuario + " años");
    }

    public void incrementarShort() {
        short valor = Short.MAX_VALUE;
        valor++;
        System.out.println("El nuevo valor de la variable short es: " + valor);
    }

    public void calcularMediaAritmetica() {
        System.out.println("Introduce el primer número:");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();
        double media = (num1 + num2) / 2;
        System.out.println("La media aritmética es: " + media);
    }

    public void calcularLongitudYArea() {
        System.out.println("Introduce el radio de la circunferencia:");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }

    public void truncarNumeroDecimal() {
        System.out.println("Introduce un número decimal:");
        Scanner scanner = new Scanner(System.in);
        double decimal = scanner.nextDouble();
        int entero = (int) decimal;
        System.out.println("El número entero truncado es: " + entero);
    }

    public void verificarMayorEdad() {
        System.out.println("Introduce tu edad:");
        Scanner scanner = new Scanner(System.in);
        int edadUsuario = scanner.nextInt();
        boolean esMayorEdad = edadUsuario >= 18;
        System.out.println("¿Eres mayor de edad? " + esMayorEdad);
    }

    public void verificarParidad() {
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean esPar = numero % 2 == 0;
        System.out.println("¿Es par? " + esPar);
    }

    public void convertirAMayuscula() {
        System.out.println("Introduce una letra:");
        Scanner scanner = new Scanner(System.in);
        char letra = scanner.next().charAt(0);
        char mayuscula = Character.toUpperCase(letra);
        System.out.println("La letra en mayúscula es: " + mayuscula);
    }

    public void obtenerSiguienteLetra() {
        System.out.println("Introduce una letra:");
        Scanner scanner = new Scanner(System.in);
        char letra = scanner.next().charAt(0);
        char siguienteLetra = (char) (letra + 1);
        System.out.println("La siguiente letra en el alfabeto es: " + siguienteLetra);
        if (siguienteLetra == 'A' || siguienteLetra == 'Z') {
            System.out.println("Cuando utilizas la 'Z' o la 'z', obtienes la siguiente letra que no es una letra del alfabeto.");
        }
    }

    public void verificarRango() {
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean estaEnRango = numero >= 100 && numero <= 200;
        System.out.println("¿El número está en el rango de 100 a 200? " + estaEnRango);
    }

    public void verificarRangoInverso() {
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean estaFueraDeRango = numero < 100 || numero > 200;
        System.out.println("¿El número está fuera del rango de 100 a 200? " + estaFueraDeRango);
    }

    public void verificarMinuscula() {
        System.out.println("Introduce un carácter:");
        Scanner scanner = new Scanner(System.in);
        char caracter = scanner.next().charAt(0);
        boolean esMinuscula = Character.isLowerCase(caracter);
        boolean esMayuscula = Character.isUpperCase(caracter);
        System.out.println("¿Es minúscula? " + esMinuscula);
        System.out.println("¿Es mayúscula o cualquier otro carácter? " + (!esMinuscula && !esMayuscula));
    }

    public void calcularMediaTruncada() {
        System.out.println("Introduce la nota del primer trimestre:");
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre:");
        double nota2 = scanner.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre:");
        double nota3 = scanner.nextDouble();
        int mediaTruncada = (int) ((nota1 + nota2 + nota3) / 3);
        System.out.println("La nota media del curso sin decimales, sin redondear, es: " + mediaTruncada);
    }

    public void calcularPrecioConIVA() {
        System.out.println("Introduce el precio del producto:");
        Scanner scanner = new Scanner(System.in);
        double precio = scanner.nextDouble();
        System.out.println("Introduce el porcentaje de IVA a aplicar:");
        double iva = scanner.nextDouble();
        double precioConIVA = precio + (precio * iva / 100);
        System.out.println("El precio del producto con IVA es: " + precioConIVA);
    }

    public void convertirSegundosAHorasMinutosSegundos() {
        System.out.println("Introduce una cantidad de segundos:");
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;
        System.out.println(segundos + " segundos equivale a " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");
    }

    public void calcularTotalPatas() {
        System.out.println("Introduce el número de hormigas capturadas:");
        Scanner scanner = new Scanner(System.in);
        int hormigas = scanner.nextInt();
        System.out.println("Introduce el número de arañas capturadas:");
        int arañas = scanner.nextInt();
        System.out.println("Introduce el número de cochinillas capturadas:");
        int cochinillas = scanner.nextInt();
        int totalPatas = (hormigas * 6) + (arañas * 8) + (cochinillas * 14);
        System.out.println("El número total de patas de los animales capturados es: " + totalPatas);
    }
}

