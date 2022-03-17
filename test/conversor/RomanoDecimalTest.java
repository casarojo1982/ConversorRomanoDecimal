/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Robin
 */
public class RomanoDecimalTest {

    /**
     * Test of main method, of class RomanoDecimal.
     */
    @Test
    public void RomanoDecimalTest() throws Throwable {

        String numero="CXLVI", sc="CXLVI";

        Conversor conversor = new Conversor();
        conversor.convertir(numero);
        
        assertEquals(numero, sc);
    }

}
