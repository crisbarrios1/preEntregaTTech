package preEntrega;

public class Productos {   
    int id;
    String nombre;
    double precio;    

    public Productos(int idParametro, String nombreParametro, double precioParametro){

        this.id = idParametro;
        this.nombre = nombreParametro;
        this.precio = precioParametro;
    }

    void mostrar() {
        System.out.println("ID: " + id + " ║ Nombre: " + nombre + " ║ Precio: $" + precio);
    }

    public static void crearProductos() {
        System.out.print("ID: ");
        int id = Main.entrada.nextInt(); 
        Main.entrada.nextLine();
    
        System.out.print("Nombre: ");
        String nombre = Main.entrada.nextLine(); Main.entrada.nextLine();
    
        System.out.print("Precio: ");
        double precio = Main.entrada.nextDouble();
        
        Productos nuevo = new Productos(id, nombre, precio);
        Main.lista.add(nuevo);
        System.out.println("Artículo agregado ");
    }
}
