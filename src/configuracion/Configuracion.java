package configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import instrumentos.Guitarra;

@Configuration
@ComponentScan(value = {"instrumentos","musicos","aspectos","conexiones"})
@EnableAspectJAutoProxy
public class Configuracion {
	
	
	@Bean
	public Guitarra getGuitarra() {
		
		Guitarra guitarra= new Guitarra();
		guitarra.setSonido("sonido nuevo de guitarra en clases");
		return guitarra;
	}

}
