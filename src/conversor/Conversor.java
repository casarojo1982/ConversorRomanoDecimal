/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Hashtable;

/**
 *
 * @author Robinson Rodriguez
 */
public class Conversor {

    public void convertir(String valorConvertir) {

        Hashtable<String, Integer> hashNumerosRomanos = new Hashtable<String, Integer>();
        int longitudNumero = 0;
        int decimal = 0;
        String resultado;
        int valor = 0;
        char letra;
        boolean existe = false, restricciones = true;
        int anterior = 0;

        String numeroRomano = valorConvertir.trim();
        longitudNumero = numeroRomano.length();

        String longMaxPermitidaM = "MMMM";
        String longMaxPermitidaC = "CCCC";
        String longMaxPermitidaX = "XXXX";
        String longMaxPermitidaD = "DD";
        String longMaxPermitidaL = "LL";
        String longMaxPermitidaV = "VV";
        String noPermRestarIL = "IL";
        String noPermRestarIC = "IC";
        String noPermRestarID = "ID";
        String noPermRestarIM = "IM";
        String noPermRestarVL = "VL";
        String noPermRestarVC = "VC";
        String noPermRestarVD = "VD";
        String noPermRestarVM = "VM";
        String noPermRestarLD = "LD";
        String noPermRestarLM = "LM";

        hashNumerosRomanos.put("I", 1);
        hashNumerosRomanos.put("V", 5);
        hashNumerosRomanos.put("X", 10);
        hashNumerosRomanos.put("L", 50);
        hashNumerosRomanos.put("C", 100);
        hashNumerosRomanos.put("D", 500);
        hashNumerosRomanos.put("M", 1000);

        numeroRomano = numeroRomano.toUpperCase();

        if (numeroRomano.contains(longMaxPermitidaM)
                || numeroRomano.contains(longMaxPermitidaC)
                || numeroRomano.contains(longMaxPermitidaX)
                || numeroRomano.contains(longMaxPermitidaD)
                || numeroRomano.contains(longMaxPermitidaL)
                || numeroRomano.contains(longMaxPermitidaV)
                || numeroRomano.contains(noPermRestarIL)
                || numeroRomano.contains(noPermRestarIC)
                || numeroRomano.contains(noPermRestarID)
                || numeroRomano.contains(noPermRestarIM)
                || numeroRomano.contains(noPermRestarVL)
                || numeroRomano.contains(noPermRestarVC)
                || numeroRomano.contains(noPermRestarVD)
                || numeroRomano.contains(noPermRestarVM)
                || numeroRomano.contains(noPermRestarLD)
                || numeroRomano.contains(noPermRestarLM)) {
            restricciones = false;
        }

        for (int i = 0; i < longitudNumero; i++) {
            letra = numeroRomano.charAt(i);

            if (Character.isWhitespace(letra)) {
                continue;
            }

            existe = hashNumerosRomanos.containsKey(Character.toString(letra).toUpperCase());

            if (existe) {

                valor = hashNumerosRomanos.get(Character.toString(letra).toUpperCase());
                decimal = decimal + valor;

                if (anterior < valor) {
                    decimal = decimal - anterior * 2;
                    anterior = valor;
                } else {
                    anterior = valor;
                }
            } else {
                decimal = 0;
            }
        }

        if ((decimal != 0) && restricciones) {
            resultado = "El valor del número romano " + numeroRomano + " en numeros decimales es: " + decimal;
            System.out.println(resultado);

        } else {
            resultado = "El numero romano introducido '" + valorConvertir + "' no es correcto";
            System.out.println(resultado);

        }
    }

}
