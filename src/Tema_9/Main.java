package Tema_9;

/*
Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.telefono = 98283746;
        cliente.nombre = "Javier";
        cliente.credito = 490.50;

        System.out.println("El nombre del cliente es: " + cliente.nombre + ". Su edad, telefono y credito son: " + cliente.edad + ", " + cliente.telefono + " y $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.telefono = 125555243;
        trabajador.nombre = "Luis";
        trabajador.salario = 100171.94;

        System.out.println("El nombre del trabajador es: " + trabajador.nombre + ". Su edad, telefono y salario son: " + trabajador.edad + ", " + trabajador.telefono + " y $" + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}