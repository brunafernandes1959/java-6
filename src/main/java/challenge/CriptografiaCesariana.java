package challenge;


import java.util.Arrays;

import java.util.List;


public class CriptografiaCesariana implements Criptografia {


    @Override

    public String criptografar(String texto) {

        if(texto.toString().isEmpty())

            throw new IllegalArgumentException();

        if(texto.toString().equals(null))

            throw new NullPointerException();

        try {

            int chave = 3;

            StringBuilder textoCifrado = new StringBuilder();


            int tamanhoTexto = texto.length();

            Integer n[] = new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

            List<Integer> numeros = Arrays.asList(n);


            for (int c = 0; c < tamanhoTexto; c++) {

                int letraCifradaASCII;

                int letraASCII = ((int) texto.charAt(c));

                if (letraASCII != 32 && !numeros.contains(letraASCII)) {


                    letraCifradaASCII = ((int) texto.charAt(c)) + chave;

                } else {

                    letraCifradaASCII = letraASCII;

                }


                while (letraCifradaASCII > 126)

                    letraCifradaASCII -= 94;


                textoCifrado.append((char) letraCifradaASCII);


            }



            return textoCifrado.toString().toLowerCase();


        } catch (Exception e) {


            throw new UnsupportedOperationException("esse method nao esta implementado aainda");

        }


    }


    @Override

    public String descriptografar(String texto) {

        if(texto.toString().isEmpty())

            throw new IllegalArgumentException();


        if(texto.toString().equals(null))

            throw new NullPointerException();


        try {



            int chave = -3;



            StringBuilder textoCifrado = new StringBuilder();



            int tamanhoTexto = texto.length();


            Integer n[] = new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

            List<Integer> numeros = Arrays.asList(n);



            for (int c = 0; c < tamanhoTexto; c++) {

                int letraCifradaASCII;

                int letraASCII = ((int) texto.charAt(c));

                if (letraASCII != 32 && !numeros.contains(letraASCII)) {


                    letraCifradaASCII = ((int) texto.charAt(c)) + chave;

                } else {

                    letraCifradaASCII = letraASCII;

                }


                while (letraCifradaASCII > 126)

                    letraCifradaASCII -= 94;



                textoCifrado.append((char) letraCifradaASCII);


            }



            return textoCifrado.toString().toLowerCase();


        } catch (Exception e) {


            throw new UnsupportedOperationException("Método não implementado");

        }


    }


}

