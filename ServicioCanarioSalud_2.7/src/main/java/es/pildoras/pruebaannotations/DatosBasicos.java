package es.pildoras.pruebaannotations;

public class DatosBasicos {
    private String nombre;
    private int edad;
    private String profesion;

    // Constructor
    public DatosBasicos(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

	public String getProfesion() {
		return profesion;
	}
}
