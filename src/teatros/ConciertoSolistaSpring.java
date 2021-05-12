package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import excepciones.InstrumentoRotoException;
import musicos.Solista;

public class ConciertoSolistaSpring {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Solista pepe = (Solista) ctx.getBean("solista");

		try {
			pepe.tocar();

			
		} catch (InstrumentoRotoException e) {
			System.out.println("señores se acabo el concierto, se ha roto el instrumento");
		}
	}

}
