/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import appfilacircular.FilaCircular;
import appfilacircular.FilaCircularException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Caio
 */
public class FilaCircularTest {

    @Test
    public void FilaCircularTestVazia() {
        FilaCircular f = new FilaCircular(10);
        boolean vazia = f.isEmpty();
        assertTrue(vazia);
    }

    @Test
    public void TestInserirUmValorNaFilaCircular() throws FilaCircularException {
        FilaCircular f = new FilaCircular(10);
        f.enqueue(1);
        assertFalse(f.isEmpty());
        int valor = f.peek();
        assertEquals(1, valor);

    }
    @Test
    public void testInserirDoisValorNaFilaCircular() throws FilaCircularException{
        FilaCircular f = new FilaCircular(10);
        f.enqueue(1);
        f.enqueue(2);
        assertFalse(f.isEmpty());
        int valor = f.peek();
        assertEquals(1, valor);
    }
   

    @Test(expected = FilaCircularException.class)
    public void testPeekFilaCircularVazia() throws FilaCircularException {
        FilaCircular f = new FilaCircular(10);
        int valor = f.peek();
    }

    @Test
    public void testFilaCircularCheia() throws FilaCircularException {
        FilaCircular f = new FilaCircular(10);

        for (int i = 0; i < 10; i++) {
            f.enqueue(i);
        }
        boolean cheia = f.isFull();
        assertTrue(cheia);
    }

    @Test(expected = FilaCircularException.class)
    public void testInserirComFilaCircularCheia() throws FilaCircularException {
        FilaCircular f = new FilaCircular(10);

        for (int i = 0; i < 10; i++) {
            f.enqueue(i);
        }
        f.enqueue(10);

    }

    

    @Test
    public void testRemoverUmValorNaFilaCircular() throws FilaCircularException {
        FilaCircular f = new FilaCircular(10);
        f.enqueue(1);
        f.enqueue(2);
        int valor = f.dequeue();
        assertEquals(1, valor);
        valor = f.dequeue();
        assertEquals(2, valor);
        boolean vazia = f.isEmpty();
        assertFalse(vazia);
    }
      
}