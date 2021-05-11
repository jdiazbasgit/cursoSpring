package musicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import instrumentos.Instrumento;

@Component
public class HombreOrquesta extends Musico {

	@Override
	public void tocar() {
		for (Instrumento instrumento : getInstrumentos()) {
			System.out.println(instrumento.sonar());
		}

	}
	
	@Override
	@Autowired
	@Qualifier("tocameAMi")
	public void setInstrumentos(List<Instrumento> instrumentos) {
		super.setInstrumentos(instrumentos);
	}

}
