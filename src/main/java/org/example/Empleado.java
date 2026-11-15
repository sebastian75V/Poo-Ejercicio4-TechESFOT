package org.example;

public class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private String cargo;
    private double sueldobase;

    public Empleado(String codigo, String nombre, String apellido, String cargo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldobase() {
        return sueldobase;
    }

    public double calcularSueldo(){
        return sueldobase;
    }

    @Override
    public String toString() {
        return
                "codigo=" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'';
    }
}
