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
public class Activa implements Estado{
    @Override
	public void ejecutarAccion(){
		System.out.println("Estado: Activo");
                System.out.println("Las alarmas estan encedidas");
	}
}
