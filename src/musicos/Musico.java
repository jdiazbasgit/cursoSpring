package musicos;

import java.util.List;

import javax.sound.midi.Instrument;

import instrumentos.Instrumento;
import instrumentos.InstrumentoInterface;

public abstract class Musico implements MusicoInterface {

	private Instrumento instrumento;
	
	private List<Instrumento> instrumentos;
	
	public Musico() {
	}
	
	
	
	public Musico(Instrumento instrumento) {
		this.instrumento = instrumento;
	}



	public Musico(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}



	@Override
	public abstract void tocar() ;
	
	
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}


	public Instrumento getInstrumento() {
		return instrumento;
	}


	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	

}
