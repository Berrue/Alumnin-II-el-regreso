import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Alumno> alumnos = new HashMap<>();
        while (true) {
            System.out.println("------ Alumnin 3.0 ------");
            System.out.println("¿Estas registrado?: ");
            String chequeo = scanner.nextLine();
            if (chequeo.equals("si")) {
                System.out.println("Ingrese su nombre");
                String nombre_r = scanner.nextLine();
                if (alumnos.containsKey(nombre_r)){
                    System.out.println("Hola, "+ nombre_r + ", Ingresa tu contraseña: ");
                    String v_contrasenia = scanner.nextLine();
                    if (alumnos.get(nombre_r).contrasenia.equals(v_contrasenia)){
                        System.out.println("Contraseña correcta, entrando al sistema...");
                        break;
                    }
                    else{
                        System.out.println("Contraseña incorrecta");
                    }
                }
                else{
                    System.out.println("No estas registrado");
                }
                continue;
            } else if (chequeo.equals("no")) {
                System.out.println("Ingrese su nombre para registrarse: ");
                String nuevo_nombre = scanner.nextLine();
                System.out.println("Ingrese su nueva contraseña");
                String nueva_contrasenia = scanner.nextLine();
                alumnos.put(nuevo_nombre, new Alumno (nuevo_nombre, nueva_contrasenia));
                continue;
            } else {
                System.out.println("Escribi bien porfa");
                continue;
        }

            }
        }
    }
