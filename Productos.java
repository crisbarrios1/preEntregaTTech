package preEntrega;

// EJEMPLO DE PROGRAMACIÓN ORIENTADA A OBJETOS
public class Productos {     // ->Clase pública para poder usarla dentro del main importandola
    //Primero van los atributos del artículo o del objeto
    int id;
    String nombre;
    double precio;    

    //METODOS PROPIOS DEL ARTÍCULO
    //Constructor de la clase Articulo
    //Se utiliza para crear un objeto de la clase Articulo
    //El constructor tiene el mismo nombre de la clase
    public Productos(int idParametro, String nombreParametro, double precioParametro){

        //La palabra reservada this alude al objeto actual de la clase que se está
        //llamando que se está creando
        //El objeto cuando se crea en memoria se le asigna una dirección en memoria
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
