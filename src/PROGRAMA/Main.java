package PROGRAMA;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    ArrayList<Matricula> listaMatriculas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n----- MENU PRINCIPAL -----");
        System.out.println("1. Registrar Alumno");
        System.out.println("2. Generar Matrícula");
        System.out.println("3. Mostrar Listado de Alumnos Matriculados");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        switch (opcion) {
            case 1:
            //Registro de alumno
            System.out.println("\n----- REGISTRO DE ALUMNO -----");
            System.out.print("DNI: ");
                String dni = scanner.nextLine();
            System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
            System.out.print("Distrito: ");
                String distrito = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Sexo: ");
                String sexo = scanner.nextLine();
                listaAlumnos.add(new Alumno(dni, nombre, distrito, edad, sexo));
            System.out.println("Alumno registrado con éxito.");
            break;
            case 2:
            //Generar matrícula
                if (listaAlumnos.isEmpty()) {
                System.out.println("\nNo hay alumnos registrados.");
            break;
        }
        System.out.println("\n----- GENERAR MATRÍCULA -----");
        System.out.println("Seleccione un alumno por índice:");
        for (int i = 0; i < listaAlumnos.size(); i++) {
        System.out.println(i + ". " + listaAlumnos.get(i));
    }
    int indice = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer
        if (indice >= 0 && indice < listaAlumnos.size()) {
            Alumno alumno = listaAlumnos.get(indice);
            System.out.print("Curso: ");
                String curso = scanner.nextLine();
            System.out.print("Fecha de Inicio (YYYY-MM-DD): ");
            LocalDate fechaInicio = LocalDate.parse(scanner.nextLine());
            System.out.print("Subtotal: ");
            double subtotal = scanner.nextDouble();
                Matricula matricula = new Matricula(alumno, curso, fechaInicio, subtotal);
                listaMatriculas.add(matricula);
            System.out.println("\nMatrícula generada con exito.");
                matricula.generarBoleta();
        } else {
            System.out.println("\nÍndice no válido.");
        }
        break;
        case 3:
        //Mostrar listado de alumnos matriculados
        System.out.println("\n----- LISTADO DE ALUMNOS MATRICULADOS -----");
        if (listaMatriculas.isEmpty()) {
            System.out.println("No hay matrículas registradas.");
        } else {
            for (Matricula matricula : listaMatriculas) {
                 System.out.println(matricula);
            }
        }
        break;
            case 4:
                System.out.println("\nSaliendo del sistema...");
                break;
                default:
                System.out.println("\nOpción no válida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
