package arrays;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
//        Random random = new Random();
//
//        int[][] M = new int[4][4];
//
//        for (int i = 0; i <M.length; i++) {
//            for (int j = 0; j <M[i].length; j++) {
//                M[i][j] = random.nextInt(100);
//            }
//        }
//
//        System.out.println("Matriz: ");
//        for (int[] linha: M) {
//            for (int coluna : linha) {
//                System.out.print(coluna + " ");
//            }
//            System.out.println();
//        }

        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.print(numeros[2][2]);
    }
}

