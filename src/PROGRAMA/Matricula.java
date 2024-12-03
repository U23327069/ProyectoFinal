package PROGRAMA;
import java.time.LocalDate;
public class Matricula {
    private Alumno alumno;
    private String curso;
    private LocalDate fechaInicio;
    private double subtotal;
    public Matricula(Alumno alumno, String curso, LocalDate fechaInicio, double subtotal) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.subtotal = subtotal;
    }
    public void generarBoleta() {
        double igv = subtotal * 0.18;
        double total = subtotal + igv;
        System.out.println("\n----- BOLETA DE MATRÍCULA -----");
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Curso: " + curso);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.printf("Subtotal: S/ %.2f\n", subtotal);
        System.out.printf("IGV (18%%): S/ %.2f\n", igv);
        System.out.printf("Total a Pagar: S/ %.2f\n", total);
        System.out.println("-------------------------------");
    }
    @Override
    public String toString() {
        return "Alumno: " + alumno.getNombre() + ", Curso: " + curso + 
               ", Fecha de Inicio: " + fechaInicio;
    }
}