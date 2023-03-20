import java.util.Arrays;
import java.util.Scanner;

public class Reto2 {
  public static void main(String[] args) {
    //declarar varibles 
    String palabra;
    //instanciar clase 
    Scanner Registro=new Scanner(System.in);
    //solicitar datos 
    System.out.print("Ingresa una palabra: ");
    palabra=Registro.nextLine();
    // palabra convertida en un array
    char[] letra = palabra.toCharArray();

    // alamecenar el array
    char[] caracteresInvertidos = new char[letra.length];

    // Invertir los caracteres y almacenar en el array 
    for (int i = 0; i < letra.length; i++) {
      caracteresInvertidos[i] = letra[letra.length - 1 - i];
    }

    // Comparamos los arrays de caracteres y caracteres invertidos
    boolean equals = Arrays.equals(letra, caracteresInvertidos);
    if (equals) {
      System.out.println("La palabra "+palabra+" es un palíndromo.");
    } else {
      System.out.println("La palabra "+palabra+" no es un palíndromo.");
    }
    //Limpiar bufer 
    Registro.close();
  }
}
