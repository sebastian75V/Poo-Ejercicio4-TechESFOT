package org.example;

public class EmpleadoTiempoCompleto extends Empleado{
    private double sueldoBase;
    private double sueldoBono;

    public EmpleadoTiempoCompleto(String codigo, String nombre, String apellido, String cargo, double sueldoBase,double sueldoBono) {
        super(codigo, nombre, apellido, cargo);
        this.sueldoBase=sueldoBase;
        this.sueldoBono = sueldoBono;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getSueldoBono() {
        return sueldoBono;
    }

    @Override
    public double calcularSueldo() {
        double sueldo=this.sueldoBase+this.sueldoBono;
        return sueldo;

    }

    @Override
    public String toString() {
        return super.toString()+"Sueldo: "+calcularSueldo();
    }
}
