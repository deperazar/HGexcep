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
public class Programador extends Empleado{
    
    protected String lenguaje;
    public Programador(int id,String nombre, double salario, String lenguaje){
        super(id, nombre,salario);
        this.lenguaje=lenguaje;
    }
    
    
    @Override
    public double calcularsalario(){
        double salarioTotal=this.salario;
        if(this.lenguaje.equals("java")){
            salarioTotal+=(this.salario*0.2);
        }
                return salarioTotal;
    }
    
    @Override
    public String listarinformacion(){
        return "Programador "+this.id+" "+this.nombre;
    }
    
    
    
}
