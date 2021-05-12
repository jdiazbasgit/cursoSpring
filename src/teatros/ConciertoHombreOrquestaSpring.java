package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import excepciones.InstrumentoRotoException;
import musicos.HombreOrquesta;

public class ConciertoHombreOrquestaSpring {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		HombreOrquesta hombreOrquesta= (HombreOrquesta) ctx.getBean("hombreOrquesta");
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			System.out.println("señores se acabo el concierto, se ha roto el instrumento");

		}
	}

}
