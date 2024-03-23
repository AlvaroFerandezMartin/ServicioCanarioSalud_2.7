package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class NPacientesDiarios implements PacientesDiarios {

	@Override
	public String getNPacientes() {
		return "El número de Pacinetes hoy son 15";
	}

}
