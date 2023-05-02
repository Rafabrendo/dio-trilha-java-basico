package loops;

//import java.util.Locale;
import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Write the name: ");
        String name = scan.nextLine();
        System.out.print("How old are you?");
        int age = scan.nextInt();

        System.out.println("Name: "+ name + " Age: " + age);
        */

        while(true){
            System.out.print("Write the name: ");
            String name = scan.nextLine();
            if(name.equals("0")) break;

            System.out.print("How old are you?");
            int age = scan.nextInt();

            System.out.println("Name: "+ name + " Age: " + age);

        }
    }
}
