package conexiones;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import anotaciones.RellenaArray;

@Component
public class Censo {

	private ArrayList<Persona> personas;
	
	
	
	//@RellenaArray
	public void verCenso() {
		for (Persona persona : getPersonas()) {
			System.out.println(persona.getNombre()+" - "+persona.getEdad());
		}
		
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
}
