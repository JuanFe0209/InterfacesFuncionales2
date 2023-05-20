import java.util.Arrays;
import java.util.List;

class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
public class EjemploSorted {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Felipe", 20),
                new Persona("Sebastian", 30),
                new Persona("Ximena", 21)
        );
        List<Persona> personasOrdenadas = personas.stream()
                .sorted((p1, p2) -> p1.getEdad() - p2.getEdad())
                .toList();
        personasOrdenadas.forEach(p -> System.out.println(p.getNombre() + " - Edad: " + p.getEdad()));
    }
}
