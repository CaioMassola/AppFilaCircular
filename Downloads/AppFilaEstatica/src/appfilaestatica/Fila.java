
package appfilaestatica;

/**
 *
 * @author lab801
 */
public class Fila {
    
    private int vet[];
    private int ultimo;
    
    public Fila(int tamanho){
        vet = new int [tamanho];
        ultimo = -1;
    }

    public boolean isEmpty() {
       return (ultimo == -1);
    }

    public void enqueue(int valor) throws FilaException {
        if(isFull())
            throw new FilaException("Fila Cheia");
        ultimo++;
        vet[ultimo] = valor;
        
    }
    
    public int peek() throws FilaException{
        if(isEmpty())
            throw new FilaException("Fila Vazia");
        return vet[0];
    
    }  

    public boolean isFull() {
        return (ultimo == vet.length -1);
    }

    public int dequeue() throws FilaException {
       if(isEmpty())
           throw new FilaException("Fila Vazia");
       int valor = vet[0];
       for(int i =0;i<ultimo; i++){
           vet[i] = vet[i+1];
       }
       ultimo--;
       return valor;
    }
}
