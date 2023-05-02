package loops;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = sc.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente:  ");
            nota = sc.nextInt();
        }


    }

}
