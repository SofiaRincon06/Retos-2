public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[][] productos = new String[5][3]; // matriz de 16 filas y 3 columnas para almacenar los productos
    
        // Llenar la máquina con 16 nombres de productos y su respectivo precio
        for (int i = 0; i <= productos.length; i++) {
          System.out.println();("Ingrese el nombre del producto #" + (i + 1) + ": ");
          productos[i][0] = lectura.nextLine();
          System.out.print("Ingrese el precio del producto #" + (i + 1) + ": ");
          productos[i][1] = lectura.nextLine();
        }
    
        // Mostrar el catálogo de productos
        System.out.println("Catálogo de productos:");
        System.out.println("----------------------");
        System.out.println("Código | Nombre | Precio");
        for (int i = 0; i < productos.length; i++) {
          System.out.println(i + " | " + productos[i][0] + " | " + productos[i][1]);
        }
        lectura.close();
      }
    }


