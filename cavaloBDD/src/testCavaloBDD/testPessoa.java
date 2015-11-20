/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testCavaloBDD;

import cavaloBDD.pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexandre.peixoto
 */

public class testPessoa {
    
    public testPessoa() {
    }
    
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        pessoa novaPessoa = new pessoa();
        String Resultado = "";
        String ResultadoRetorno = novaPessoa.getNome();
        assertEquals(Resultado, ResultadoRetorno);
        fail("The test case is a prototype.");
    }
    
}
