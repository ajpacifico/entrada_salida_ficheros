import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Introducción de una sola palabra---------------
        /*System.out.println("Introduce tu nombre");
        String nombreInt = scanner.next();
        System.out.println("Tu nombre es " + nombreInt);*/

        //Introducción de una cadena de texto completa---
        System.out.println("Introduce tu nombre y apellido");
        String nombreInt2 = scanner.nextLine();
        System.out.println("Tu nombre y apellido es " + nombreInt2);

        //Introducción de números-------------------------
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        //Ejemplo de condicional--------------------------
        while (edad <= 0){
            System.out.println("Introduce una edad valida");
            edad = scanner.nextInt();
        }
        System.out.println("Tu edad es " + edad);
        scanner.close();

    }
}