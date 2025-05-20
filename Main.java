package preEntrega;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    

    static ArrayList<Productos> lista = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //EL MENÚ ES PARA CARGAR LOS PRODUCTOS O LOS COMBOS QUE SE VENDEN EN LA HAMBURGUESERÍA
        int opcion;
        do{
            System.out.print("╔════════════════════════════════╗");
            System.out.println("\n         PLANETA BURGUER       ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println(" -- MENÚ DE NUESTROS PRODUCTOS --\n");
            System.out.println("    1- Crear producto o combo");
            System.out.println("    2- Mostrar producto o combo");
            System.out.println("    3- Editar producto o combo");
            System.out.println("    4- Eliminar producto o combo");
            System.out.println("    5- Salir del menú\n");
            System.out.println(" ---- Elija una opción válida ----\n");
            opcion = entrada.nextInt();
            entrada.nextLine(); //Limpiar el buffer
        
            
            if (opcion == 1) {
                crearProductos();
            } else if (opcion == 2) {
                listarProductos();
            } else if (opcion == 3) {
                modificarProductos();
            } else if (opcion == 4) {
                eliminarProductos();
            } else if (opcion == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
                  
        }while (opcion !=5);       
    }
    public static void crearProductos() {
        System.out.print("ID: ");
        int id = entrada.nextInt(); entrada.nextLine();
        if (id > 0) {
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine(); 
    
            System.out.print("Precio: ");
            double precio = entrada.nextDouble();
    
           
            Productos nuevo = new Productos(id, nombre, precio);
            lista.add(nuevo);
            System.out.println("Producto agregado ");
            
        }else{
            System.out.println("Ingrese un ID númerico");
        }
    }

    public static void listarProductos() {
        if(lista.isEmpty()){
            System.out.println("No hay productos cargados");
        }else{
            for(Productos a : lista){
                a.mostrar();
            }
        }
    }

    public static void modificarProductos() {
        System.out.print("ID del producto a modificar: " );
        int id = entrada.nextInt();
        for(Productos a : lista){
            if (a.id == id) {
                entrada.nextLine();
                System.out.print("Nuevo nombre: ");
                a.nombre = entrada.nextLine();
                System.out.print("Nuevo precio: ");
                a.precio = entrada.nextDouble();
                System.out.print("Producto actualizado... ");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public static void eliminarProductos() {
        System.out.print("ID del producto a eliminar");
        int idAEliminar = entrada.nextInt();
      
        boolean eliminado = lista.removeIf(articulo -> articulo.id == idAEliminar);

        if (eliminado) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

}