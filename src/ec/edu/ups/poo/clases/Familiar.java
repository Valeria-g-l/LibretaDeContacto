package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {


    // Atributos
    private String parentesco;
    private String tipoDeSangre;
    private int anioNacimiento;

    // Constructores
    public Familiar() {
    }

    public Familiar(String nombre, String apellido, String cedula, String direccion, String parentesco, String tipoDeSangre, int anioNacimiento) {
        super(nombre, apellido, cedula, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.anioNacimiento = anioNacimiento;
    }

    // Getters & Setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }


    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        return anioActual - anioNacimiento;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nParentesco: " + parentesco +
                "\nTipo de sangre: " + tipoDeSangre +
                "\nEdad: " + calcularEdad() + " años";
    }
}


