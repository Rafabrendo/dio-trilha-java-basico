package arrays;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 15, 50, 8, 4};

        for (int v: vetor) {
            System.out.println(v);
        }

        System.out.println();

        int count =0;
        //while(count < (vetor.length-1)){
        while(count < (vetor.length)){
            System.out.println(vetor[count]);

            count++;
        }
        System.out.println();
        for( int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
