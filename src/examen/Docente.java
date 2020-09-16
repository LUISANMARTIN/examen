/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


 import javax.swing.JOptionPane;

public class Docente extends Participantes {
     private String asignatura;

    public Docente() {
       asignatura = null;
    }
    public void establecerAsignatura(){
        asignatura = JOptionPane.showInputDialog("Digite la materia por favor");
    }
    

    @Override
    public String toString() {
        return "Estudiantes{" + super.mostrar_datos() + " materia = " + asignatura +" "+ super.mostrarNumAleat()+ '}';
    }
    
}
