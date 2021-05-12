package musicos;

import java.util.List;

import instrumentos.Instrumento;

public class HombreOrquesta implements MusicoInterface {

	private List<Instrumento> instrumentos;
	
	@Override
	public void tocar() {
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
