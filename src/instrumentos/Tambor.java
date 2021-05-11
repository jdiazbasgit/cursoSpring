package instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Tambor extends Instrumento {

	@Override
	@Value("bpom pom pom en anotaciones")
	//@Scope("prototype")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}
	
}
