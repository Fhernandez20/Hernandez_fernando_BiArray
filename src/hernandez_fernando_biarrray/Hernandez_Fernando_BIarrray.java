/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernando_biarrray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fdhg0
 */
public class Hernandez_Fernando_BIarrray {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        int tamanoArreglo = 0;
        int listaNumeros[][] = {};
        int numeroRandom;

        System.out.println("Ingrese el tamaño del arreglo: ");
        tamanoArreglo = lea.nextInt();
        int fila = tamanoArreglo;
        int columna = tamanoArreglo;
        int listaNumero[][] = new int[fila][columna];
        int contadorColumna = 0;
        int contadorFila = 0;
        int sumadiagonal = 0;
        int sumadiagonalReversa = 0;

        for (contadorFila = 0; contadorFila < tamanoArreglo; contadorFila++) {
            for (contadorColumna = 0; contadorColumna < tamanoArreglo; contadorColumna++) {
                numeroRandom = random.nextInt(10, 99);
                listaNumero[contadorFila][contadorColumna] = numeroRandom;
                System.out.print(listaNumero[contadorFila][contadorColumna] + " ");

                if (contadorFila == contadorColumna) {
                    sumadiagonal += numeroRandom;
                    String numeroMostrar;

                }
                if (contadorFila + contadorColumna == tamanoArreglo - 1) {
                    sumadiagonalReversa += numeroRandom;
                }

            }
            System.out.println("");

        }
        System.out.println("la suma diagonal es " + sumadiagonal);
        System.out.println("la suma de la diagonal inversa: " + sumadiagonalReversa);
    }
}
