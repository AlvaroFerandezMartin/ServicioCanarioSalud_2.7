package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Medico implements AcionesBasicasPersonal {

    private String nombre;
    private int edad;
    private String profesion;
    

    public Medico(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }
    
    @Autowired
    private  PacientesDiarios NPacientes;

    
	
	public Medico(PacientesDiarios nPacientes) {
		NPacientes = nPacientes;
	}
	
	
	public String getNuemeroPacientes() {
		return NPacientes.getNPacientes();
	}
	
	public String getNPacientes() {
		
		return NPacientes.getNPacientes();
		
		}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    @Override
    public String Fichar() {
        return "entrando a trabajar";
    }

    @Override
    public String Descanso() {
        return "tomando un descanso";
    }

    @Override
    public String Salida() {
        return "saliendo de trabajar";
    }
}
