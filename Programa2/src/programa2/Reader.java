/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Reader {

    private String ruta;
    private Parser parser;

    public Reader(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void readData() throws FileNotFoundException {
        Scanner archivo;
        try {
            archivo = new Scanner(new File(ruta));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe en la misma carpeta del ejecutable.");
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        String linea;
        parser = new Parser();
        if (archivo.hasNextLine()) {
            while (archivo.hasNextLine()) {
                linea = archivo.nextLine();
                parser.identify(linea);
            }
        } else {
            System.out.println("El archivo está vacío.");
        }

    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

}
