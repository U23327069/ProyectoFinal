package PROGRAMA;
public class Alumno {
    private String dni;
    private String nombre;
    private String distrito;
    private int edad;
    private String sexo;
    public Alumno(String dni, String nombre, String distrito, int edad, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.distrito = distrito;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDistrito() {
        return distrito;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Distrito: " + distrito + 
               ", Edad: " + edad + ", Sexo: " + sexo;
    }
}