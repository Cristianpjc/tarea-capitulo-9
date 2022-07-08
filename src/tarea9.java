public class tarea9 {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Cristian";
        cliente.edad = 39;
        cliente.telefono = 6564212;
        cliente.credito = 234.678;
        System.out.println("Soy" + cliente.nombre + "tengo" + cliente.edad + "anhos y mi telefono es" + cliente.telefono
                + "y mi credito disponible es " + cliente.credito + "$");

        trabajador.nombre = "Selva";
        trabajador.edad = 45;
        trabajador.telefono = 654211665;
        trabajador.salario = 2500;

        System.out.println("Soy" + trabajador.nombre + "tengo" + trabajador.edad + "anhos y mi telefono es"
                + trabajador.telefono + "y mi salario es de " + trabajador.salario + "$");

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