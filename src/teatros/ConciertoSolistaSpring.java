package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import musicos.Solista;

public class ConciertoSolistaSpring {

	public static void main(String[] args) {
		

			ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
			Solista pepe=(Solista) ctx.getBean("solista");
			Solista luis= (Solista) ctx.getBean("solista1");
			
			
			pepe.tocar();
			
			System.out.println("toca luis==========");
			luis.tocar();
			
			System.out.println("pepe  cambia el sonido de su tambor");
			
			pepe.getInstrumento().setSonido("nuevo sonido cambiado");
			
			System.out.println("vuelve a tocar luis=======");
			
			luis.tocar();
	}

}
