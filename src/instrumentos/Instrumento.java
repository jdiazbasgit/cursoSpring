package instrumentos;

import excepciones.InstrumentoRotoException;

public class Instrumento implements InstrumentoInterface {

	private String sonido;
	
	
	public Instrumento() {
	}
	
	
	// esto es una prueba
	
	public Instrumento(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public String sonar() throws InstrumentoRotoException {
		if(getSonido().equals("nada"))
			throw new InstrumentoRotoException();
		return getSonido();
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
