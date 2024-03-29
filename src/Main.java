import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        /*Scanner scanner = new Scanner(System.in);

        //Introducción de una sola palabra---------------
        *//*System.out.println("Introduce tu nombre");
        String nombreInt = scanner.next();
        System.out.println("Tu nombre es " + nombreInt);*//*

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
        scanner.close();*/


        //ESCRITURA DE FICHERO
        FileWriter escritura = new FileWriter("demo.txt", true);

        /*escritura.write("Primer párrafo\n");
        escritura.write("Segundo párrafo\n");
        escritura.close();*/

        //LECTURA DE FICHERO
        File lectura =  new File("demo.txt");
        //para leer el archivo usamos la clase scanner desde archivos en vez de desde entradas.
        Scanner scanner = new Scanner(lectura);
        //para leer el archivo linea por línea y revisa si quedan lineas pendientes por leer
        while (scanner.hasNext()){
            //nextline lee la linea completa si usamos solo scanner.next lee solo palabras
            String line = scanner.nextLine();
            System.out.println(line);
        }



    }
}