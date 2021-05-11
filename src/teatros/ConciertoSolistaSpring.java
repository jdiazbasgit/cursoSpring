package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import musicos.Solista;

public class ConciertoSolistaSpring {

	public static void main(String[] args) {
		

			ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
			Solista pepe=(Solista) ctx.getBean("solista");
			
			
			pepe.tocar();
			
	}

}
