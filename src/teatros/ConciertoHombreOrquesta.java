package teatros;

import java.util.ArrayList;

import excepciones.InstrumentoRotoException;
import instrumentos.Instrumento;
import musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {

		HombreOrquesta hombreOrquesta = new HombreOrquesta();
		Instrumento tambor = new Instrumento("pom, pom, pom");
		Instrumento trompeta = new Instrumento("tuuu, tuuu, tuuu");
		Instrumento guitarra= new Instrumento("tlan, tlan, tlan");
		hombreOrquesta.setInstrumentos(new ArrayList<>());
		hombreOrquesta.getInstrumentos().add(trompeta);
		hombreOrquesta.getInstrumentos().add(tambor);
		hombreOrquesta.getInstrumentos().add(guitarra);
		try {
			hombreOrquesta.tocar();
		} catch (InstrumentoRotoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
