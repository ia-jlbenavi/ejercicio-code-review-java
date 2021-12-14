package ec.jolube.ejercicio.code.review.java;

/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos
 * números
 */
public class Calculadora {

    public int suma(int num1, int num2) {
        //metodo para crear una suma
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    // se debe validar que el divisor no sea 0 
    //ya que no existe la división para 0
    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }

}
