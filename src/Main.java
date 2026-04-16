import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Alumno> alumnos = new HashMap<>();
        String nombre_r = "";
        List<String> materias = List.of("matematica", "geografia", "deporte");
        while (true) {
            System.out.println("------ Alumnin 3.0 ------");
            System.out.println("¿Estas registrado?: ");
            String chequeo = scanner.nextLine();
            if (chequeo.equals("si")) {
                System.out.println("Ingrese su nombre");
                nombre_r = scanner.nextLine();
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
            } else if (chequeo.equals("no")) {
                System.out.println("Ingrese su nombre para registrarse: ");
                String nuevo_nombre = scanner.nextLine();
                System.out.println("Ingrese su nueva contraseña");
                String nueva_contrasenia = scanner.nextLine();
                alumnos.put(nuevo_nombre, new Alumno (nuevo_nombre, nueva_contrasenia));
            } else {
                System.out.println("Escribi bien porfa");
        }
            }
        while (true){
            System.out.println("----- Menu -----");
            System.out.println("¿Donde queres dirigirte? \n1. Registro de materias \n2. Ingresar notas \n3. Ver notas \n4. Darse de baja de materias \n5. Salir del sistema\n-");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1){
                int i = 1;
                System.out.println("Materias para inscribirse");
                for (String materia : materias){
                    System.out.println(i + ". " + materia);
                    i += 1;
                }
                String eleccion = scanner.nextLine();
                if (materias.contains(eleccion)){
                    if (alumnos.get(nombre_r).materiasInscriptas.containsKey(eleccion)){
                        System.out.println("Ya estas registrado a esta materia");
                    }
                    else{
                        alumnos.get(nombre_r).materiasInscriptas.put(eleccion, 0);
                        System.out.println("-----------------");
                        System.out.println("Te registraste a " + eleccion);
                    }
                }
                else{
                    System.out.println("Esa materia no existe, intenta nuevamente");
                    continue;
                }
            }
            if (opcion ==2){
                System.out.println("Selecciona la materia: ");
                int i = 1;
                for (String materia : materias){
                    System.out.println(i + ". " + materia);
                    i +=1;
                }
                String eleccion = scanner.nextLine();
                if (alumnos.get(nombre_r).materiasInscriptas.containsKey(eleccion)){
                    System.out.println("Ingresa la nota de "+ eleccion);
                    int nota = scanner.nextInt();
                    alumnos.get(nombre_r).materiasInscriptas.put(eleccion, nota);
                }
                else{
                    System.out.println("No estas inscripto a la materia que ingresaste");
                    continue;
                }
            }
            if (opcion == 3){

                System.out.println("---------");
                for (HashMap.Entry<String, Integer> entry : alumnos.get(nombre_r).materiasInscriptas.entrySet()) {
                    String materia = entry.getKey();
                    Integer nota = entry.getValue();
                    for (String)
                }
                }
            }
            if (opcion == 5){
                System.out.println("Saliendo del sistema...");
                break;
            }
        }
        }
    }
