import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
* @author 2014.1.08.010
 */
public class FilaTest extends Fila {
    @Test
    /* assertEquals está sendo usado para saber o retorno da variável
    enquanto assertTrue tem a intenção de saber se o retorno da variável
    é o intencionado.
    Um novo AssertEquals é colocado para saber se o tamanho da fila 
    aumentou*/
    public void testeInsere() {
        int tam = tamanho;
        int[] fila = insere(1);
        assertEquals(fila, valor);
        assertTrue(fila == valor);
        assertEquals(tamanho, tam+1);
    }
    /* No retirar, o assertTrue é feito para saber se a variável retornada 
    é a variável retirada da fila 
    um novo AssertEquals é colocado para checar se o tamanho da fila 
    diminuiu*/
    @Test
    public void testeRetira() {
        int tam = tamanho;
        assertTrue(retira() == valor_retirado);
        assertEquals(tamanho, tam-1);
    }
    
    @Test
    /* O primeiro assertEquals é feito para retornar o tamanho da fila.
    */
    // Ele agora passa a ser um assertTrue para representar a mudança
    // da função base para boolean
    public void testeFilaCheia() {
        for (int i = tamanho; i < tamanho_max; i++) insere(i);
        assertEquals(tamanho, tamanho_max);
        assertTrue(filaCheia());
    }
    
    @Test
    /* O primeiro assertEquals é para checar se o tamanho da fila é zero.
    */
    // Ele agora passa a ser um assertTrue para representar a mudança
    // da função base para boolean
    public void testeFilaVazia() {
        for (int i = tamanho; i < 0; i--) retira();
        assertEquals(tamanho, 0);
        assertTrue(filaVazia());
    }
        
    
}
