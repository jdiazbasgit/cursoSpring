package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configuracion.Configuracion;
import excepciones.InstrumentoRotoException;
import musicos.HombreOrquesta;
import musicos.MusicoInterface;

public class ConciertoHombreOrquestaSpring {

	public static void main(String[] args) {
		//ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Configuracion.class);
		MusicoInterface hombreOrquesta= (MusicoInterface) ctx.getBean("hombreOrquesta");
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			

		}
	}

}
