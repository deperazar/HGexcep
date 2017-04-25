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
public class Empresa {
    private ArrayList<Trabajador> trabajadores;
    
    public Empresa(){
        this.trabajadores=new ArrayList();
    }
    
    public void agregarTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    
    public double calcularsalariototal(){
        double salarioTotal=0;
        for(Trabajador trabajador: trabajadores){
            salarioTotal+=trabajador.calcularsalario();
        }
        return salarioTotal;
    }
    
    public String listarinformaciontrabajadores(){
        String informacion="";
        for(Trabajador trabajador: trabajadores){
            informacion+=" \n"+trabajador.listarinformacion();
        }
        return informacion;
    }
    
    
}
