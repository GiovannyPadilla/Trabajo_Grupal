import java.util.ArrayList;
import java.util.List;

class GestionClientes {
    private List<Cliente> clientes;

    public GestionClientes() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(int id, Cliente clienteActualizado) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                c.setNombre(clienteActualizado.getNombre());
                c.setDireccion(clienteActualizado.getDireccion());
                c.setInformacionContacto(clienteActualizado.getInformacionContacto());
                c.setHistorialCompras(clienteActualizado.getHistorialCompras());
                c.setPreferencias(clienteActualizado.getPreferencias());
                return;
            }
        }
        System.out.println("Cliente con ID " + id + " no encontrado.");
    }

    public boolean eliminarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getId() == id) {
                clientes.remove(i);
                return true; // Cliente eliminado exitosamente
            }
        }
        return false; // Cliente no encontrado
    }


    public Cliente buscarCliente(int idBuscar) {
        for (Cliente c : clientes) {
            if (c.getId() == idBuscar) {
                return c;
            }
        }
        return null;
    }

    public void imprimirListadoClientes() {
        for (Cliente cliente : clientes) {
            cliente.imprimirDetalles();
            System.out.println();
        }
    }

    public int size() {
        return clientes.size();
    }
}
