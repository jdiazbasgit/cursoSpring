package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import excepciones.InstrumentoRotoException;
import musicos.HombreOrquesta;
import musicos.MusicoInterface;

public class ConciertoHombreOrquestaSpring {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		MusicoInterface hombreOrquesta= (MusicoInterface) ctx.getBean("hombreOrquesta");
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			

		}
	}

}
