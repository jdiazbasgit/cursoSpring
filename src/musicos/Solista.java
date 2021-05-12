package musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import anotaciones.Mecanico;
import excepciones.InstrumentoRotoException;
import instrumentos.Instrumento;

@Component
public class Solista implements MusicoInterface {

	@Autowired
	@Qualifier("tambor")
	private Instrumento instrumento;
	
	@Override
	@Mecanico
	public void tocar() throws InstrumentoRotoException {
		System.out.println(getInstrumento().sonar());

	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	

	

}
