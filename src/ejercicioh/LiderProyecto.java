/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioh;


import java.util.*;
/**
 *
 * @author Estudiante
 */
public class LiderProyecto extends Programador {
    
    private ArrayList<Programador>  programadores;
    
    public LiderProyecto(int id,String nombre, double salario, String lenguaje ){
        super(id, nombre,salario, lenguaje);
        this.programadores=new ArrayList();
    }
    
    
    public void agregarprogramador(Programador p){
        programadores.add(p);
    }
    
    
    
    @Override
    public double calcularsalario(){
        double salariototal=0;
        salariototal+=super.calcularsalario()*(super.calcularsalario()*this.programadores.size()*0.1);
        
        return salariototal;
    }
    
    @Override
    public String listarinformacion(){
        String informacion=super.listarinformacion();
        informacion="Programadores a cargo\n";
        for(Programador programador: programadores){
            informacion+=programador.listarinformacion();
        }
        return informacion;
    }
    
}
