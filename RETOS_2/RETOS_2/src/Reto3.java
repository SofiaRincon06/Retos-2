import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        
        //crear matriz
    String[][] tablero=new String[5][5];
    //instanciar clase 
    Scanner Registro= new Scanner(System.in);
    //llenar matriz
    tablero[0]=new String[] {"AC", "()", "%", "/"};
    tablero[1]=new String[] {"7", "8", "9", "X"};
    tablero[2]=new String[] {"4", "5", "6", "-"};
    tablero[3]=new String[] {"1", "2", "3", "+"};
    tablero[4]=new String[] {"0", ",", "⌫", "="};
    //crear el bucle  i filas j columnas 
        for (int i=0;i<tablero.length; i++) {
            for (int j=0;j<tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
          
    }
    //limpiar bufer 
    Registro.close();
}
}