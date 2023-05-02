package arrays;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write anything:");
        String name = sc.nextLine();

        String[] vetor = new String[name.length()];
        String[] consoantes = new String[6];
        int quantidadeConsoantes=0;

        int count =0;

//        for(int i=0; i<name.length(); i++){
//            vetor[i]= String.valueOf(name.charAt(i));
//        }
//
//        for (String v: vetor) {
//            System.out.println(v);
//        }

        do{
            System.out.println("Letra: ");
            String letra = sc.next();
            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){
               consoantes[count] = letra;
               quantidadeConsoantes++;
            }
            count++;

        }while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String c: consoantes) {
            if (c != null) System.out.print(c + " ");
        }

    }
}
