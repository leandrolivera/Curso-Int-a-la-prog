package Tema_3;

/*
Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.

 */
public class Main {

    public static void main(String[] args) {
        //Primera Parte
        sumaTresNumeros(1,2,3);

        //Segunda Parte
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    //Primera Parte
    public static void sumaTresNumeros(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
    }


}


