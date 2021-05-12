package aspectos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.Driver;

import conexiones.Censo;
import conexiones.Persona;

@Component
@Aspect
public class ConexionBaseDatos {

	
	@Pointcut("execution(@anotaciones.RellenaArray * *.*(..))")
	// @Pointcut("execution(void *.main(String[]))")
	public void sujetador() {

	}
	
	@Around("sujetador()")
	public Object rellenaCenso(ProceedingJoinPoint joinPoint) {
		
		Object salida= null;
		
		try {
			Censo censo=(Censo) joinPoint.getTarget();
			DriverManager.registerDriver(new Driver());
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursoSpring?useSSL=true","cursoSpring","Cursocurso1;");
			Statement st= conexion.createStatement();
			ResultSet rs=st.executeQuery("select nombre,edad from personas");
			if(censo.getPersonas()==null)
				censo.setPersonas(new ArrayList<>());
			while(rs.next()) {
				Persona persona= new Persona();
				persona.setNombre(rs.getString(1));
				persona.setEdad(rs.getInt(2));
				censo.getPersonas().add(persona);
			}
			conexion.close();
			
			salida=joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salida;
	}
}
