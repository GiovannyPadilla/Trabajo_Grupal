import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso del sistema de gestión de inventario
        Inventario inventario = new Inventario();
        GestionClientes gestionClientes = new GestionClientes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Imprimir inventario");
            System.out.println("5. Agregar cliente");
            System.out.println("6. Eliminar cliente");
            System.out.println("7. Buscar cliente");
            System.out.println("8. Actualizar cliente");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    Producto nuevoProducto = new Producto(inventario.size() + 1, nombre, cantidad, precio);
                    inventario.agregarProducto(nuevoProducto);
                    System.out.println("Producto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el ID del producto a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    System.out.print("Ingrese el nuevo nombre del producto: ");
                    String nombreActualizar = scanner.next();
                    System.out.print("Ingrese la nueva cantidad del producto: ");
                    int cantidadActualizar = scanner.nextInt();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    double precioActualizar = scanner.nextDouble();
                    Producto productoActualizar = new Producto(idActualizar, nombreActualizar, cantidadActualizar, precioActualizar);
                    inventario.actualizarProducto(idActualizar, productoActualizar);
                    System.out.println("Producto actualizado correctamente.");
                    break;
                case 3:
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    inventario.eliminarProducto(idEliminar);
                    System.out.println("Producto eliminado correctamente.");
                    break;
                case 4:
                    inventario.imprimirInventario();
                    break;
                case 5:
                    System.out.print("Ingrese el ID del cliente: ");
                    int idCliente = scanner.nextInt();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.next();
                    System.out.print("Ingrese la dirección del cliente: ");
                    String direccionCliente = scanner.next();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefonoCliente = scanner.next();
                    System.out.print("Ingrese el producto comprado por el cliente: ");
                    String comprasCliente = scanner.next();
                    System.out.print("Ingrese las preferencias del cliente: ");
                    String categoriasCliente = scanner.next();
                    Cliente nuevoCliente = new Cliente(idCliente, nombreCliente, direccionCliente, telefonoCliente, comprasCliente, categoriasCliente);
                    gestionClientes.agregarCliente(nuevoCliente);
                    System.out.println("Cliente agregado correctamente.");
                    break;
                case 6:
                    System.out.print("Ingrese el ID del cliente a buscar: ");
                    int idBuscar = scanner.nextInt();

                    Cliente clienteEncontrado = gestionClientes.buscarCliente(idBuscar);
                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado:");
                        System.out.println(clienteEncontrado);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el ID del cliente a eliminar: ");
                    int idEliminarC = scanner.nextInt();
                    boolean eliminado = gestionClientes.eliminarCliente(idEliminarC);
                    if (eliminado) {
                        System.out.println("Cliente eliminado correctamente.");
                    } else {
                        System.out.println("Cliente con ID " + idEliminarC + " no encontrado.");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el ID del cliente a actualizar: ");
                    int idActualizarC = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nuevo nombre del cliente: ");
                    String nombreActualizarC = scanner.nextLine();
                    System.out.print("Ingrese la nueva dirección del cliente: ");
                    String direccionActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo teléfono del cliente: ");
                    String telefonoActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo historial de compras del cliente: ");
                    String comprasActualizar = scanner.nextLine();
                    System.out.print("Ingrese las nuevas preferencias del cliente: ");
                    String preferenciasActualizar = scanner.nextLine();
                    Cliente clienteActualizado = new Cliente(idActualizarC, nombreActualizarC, direccionActualizar, telefonoActualizar, comprasActualizar, preferenciasActualizar);
                    gestionClientes.actualizarCliente(idActualizarC, clienteActualizado);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}