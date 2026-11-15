package org.example;

import java.util.ArrayList;

public class Trabajo {
    ArrayList<Empleado> trbajadores=new ArrayList<>();


    public void registrarEmpleadoTiempoCompleto(String codigo, String nombre, String apellido,String cargo, double sueldo, double bono){
        if(codigo.isBlank()){
            System.out.println("Error no ingreso el codigo");
        }
        if(sueldo<0){
            System.out.println("Error ingrese un sueldo valido");
        }
        if(bono<0){
            System.out.println("Error ingrese un bono valido");
        }
        trbajadores.add(new EmpleadoTiempoCompleto(codigo,nombre,apellido,cargo,sueldo,bono));
        System.out.println("Empleado tiempo completo registrado correctamente");
    }
    public void registrarEmpleadoMedioTiempo(String codigo,String nombre,String apellido,String cargo,int horas, int sueldoHoras){
        if(codigo.isBlank()){
            System.out.println("Error no ingreso codigo");
        }
        if(horas<0){
            System.out.println("Escriba horas positivas");
        }
        if(sueldoHoras<0){
            System.out.println("Escriba horas positivas");
        }
        trbajadores.add(new EmpleadoMedioTiempo(codigo,nombre,apellido,cargo,horas,sueldoHoras));
        System.out.println("Empleado medio tiempo registrado correctamente");
    }
    public void mostrarEmpleados(){
        if(trbajadores.isEmpty()){
            System.out.println("Error esta vacio");
        }
        for(Empleado e:trbajadores){
            System.out.println(e);
        }
    }
    public void mostrarEstadisticas(){
        if(trbajadores.isEmpty()) {
            System.out.println("Error la lista esta vacia");
        }
       Empleado e= trbajadores.get(0);
        double sumaTotal=0;
        for(Empleado emp:trbajadores){
            double sueldoActual=emp.calcularSueldo();
            sumaTotal+=sueldoActual;
            if(sueldoActual>e.calcularSueldo()){
                e=emp;
            }
        }
        double promedio=sumaTotal/trbajadores.size();
        System.out.println("Empleado con mayor sueldo: "+e.getNombre());
        System.out.println("Promedio de sueldos: "+promedio);


    }

}
