package teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import conexiones.Censo;

public class VerCenso {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Censo censo=(Censo) ctx.getBean("censo");
		censo.verCenso();
	}

}
