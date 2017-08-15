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
    private NodoCabeza cabeza;
    private float media1, media2, desvEst1, desvEst2;
    
    public Nodo calcularMedia(Lista lista){
        media1 = 0;
        media2 = 0;
        int count = 0;
        nodoMedia = new Nodo();
        Nodo actual;
        if(lista == null){
            System.out.println("Parámetro inválido");
            return null;
        }
        cabeza = lista.getCabeza();
        if(cabeza.getLigaInicio() == null){
            System.out.println("Lista vacía, ingrese datos");
        }else{
            actual = cabeza.getLigaInicio();
            while(actual != null){
                media1 = media1 + actual.getColumna1();
                media2 = media2 + actual.getColumna2();
                count += 1;
                actual = actual.getLiga();
            }
            media1 = media1/count;
            media2 = media2/count;        
            nodoMedia.setColumna1(media1);
            nodoMedia.setColumna2(media2);
        }
        
        return nodoMedia;
    }
    
    public Nodo calcularDesvEst(Lista lista){
        desvEst1 = 0;
        desvEst2 = 0;
        nodoDesv = new Nodo();
        Nodo actual;
        nodoMedia = calcularMedia(lista);
        if(nodoMedia == null){
            System.out.println("Parámetro inválido");
            return null;
        }
        media1 = nodoMedia.getColumna1();
        media2 = nodoMedia.getColumna2();
        int count = 0;
        cabeza = lista.getCabeza();
        if(cabeza.getLigaInicio() == null){
            System.out.println("Lista vacía, ingrese datos");
        }else{
            actual = cabeza.getLigaInicio();
            while(actual != null){
                desvEst1 = desvEst1 + (float)Math.pow((actual.getColumna1()-media1),2);
                desvEst2 = desvEst2 + (float)Math.pow((actual.getColumna2()-media2),2);
                count += 1;
                actual = actual.getLiga();
            }
            if(count == 1){
                System.out.println("La lista debe tener más de un dato para calcular la desviación estandar");
            }else{
                desvEst1 = (float) Math.sqrt(desvEst1/(count-1));
                desvEst2 = (float) Math.sqrt(desvEst2/(count-1));
                desvEst1 = (float) (Math.rint((double)desvEst1*100)/100);
                desvEst2 = (float) (Math.rint((double)desvEst2*100)/100);
            }
            nodoDesv.setColumna1(desvEst1);
            nodoDesv.setColumna2(desvEst2);
        }
        return nodoDesv;
    }
}
