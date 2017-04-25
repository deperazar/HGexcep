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
public abstract class Trabajador {
    protected int id;
    
    public Trabajador(int Id){
        this.id=Id;
    }
    
    
    public abstract double calcularsalario();
    public abstract String listarinformacion();
    
}
