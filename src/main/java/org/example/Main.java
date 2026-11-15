package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trabajo trabajo= new Trabajo();
        Scanner sc= new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("--MENU EMPLEADOS--");
            System.out.println("1. Registrar empleado tiempo completo");
            System.out.println("2. Registrar empleado medio tiempo");
            System.out.println("3. Mostrar empleados registrados");
            System.out.println("4. Mostrar estadisticas");
            System.out.println("5. Salir");
            System.out.println("Escoja una opcion: ");
            opcion=sc.nextInt();
            sc.nextLine();
            if(opcion==1){
                System.out.println("Codigo: ");
                String codigo=sc.nextLine().trim();
                System.out.println("Nombre: ");
                String nom=sc.nextLine().toLowerCase().trim();
                System.out.println("Apellido: ");
                String apellido=sc.nextLine().toLowerCase().trim();
                System.out.println("Cargo: ");
                String cargo=sc.nextLine().trim();
                System.out.println("Sueldo base: ");
                double sueldo=sc.nextDouble();
                System.out.println("Bono: ");
                double bono=sc.nextDouble();
                trabajo.registrarEmpleadoTiempoCompleto(codigo,nom,apellido,cargo,sueldo,bono);
            }else if(opcion==2){
                System.out.println("Codigo: ");
                String codigo=sc.nextLine().trim();
                System.out.println("Nombre: ");
                String nom=sc.nextLine().toLowerCase().trim();
                System.out.println("Apellido: ");
                String apellido=sc.nextLine().toLowerCase().trim();
                System.out.println("Cargo: ");
                String cargo=sc.nextLine().trim();
                System.out.println("Horas trabajadas: ");
                int horas=sc.nextInt();
                System.out.println("Pago por hora: ");
                int pago=sc.nextInt();
                sc.nextLine();
                trabajo.registrarEmpleadoMedioTiempo(codigo,nom,apellido,cargo,horas,pago);
            }else if(opcion==3){
                trabajo.mostrarEmpleados();
            }else if(opcion==4){
                trabajo.mostrarEstadisticas();
            }else if(opcion==5){
                System.out.println("Saliendo...");
                break;
            }else{
                System.out.println("ERROR.Escoja una opcion correcta");
            }
        }while(opcion!=5);




    }
}