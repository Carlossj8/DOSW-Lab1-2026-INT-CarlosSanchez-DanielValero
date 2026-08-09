package Laboratorio1.reto1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String Semestre;
    private String correo;

    public Estudiante(String nombre, int edad, String Semestre, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.Semestre = Semestre;
        this.correo = correo;

    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSemestre() {
        return Semestre;
    }
    public void setSemestre(String semestre) {
        this.Semestre = semestre;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}