package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar cantidad de personas
        System.out.println("¿Cuántas personas quieres ingresar?");
        int numPersonas = scanner.nextInt();
        Persona[] personas = new Persona[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Ingrese la cédula:");
            String cedula = scanner.next();
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido:");
            String apellido = scanner.next();
            System.out.println("Ingrese la dirección:");
            String direccion = scanner.next();

            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        // Ingresar cantidad de familiares
        System.out.println("¿Cuántos familiares quieres ingresar?");
        int numFamiliares = scanner.nextInt();
        Familiar[] familiares = new Familiar[numFamiliares];

        for (int i = 0; i < numFamiliares; i++) {
            System.out.println("Ingrese la cédula:");
            String cedula = scanner.next();
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido:");
            String apellido = scanner.next();
            System.out.println("Ingrese la dirección:");
            String direccion = scanner.next();
            System.out.println("Ingrese el parentesco:");
            String parentesco = scanner.next();
            System.out.println("Ingrese el tipo de sangre:");
            String tipoSangre = scanner.next();
            System.out.println("Ingrese el año de nacimiento:");
            int anioNacimiento = scanner.nextInt();

            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoSangre, anioNacimiento);
        }

        // Mostrar Personas
        System.out.println("\n--- Lista de Personas ---");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

        // Mostrar Familiares
        System.out.println("\n--- Lista de Familiares ---");
        for (Familiar familiar : familiares) {
            System.out.println(familiar.toString());
        }
    }
}


