/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_estado;

/**
 *
 * @author frank
 */
public class Alarma {
    private Estado miEstado;
    public void setEstado(Estado e){
        this.miEstado = e;
    }
    public void ejecutarAccion(){
        miEstado.ejecutarAccion();
    }
}