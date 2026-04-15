import java.util.HashMap;
import java.util.Scanner;

public class Alumno {
    String nombre;
    String contrasenia;
    HashMap<String, Integer> materiasInscriptas;

    public Alumno(String nombre, String password) {
        this.nombre = nombre;
        this.contrasenia = password;
        this.materiasInscriptas = new HashMap<>();
    }
}