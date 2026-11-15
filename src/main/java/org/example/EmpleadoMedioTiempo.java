package org.example;

public class EmpleadoMedioTiempo extends Empleado{
    private int horas;
    private int sueldoHoras;

    public EmpleadoMedioTiempo(String codigo, String nombre, String apellido, String cargo, int horas, int sueldoHoras) {
        super(codigo, nombre, apellido, cargo);
        this.horas = horas;
        this.sueldoHoras = sueldoHoras;
    }

    public int getHoras() {
        return horas;
    }

    public int getSueldoHoras() {
        return sueldoHoras;
    }

    @Override
    public double calcularSueldo() {
        double sueldo=horas*sueldoHoras;
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Sueldo: "+calcularSueldo();
    }
}
