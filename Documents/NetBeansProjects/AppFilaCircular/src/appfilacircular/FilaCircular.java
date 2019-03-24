package appfilacircular;
//Caio Henrique Massola, RA: 21095014

public class FilaCircular {

    private int circulo[];
    private int ultimo;
    private int primeiro;
   

    

    public FilaCircular(int tamanho) {
        this.circulo = new int[tamanho];
        this.primeiro = -1;
        this.ultimo = -1;
        

    }
    public int getSize(){
        return this.ultimo+1;
    }

    public boolean isEmpty() {
        return (this.primeiro == -1);

    }
    
    public void enqueue(int valor) throws FilaCircularException{
        if(isFull()){
        throw new FilaCircularException("Fila Circular Cheia");
        }
        else if (isEmpty()){
            this.primeiro++;
            this.circulo[++this.ultimo] = valor;
        }
        else{
            int size = circulo.length -1;
            if (this.ultimo == size) {
                this.ultimo = ultimo%size;
                this.circulo[this.ultimo] = valor;
            } 
            else{
                this.circulo[++this.ultimo] = valor;
            }  
        }
        } 
    
        
    
    
public int peek() throws FilaCircularException{
        if(isEmpty())
      throw new FilaCircularException("Fila Circular Vazia");
        return circulo[0];
    
}
    public boolean isFull() {
     return (ultimo ==circulo.length - 1);
     
    }
     
    
    
    public int dequeue() throws FilaCircularException {
        if(isEmpty()){
            throw new FilaCircularException ("Fila Circular Vazia");
        
    }
        int remover = this.circulo[this.primeiro];
        if(this.primeiro ==this.primeiro){
            this.primeiro = 1;
            this.ultimo = -1;
        }
        else {
            int size = circulo.length -1;
            if(this.primeiro == size){
                this.primeiro = this.primeiro%size;
            }
        }
        return remover;
}
}
            
            
       
  
  
  

  
