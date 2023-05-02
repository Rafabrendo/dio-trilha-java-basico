package arrays;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i=0; i<numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int elemento: numerosAleatorios) {
            System.out.print(elemento + " ");
        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for (int elemento: numerosAleatorios) {
            System.out.print(elemento+1 + " ");
        }

    }
}
