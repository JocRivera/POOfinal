import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void readStudent() {
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numeroEstudiantes = input.nextInt();
        for (int i = 1; i <= numeroEstudiantes; i++) {
            System.out.println("Estudiante #" + i);
            System.out.print("id: ");
            String id = input.next();
            System.out.print("Nombre: ");
            String nombre = input.next();
            System.out.print("Email: ");
            String email = input.next();
            Estudiante estudiante = new Estudiante();
            estudiante.setId(id);
            estudiante.setNombre(nombre);
            estudiante.setEmail(email);
            estudiantes.add(estudiante);
        }
    }

    public static void getStudents() {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.println(estudiantes.get(i).getId());
            System.out.println(estudiantes.get(i).getNombre());
            System.out.println(estudiantes.get(i).getEmail());
        }
    }

    public static void getStudentById() {
        System.out.print("Digite la id que quiere buscar: ");
        String id = input.next();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId().equals(id)) {
                System.out.println(estudiantes.get(i).getId());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());
            }
        }
    }

    public static void updateStudent() {
        System.out.println("Digite la id del estudiante a actualizar");
        String id = input.next();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId().equals(id)) {
                System.out.println("Estudiante encontrado");
                System.out.println(estudiantes.get(i).getId());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());
                System.out.println("Nuevo nombre: ");
                String newName = input.next();
                estudiantes.get(i).setNombre(newName);
                System.out.println("Nombre actualizado: " + estudiantes.get(i).getNombre());
                System.out.println("Nuevo email: ");
                String newEmail = input.next();
                estudiantes.get(i).setEmail(newEmail);
                System.out.println("Email actualizado: " + estudiantes.get(i).getEmail());
            }
        }

    }

    public static void main(String[] args) {
        readStudent();
        getStudentById();
        updateStudent();
    }

}