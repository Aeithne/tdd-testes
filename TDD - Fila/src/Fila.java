/**
 * Aula Prática: Tópicos Especiais em Computação.
 * @author 2014.1.08.010
 */
public class Fila {
    
    public int tamanho;
    public int tamanho_max = 10;
    public int valor_retirado;
    public int[] valor = new int[tamanho_max];
    

    public int[] insere(int valor) {
        this.valor[tamanho] = valor;
        tamanho = tamanho+1;
        return this.valor;
    }
    
    public int retira() {
        valor_retirado = valor[0];
        for (int i = 0; i < tamanho; i++) valor[i] = valor[i+1];
        tamanho = tamanho-1;
        return valor_retirado;
    }
    
    public boolean filaCheia() {
        return tamanho >= tamanho_max;
    }
    
    public boolean filaVazia() {
        return tamanho <= 0;
    }
    
    public static void main(String[] args) {};
    
}
