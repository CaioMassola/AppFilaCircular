/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import appfilaestatica.Fila;
import appfilaestatica.FilaException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class FilaTest {
    private Fila f;
    
    @Before
    public void setup(){
       f = new Fila(10);
    }
    
    @Test
    public void testFilaVazia(){
        
        
        boolean vazia = f.isEmpty();
        assertTrue(vazia);
    }
    @Test(expected = FilaException.class)
    public void testPeekFilaVazia() throws FilaException{
        int valor = f.peek();
    }
   
    @Test
    public void testInserirUmValorNaFila() throws FilaException{
        
        f.enqueue(1);
        assertFalse(f.isEmpty());
        int valor = f.peek();
        assertEquals(1, valor);
    }
    @Test
    public void testInserirDoisValorNaFila() throws FilaException{
        
        f.enqueue(1);
        f.enqueue(2);
        assertFalse(f.isEmpty());
        int valor = f.peek();
        assertEquals(1, valor);
    }
    @Test
    public void testFilaCheia() throws FilaException{
        
        
        for(int i = 0; i < 10; i++){
        f.enqueue(i);
    }
    boolean cheia = f.isFull();
    assertTrue(cheia);
    
        
    }
    @Test(expected = FilaException.class)
    public void testInserirComFilaCheia() throws FilaException{
        
        
        for(int i = 0; i < 10; i++){
        f.enqueue(i);
    }
        f.enqueue(10);
    
}
    
    @Test
    public void testRemoverUmValor() throws FilaException{
        f.enqueue(1);
        f.enqueue(2);
        int valor = f.dequeue();
        assertEquals(1,valor);
        valor = f.dequeue();
        assertEquals(2,valor);
        boolean vazia = f.isEmpty();
        assertTrue(vazia);

    }
}
