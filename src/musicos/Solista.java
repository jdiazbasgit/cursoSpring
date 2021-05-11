package musicos;

import instrumentos.Instrumento;

public class Solista extends Musico {

	@Override
	public void tocar() {
		System.out.println(getInstrumento().sonar());

	}
	
	public Solista() {
	}

	public Solista(Instrumento instrumento) {
		super(instrumento);
	}

	

}
