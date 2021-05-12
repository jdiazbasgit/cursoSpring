package instrumentos;

import excepciones.InstrumentoRotoException;

public interface InstrumentoInterface {
	
	public String sonar() throws InstrumentoRotoException;

}
