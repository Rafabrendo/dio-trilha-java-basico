package loops;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;
        /*
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;

        } while(count < 5);
        */
        int maiorNumero = 0;
        int soma = 0;
        do{

            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma+=numero;

            if(numero > maiorNumero) maiorNumero = numero;

            count++;
        }while (count < 5);

        System.out.println("Maior numero: "+ maiorNumero);
        System.out.println("Media: "+ (soma/5));


    }
}
