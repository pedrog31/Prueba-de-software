/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.naming.spi.DirStateFactory.Result;
import org.junit.*;
/**
 *
 * @author pedrog31
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader entrada = new InputStreamReader (System.in); 
        System.out.println("Por favor digite la ruta del archivo");
        BufferedReader bEntrada = new BufferedReader (entrada);
        String ruta = bEntrada.readLine();
        Lector lectorArchivos = new Lector (ruta);
        Lista listaDatos = lectorArchivos.leerDatos();
        Calculo calculo = new Calculo ();
        Nodo media = calculo.calcularMedia(listaDatos);
        Nodo desviacionEstandar = calculo.calcularDesvEst(listaDatos);
        System.out.println("La Media de los datos en la columna 1 es: " + media.getColumna1());
        System.out.println("La Desviacion estandar de los datos en la columna 1 es: " + desviacionEstandar.getColumna1());
        System.out.println("La Media de los datos en la columna 2 es: " + media.getColumna2());
        System.out.println("La desviacion de los datos en la columna 2 es: " + desviacionEstandar.getColumna2());
    }
    
}
