package aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import excepciones.InstrumentoRotoException;
import instrumentos.Guitarra;
import instrumentos.Instrumento;
import instrumentos.Tambor;
import instrumentos.Trompeta;
import musicos.HombreOrquesta;
import musicos.Solista;

@Component
@Aspect
public class MecanicoDeInstrumentos {

	@Pointcut("execution(@anotaciones.Mecanico * *.*(..))")
	// @Pointcut("execution(void *.main(String[]))")
	public void sujetador() {

	}

	@Around("sujetador()")
	public Object arreglarInstrumento(ProceedingJoinPoint joinPoint) throws InstrumentoRotoException {

		Object musico = joinPoint.getTarget();
		Object salida = null;
		try {
			// before
			System.out.println("señores apaguen los moviles");

			salida = joinPoint.proceed();
			// AfterReturning
			
		} catch (Throwable e) {
			// AfterThrowing
			System.out.println("señores se ha roto el instrumento");

			if (musico.getClass().isInstance(new Solista())) {

				Solista solista = (Solista) musico;
				solista.getInstrumento().setSonido("sonido arreglado");
				solista.tocar();
			} else {
				HombreOrquesta hombreOrquesta = (HombreOrquesta) musico;
				for (Instrumento instrumento : hombreOrquesta.getInstrumentos()) {
					if (instrumento.getSonido().equals("nada")) {
						if (instrumento.getClass().isInstance(new Trompeta()))
							instrumento.setSonido("tuu, tuuu, tuu asreglado");
						if (instrumento.getClass().isInstance(new Tambor()))
							instrumento.setSonido("pom, pom, pom asreglado");
						if (instrumento.getClass().isInstance(new Guitarra()))
							instrumento.setSonido("tlan, tlan tlan asreglado");
					}
				}
				hombreOrquesta.tocar();
			}

		} finally {
			// After
			System.out.println("señores enciendan los moviles");
		}

		return salida;
	}

}
