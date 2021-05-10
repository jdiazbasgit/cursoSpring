package teatros;

import instrumentos.Instrumento;
import musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		Solista solista= new Solista();
		Instrumento tambor= new Instrumento();
		tambor.setSonido("pom, pom, pom");
		solista.setInstrumetro(tambor);
		solista.tocar();
	}

}
