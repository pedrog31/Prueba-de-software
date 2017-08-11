/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author mario.garciat
 */
public class Calculo {
    
    private Lista listaDatos, listaVacía;
    private Nodo nodoMedia, nodoDesv;
    private float media1, media2, desvEst1, desvEst2;
    
    public Nodo calcularMedia(Lista lista){
        media1 = 0;
        media2 = 0;
        int count = 0;
        nodoMedia = new Nodo();
        Nodo actual = lista.cabeza;
        if(actual.equals(null)){
            System.out.println("Parámetro inválido");
        }else if(actual.primero.equals(null)){
            System.out.println("Lista vacía, ingrese datos");
        }else{
            while(!actual.equals(null)){
                actual = actual.primero;
                media1 = media1 + actual.getDato1;
                media2 = media2 + actual.getDato2;
                count += 1;
                actual = actual.siguiente;
            }
        }
        media1 = media1/count;
        media2 = media2/count;        
        nodoMedia.setDato1(media1);
        nodoMedia.serDato2(media2);
        return nodoMedia;
    }
    
    public Nodo calcularDesvEst(Lista lista){
        desvEst1 = 0;
        desvEst2 = 0;
        nodoDesv = new Nodo();
        nodoMedia = calcularMedia(lista);
        media1 = nodoMedia.getDato1;
        media2 = nodoMedia.getDato2;
        int count = 0;
        Nodo actual = lista.cabeza;
       /* if(actual.equals(null)){
            System.out.println("Parámetro inválido");
        }else if(actual.primero.equals(null)){
            System.out.println("Lista vacía, ingrese datos");
        }else{*/
        while(!actual.equals(null)){
            actual = actual.primero;
            desvEst1 = desvEst1 + Math.pow((actual.getDato1 - media1),2);
            desvEst2 = desvEst2 + Math.pow((actual.getDato2 - media1),2);
            count += 1;
            actual = actual.siguiente;
          
        }
        if(count == 1){
            System.out.println("La lista debe tener más de un dato para calcular la desviación estandar");
        }else{
            desvEst1 = (float) Math.sqrt(desvEst1/(count-1));
            desvEst2 = (float) Math.sqrt(desvEst2/(count-1));
        }
        nodoDesv.setDato1(desvEst1);
        nodoDesv.setDato2(desvEst2);
        return nodoDesv;
    }
}
