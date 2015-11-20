/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testCavaloBDD;

import cavaloBDD.cavalo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author alexandre.peixoto
 */

public class testCavalo {
        
    public testCavalo() {
    }
    
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        cavalo novoCavalo = new cavalo();
        String Resultado = "Mensagem Polimórfica";
        String ResultadoRetorno = novoCavalo.getNome();
        assertEquals(Resultado, ResultadoRetorno);
        fail("The test case is a prototype.");
    }
    
}
