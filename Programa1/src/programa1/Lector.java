/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Lector {
    
    private String ruta;

    public Lector(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public Lista leerDatos() throws FileNotFoundException{
        Lista salida = new Lista();
        
        Scanner archivo;
        try {
            archivo = new Scanner(new File(ruta));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe en la misma carpeta del ejecutable.");
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        
        if (archivo.hasNextLine()) {
            while (archivo.hasNextLine()) {                
                System.out.println(archivo.next());
            }
        }else{
            System.out.println("El archivo está vacío.");
        }
        
        return salida;
    }
}
