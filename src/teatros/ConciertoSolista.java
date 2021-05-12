package teatros;

import excepciones.InstrumentoRotoException;
import instrumentos.Instrumento;
import musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		Solista solista= new Solista();
		Instrumento tambor= new Instrumento();
		tambor.setSonido("pom, pom, pom");
		solista.setInstrumento(tambor);
		try {
			solista.tocar();
		} catch (InstrumentoRotoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
