package ec.jolube.ejercicio.code.review.java;
        
//no utilizar datos primitivos int double
//cambiar por Integer, 


public class Utilitarios {
    
    //average deberia devolver Double para evitar perdida de 
    //datos o a su vez hacer un round si se retorna int
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    //el resultado del factorial es entero
    //se puede utilizar Integer para retorno
    public double factorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    //se puede colocar la variable PI mediante librería MATH para 
    //resutado mas acertado
    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    //es mejor utilizar variables con nombres que representen lo que hacen
    // utilizar directo base * altura
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;      //se asigna un valor 
        resultado = (b * h) / 2;
        return resultado;
    }

    
    //falta declarar la constante como static final int
    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
