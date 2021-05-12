package aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AvisadorDeAudiencia {
	
	@Pointcut("execution(@anotaciones.MensajesMovil * *.*(..))")
	//@Pointcut("execution(void *.main(String[]))")
	public void sujetador() {
		
	}
	
	@Before("sujetador()")
	public void apagarMoviles() {
		System.out.println("señores apaguen los moviles que va a empezar el concierto");
	}
	
	@AfterReturning("sujetador()")
	public void encenderMoviles() {
		
		System.out.println("Señores, el concierto ha terminado pueden encender los moviles");
	}
	
	@AfterThrowing("sujetador()")
	public void compensarPublico() {
		System.out.println("excepcion");
		System.out.println("señores pasen por taquilla que les devolvemos el dinero");
	}
	
	
	
	

}
