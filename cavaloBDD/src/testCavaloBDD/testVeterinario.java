/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testCavaloBDD;

import cavaloBDD.veterinario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author alexandre.peixoto
 */

public class testVeterinario {
    
    public testVeterinario() {
    }
    
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        veterinario novoVeterinario = new veterinario();
        String Resultado = "";
        String ResultadoRetorno = novoVeterinario.getNome();
        assertEquals(Resultado, ResultadoRetorno);
        fail("The test case is a prototype.");
    }
}
