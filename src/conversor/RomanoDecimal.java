/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author Robinson Rodriguez
 */
public class RomanoDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        String numero;

        System.out.print("Introduce un número romano: ");
        numero = sc.nextLine();

        Conversor conversor = new Conversor();
        conversor.convertir(numero);
    }

}
