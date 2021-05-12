package musicos;

import instrumentos.Instrumento;

public class Solista implements MusicoInterface {

	private Instrumento instrumento;
	
	@Override
	public void tocar() {
		System.out.println(getInstrumento().sonar());

	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	

	

}
