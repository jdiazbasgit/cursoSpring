package musicos;

import java.util.List;

import javax.sound.midi.Instrument;

import instrumentos.Instrumento;
import instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private Instrumento instrumetro;
	
	private List<Instrumento> instrumentos;
	
	public Musico() {
	}
	
	
	public Musico(Instrumento instrumetro) {
		this.instrumetro = instrumetro;
	}
	
	
	public Musico(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}



	@Override
	public abstract void tocar() ;
	
	public Instrumento getInstrumetro() {
		return instrumetro;
	}
	public void setInstrumetro(Instrumento instrumetro) {
		this.instrumetro = instrumetro;
	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}
	

}
