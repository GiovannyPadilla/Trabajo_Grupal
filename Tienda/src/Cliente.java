import java.util.ArrayList;
import java.util.List;

class Cliente {
    private int id;
    public String nombre;
    private String direccion;
    private String informacionContacto;
    private String historialCompras;
    private String preferencias;

    public Cliente(int id, String nombre, String direccion, String informacionContacto, String historialCompras, String preferencias) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.informacionContacto = informacionContacto;
        this.historialCompras = historialCompras;
        this.preferencias = preferencias;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getInformacionContacto() {
        return informacionContacto;
    }

    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public void imprimirDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Informacion de Contacto: " + informacionContacto);
        System.out.println("Historial de Compras: " + historialCompras);
        System.out.println("Preferencias: " + preferencias);
    }
}