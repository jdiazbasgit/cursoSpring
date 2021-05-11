package instrumentos;

public class Instrumento implements InstrumentoInterface,Comparable<Instrumento>{

	private String sonido;
	
	
	public Instrumento() {
	}
	
	
	// esto es una prueba
	
	public Instrumento(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public String sonar() {
		return getSonido();
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public int compareTo(Instrumento otro) {
		
		return  getSonido().compareTo(otro.getSonido());
	}

}
