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
public class Mantenimiento implements Estado{
    @Override
	public void ejecutarAccion(){
		System.out.println("Estado: Mantenimiento");
                System.out.println("Las alarmas estan apagadas");
                System.out.println("Enviar correo para informar estado");
	}
}
