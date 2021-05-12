package conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import anotaciones.RellenaArray;

@Component
public class Censo {

	private ArrayList<Persona> personas;
	
	private Connection conexion;
	
	private ResultSet resultset;
	
	public ResultSet getResultset() {
		return resultset;
	}

	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}

	@Conexion
	@Resultado
	public void metodo() {
		
		while(getResultset().next()) {
			
		}
		
		for (Persona persona : personas) {
			System.err.println(------);
		}
		
	}
	
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

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
}
