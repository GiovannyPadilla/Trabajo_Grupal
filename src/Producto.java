import java.util.ArrayList;
import java.util.List;

// Clase Producto: representa un producto en el inventario
// Clase Producto: representa un producto en el inventario
class Producto {
    private int id;
    private String nombrep;
    private int cantidad;
    private double precio;

    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombrep = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombrep;
    }

    public void setNombre(String nombre) {
        this.nombrep = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para imprimir los detalles del producto
    public void imprimirDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombrep);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }
}









