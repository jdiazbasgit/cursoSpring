package instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocameAMi")
public class Trompeta extends Instrumento {
	
	@Override
	@Value("atuuu, tuuu, tuuu en anotaciones")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}

}
