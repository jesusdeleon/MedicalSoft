/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class MedicalSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Medico medico1 = new Medico(" Jesus","De leon");
        
        medico1.setNombre("Jesus");
        medico1.setApellido("De leon");
        medico1.setFecha_nacimiento("09/08/1997");
        System.out.println("Tu edad es: "+medico1.getEdad()+"años \n"
        + "El medico es: "+medico1.getNombre());   
    }

}
