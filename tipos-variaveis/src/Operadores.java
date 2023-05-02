public class Operadores {
    
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;

        System.out.println(- numero);
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        // Operador ternário:
        
        int a, b;

        a = 5;
        b = 6;
        // String resultado = "";
        // /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE 
        //  * if(a==b)
        //  *    resultado = "verdadeiro";
        //  * else
        //  *    resultado = "falso";
        // */

        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";
        
        // System.out.println(resultado)

        String resultado = a==b ? "verdadeiro" : "falso";


        System.out.println("resultado: " + resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente de numero 2? " + simNao);

        String nomeUm = "Rafa";
        String nomeDois = "Brendo";

        System.out.println(nomeUm.equals(nomeDois));

    }
}
