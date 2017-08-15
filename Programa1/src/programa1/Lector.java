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
        String linea;
        boolean falloEncontrado = false;
        if (archivo.hasNextLine()) {
            while (archivo.hasNextLine() && !falloEncontrado){
                linea = archivo.nextLine();
                //^(([0-9]+([.][0-9]+)?){1}(( {1})?[0-9]+([.][0-9]+)?){1}){1}$
                if (linea.matches("^(([0-9]+([.][0-9]+)?){1}( {1})([0-9]+([.][0-9]+)?){1}){1}$")) {
                    String[] numeros = linea.split(" ");
                    Nodo nodo = new Nodo (Float.valueOf(numeros[0]), Float.valueOf(numeros[1]));
                    falloEncontrado = !salida.insertarNodo(nodo);                    
                } else {
                    System.out.println("Los datos no poseen el formato correcto.");
                    falloEncontrado = true;
                    salida = new Lista();
                }
            }
        }else{
            System.out.println("El archivo está vacío.");
            return null;
        }
        
        return salida;
    }
}
