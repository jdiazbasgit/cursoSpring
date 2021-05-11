package instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocameAMi")
public class Guitarra extends Instrumento {

	
	@Override
	@Value("ctlan ,tlan ,tlan en anotaciones")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}
}
