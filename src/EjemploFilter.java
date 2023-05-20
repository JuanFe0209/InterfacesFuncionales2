import java.util.Arrays;
import java.util.List;

class Producto {
    private String nombre;
    private double precio;
    private boolean enStock;

    public Producto(String nombre, double precio, boolean enStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.enStock = enStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEnStock() {
        return enStock;
    }
}

public class EjemploFilter {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Portatil", 2500000, true),
                new Producto("Mouse", 10000, true),
                new Producto("Teclado", 50000, false),
                new Producto("Monitor", 400000, false)
        );

        List<Producto> productosEnStock = productos.stream()
                .filter(Producto::isEnStock)
                .toList();

        productosEnStock.forEach(p -> System.out.println(p.getNombre()));
    }
}
