/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class ver_ganador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante= new Estudiante();
       // JOptionPane.showInternalMessageDialog(null, "ingresar datos del alumno");
        Docente docente = new Docente();
        estudiante.ingresar_datos();
        estudiante.ingresarGrado();
        docente.ingresar_datos();
        docente.establecerAsignatura();
        
         if(docente.mostrarNumAleat() < estudiante.mostrarNumAleat()){
            System.out.println(estudiante.toString());
            
        }if(docente.mostrarNumAleat() > estudiante.mostrarNumAleat()){
            System.out.println(docente.toString());
            
        }if(docente.mostrarNumAleat() == estudiante.mostrarNumAleat()) {
            System.out.println(" a sido un empate");
        }          
        
           
    }
    
}
