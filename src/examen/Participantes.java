
package examen;

import javax.swing.JOptionPane;

public class Participantes {
    
    private final int numAleat;
    private String nombre;
    private String apellido;
    private int edad;
    
     public Participantes() {
        numAleat = (int)(Math.random()*6+1);
        nombre ="";
        apellido ="";
        edad = 0;
     }
        
        public double mostrarNumAleat(){
        return numAleat;
    }
         public void ingresar_datos(){
        boolean error = false;
        nombre=JOptionPane.showInputDialog("ingrese su nombre por favor");
        apellido=JOptionPane.showInputDialog("Ingrese su apellido");
        do{
            try{
            
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad por favor"));
            error=true;
        } catch(NumberFormatException e){
                
                System.out.println(e);
                
                      
        }}while(!error);
    
        
        
    }

    public String mostrar_datos(){
        return "nombre = "+ nombre+" apellido = "+apellido+" edad = "+edad;
    }
    
}
