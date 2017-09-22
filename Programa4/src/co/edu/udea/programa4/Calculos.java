package co.edu.udea.programa4;

public class Calculos {
    
    private double vs, small, medium, large, vl;
    private double avg, variance, stndDeviate;
    
    public static double calcularMedia(ListaLigada datos){
        double media = 0;
        if(datos.getCabeza().getDato()==0)
            return media;
        else{
            double numerador;
            numerador = datos.sumar();
            media = numerador/datos.getCabeza().getDato();
        }
        return media;
    }
    
    public ListaLigada calcularDatos(ListaLigada x, ListaLigada y){
        if(y == null)
            return null;
        ListaLigada coeficiente = ListaLigada.dividirValores(x,y);
        double cantidadDatos;
        cantidadDatos = coeficiente.getCantidadNodos();
        double sumatoriaLista = sumarLnsLista(coeficiente);
        
        avg = sumatoriaLista/cantidadDatos;
        variance = sumarLnsLista(coeficiente,avg,2)/(cantidadDatos-1);
        stndDeviate = Math.sqrt(variance);
        
        vs = Math.exp(avg-2*stndDeviate);
        small = Math.exp(avg-stndDeviate);
        medium = Math.exp(avg);
        large = Math.exp(avg+stndDeviate);
        vl = Math.exp(avg+2*stndDeviate);
        
        return coeficiente;
    }
    
    public static double roundDouble(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        double result = 0;
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        if(factor != 0)
            result = (double) tmp / factor;
        return result;
    }

    public static double sumarLnsLista(ListaLigada coeficiente) {
        Nodo pivote = coeficiente.getPrimero();
        double suma=0;
        double lnDato;
        while(null!=pivote){
            lnDato = Math.log(pivote.getDato());
            suma = suma + lnDato;
            pivote = pivote.getSiguiente();
        }
        return suma;
    }

    public static double sumarLnsLista(ListaLigada coeficiente, double avg, double i) {
        Nodo pivote = coeficiente.getPrimero();
        double suma = 0;
        double dato;
        while(pivote!=null){
            double termino = Math.log(pivote.getDato())-avg;
            dato = Math.pow(termino, i);
            suma = suma + dato;
            pivote = pivote.getSiguiente();
        }
        return suma;
    }
    
    public double getVs() {
        return vs;
    }

    public double getSmall() {
        return small;
    }

    public double getMedium() {
        return medium;
    }

    public double getLarge() {
        return large;
    }

    public double getVl() {
        return vl;
    }
    
    
    
}
