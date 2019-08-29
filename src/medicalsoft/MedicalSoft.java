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
        Medico primerMedico = new Medico("juan" , "Ramirez");
        System.out.println(primerMedico.getNombre());
        System.out.println(primerMedico.getApellido());   
    }

}
