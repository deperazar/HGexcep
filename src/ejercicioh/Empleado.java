/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioh;

/**
 *
 * @author Estudiante
 */
public abstract class Empleado extends Trabajador{
    protected String nombre;
    protected double salario;
    
    public Empleado(int id, String nombre, double salario){
        super(id);
        this.nombre=nombre;
        this.salario=salario;
    }
    
    
    
}
