import java.util.Scanner;
//crear metodo
public class Reto1{
    public static void main(String[] args) {
        //declarar varibales 
        double apuesta=100000;
        int partidasGa=0;
        int partidasPer=0;
        String nombreUsuario;
        //instanciar clase 
        Scanner Registro=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
         nombreUsuario=Registro.nextLine();

        boolean seguirJugando = true;
        //crear bucle 
        while (seguirJugando) {
            int intentosRestantes = 10;
            char letraIngresada;
            boolean letraEncontrada = false;
            char[] palabraAdiv;

            String[] palabras={"chimuelo", "pelota", "iglesia", "carro", "pastilla", "parque"};
            String palabraSeleccionada=palabras[(int) (Math.random()*palabras.length)];
            palabraAdiv= new char[palabraSeleccionada.length()];
            //crear bucle
            for (int i = 0; i < palabraAdiv.length; i++) {
                palabraAdiv[i] = '_';
            }
            //crear bucle
            while (intentosRestantes > 0 && !palabraSeleccionada.equals(new String(palabraAdiv))) {
                System.out.print("Palabra a adivinar: ");
                for (char letra : palabraAdiv) {
                    System.out.print(letra + " ");
                }
                System.out.println();
                System.out.println("Intentos restantes: " + intentosRestantes);
                System.out.print("Ingresa una letra: ");
                letraIngresada=Registro.next().charAt(0);

                letraEncontrada = false;
                for (int i = 0; i < palabraSeleccionada.length(); i++) {
                    if (palabraSeleccionada.charAt(i) == letraIngresada) {
                        palabraAdiv[i] = letraIngresada;
                        letraEncontrada = true;
                    }
                }
                if (!letraEncontrada) {
                    intentosRestantes--;
                }
            }
            if (intentosRestantes == 0) {
                System.out.println("Lo siento, " + nombreUsuario + ", perdiste:(. La palabra era: " + palabraSeleccionada);
                apuesta = apuesta -10000;
                partidasPer++;
            } else {
                System.out.println("¡Felicidades, " + nombreUsuario + "! Adivinaste la palabra: " + palabraSeleccionada);
                apuesta = apuesta +5000;
                partidasGa++;
            }

            System.out.println("Tu apuesta actual es de: $" + apuesta);
            System.out.println("Llevas " + partidasGa + " partidas ganadas y " + partidasPer + " partidas perdidas.");

            System.out.print("¿Quieres seguir jugando? (s/n): ");
            String respuesta=Registro.next();
            seguirJugando = respuesta.equalsIgnoreCase("s");
        }
        //imprimir resultados 
        System.out.println("Gracias por jugar, " + nombreUsuario + ". Tu saldo final es de: $" + apuesta);
        //limpiar bufer
        Registro.close();
    }
}
