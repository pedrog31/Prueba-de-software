import co.edu.udea.programa4.Calculos;
import co.edu.udea.programa4.GestionDatos;
import co.edu.udea.programa4.ListaLigada;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculosTest {
    GestionDatos obtenerDatos = new GestionDatos();
    ListaLigada x;
    ListaLigada y;
    
    public CalculosTest() throws IOException {
        this.x = obtenerDatos.leerDatos(",");
        this.y = obtenerDatos.leerDatos(",");
    }
    
    @Test
    public void dividirValoresTest() throws IOException{
        ListaLigada resultado;
        resultado = ListaLigada.dividirValores(x,y);
        assertNotNull(resultado);
    }
    
    @Test
    public void sumarLnsListaTest(){
        double promedio = Calculos.calcularMedia(x);
        Double result = Calculos.sumarLnsLista(x, promedio, 2);
        assertTrue(result!=0);
    }

    @Test
    public void sumarLnsListaTestDos(){
        x = ListaLigada.dividirValores(x,y);
        Double result = Calculos.sumarLnsLista(x);
        assertTrue(result!=0);
    }
    
    @Test
    public void roundDoubleTest(){
        assertTrue(Calculos.roundDouble(5, 10) >= 0);
    }
}
