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
public class Consultor extends Trabajador{
    
    private String labor;
    
    public Consultor(int id, String labor){
        super(id);
        this.labor=labor;
    }
    
    
    @Override
    public double calcularsalario(){
        return 220;
    }
    @Override
    public String listarinformacion(){
        return "Consultor "+ this.id+" "+this.labor;
    }
    
}
