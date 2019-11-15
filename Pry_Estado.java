/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_estado;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Pry_Estado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alarma alarma = new Alarma();
        Activa activa = new Activa();
    	Mantenimiento mantenimiento = new Mantenimiento();
	int opcion = 0;
	Scanner sc = new Scanner(System.in);
	do{
            muestraMenu();
            opcion = sc.nextInt();
            switch(opcion){
		case 1:
                    alarma.setEstado(activa);
		break;
		case 2:
                    alarma.setEstado(mantenimiento);
		break;
		case 0:
                    System.exit(0);
		default:
                    System.out.println("Opcion errada");
            }
            alarma.ejecutarAccion();
        }while(opcion!=0);
        
    }
    
    private static void muestraMenu(){
		StringBuffer menu = new StringBuffer();
		menu.append("* SELECCIONE EL ESTADO DE LA ALARMA    *\n");
		menu.append("* 1- ACTIVA. 2- MANTENIMIENTO 0- SALIR *\n");
		System.out.println(menu.toString());
	}
}