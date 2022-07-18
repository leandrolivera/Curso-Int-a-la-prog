package Tema_4;/*
*
*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque
de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la
que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*
*
* */

public class Main {
    public static void main(String[] args) {
        //Genero un numero random entre -5 y 5:
        System.out.println("Inciso 1:");
        int numeroIf = (int) (Math.random()*(5-(-5))) + (-5);
        if (numeroIf == 0){
            System.out.println("La variable numeroIf es: 0");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf es: positiva");
        } else {
            System.out.println("La variable numeroIf es: negativa");
        }

        System.out.println("\nInciso 2:");
        int numeroWhile = -1;
        while(numeroWhile < 3){
            System.out.println("numeroWhile = "+numeroWhile);
            numeroWhile++;
        }

        System.out.println("\nInciso 3:");
        int numeroDoWhile = 2;
        do {
            System.out.println("numeroDoWhile = "+numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile < 3);

        System.out.println("\nInciso 4:");
        for (int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("numeroFor = "+numeroFor);
        }

        System.out.println("\nInciso 5:");
        String estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("La estación es verano");
                break;
            case "Otoño":
                System.out.println("La estación es otoño");
                break;
            case "Invierno":
                System.out.println("La estación es invierno");
                break;
            case "Primavera":
                System.out.println("La estación es primavera");
                break;
            default:
                System.out.println("El texto ingresado no pertenece a una estación.");
                break;
        }
    }
}