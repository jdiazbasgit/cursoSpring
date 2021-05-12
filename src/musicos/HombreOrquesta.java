package musicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import excepciones.InstrumentoRotoException;
import instrumentos.Instrumento;

@Component
public class HombreOrquesta implements MusicoInterface {

	@Autowired
	private List<Instrumento> instrumentos;
	
	@Override
	public void tocar() throws InstrumentoRotoException {
		for (Instrumento instrumento : getInstrumentos()) {
			System.out.println(instrumento.sonar());
		}

	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

}
