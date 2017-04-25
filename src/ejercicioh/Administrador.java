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
public class Administrador extends Empleado{
    
    public Administrador(int id,String nombre ){
        super(id, nombre,100);
    }
    
    
    @Override
    public double calcularsalario(){
        return this.salario;
    }
    
    @Override
    public String listarinformacion(){
        return "Administrador "+this.id+" "+this.nombre;
    }
}
