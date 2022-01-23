/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisteejemplos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        
        empleado1.setClaveEmpleado(2424);
        empleado1.setNombre("Luis");
        empleado1.setApellidoPaterno("Hernandez");
        empleado1.setApellidoMaterno("Guevara");
        
        empleado2.setClaveEmpleado(3542);
        empleado2.setNombre("Juan");
        empleado2.setApellidoPaterno("Lopez");
        empleado2.setApellidoMaterno("Jimenez");
        
        //ArrayList
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        
        for (Empleado e : listaEmpleados) {
            System.out.println(e.getClaveEmpleado());
            System.out.println(e.getNombre());
        }
        
        listaEmpleados.size();
        listaEmpleados.trimToSize();
        
        
        //HashMap
        HashMap<Integer ,Empleado> empleados = new HashMap<Integer, Empleado>();
        empleados.put(1, empleado1);
        empleados.put(2, empleado2);
    }
}
