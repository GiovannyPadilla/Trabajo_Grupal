import java.util.ArrayList;
import java.util.List;

class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(int id, Producto productoActualizado) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setNombre(productoActualizado.getNombre());
                p.setCantidad(productoActualizado.getCantidad());
                p.setPrecio(productoActualizado.getPrecio());
                break;
            }
        }
    }

    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    // Método para imprimir todos los productos del inventario
    public void imprimirInventario() {
        for (Producto producto : productos) {
            producto.imprimirDetalles();
            System.out.println(); // Línea en blanco para separar los detalles de los productos
        }
    }

    public int size() {
        return productos.size();
    }
}
