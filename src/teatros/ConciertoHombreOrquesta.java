package teatros;

import java.util.ArrayList;
import java.util.TreeSet;

import instrumentos.Instrumento;
import musicos.HombreOrquesta;

public class ConciertoHombreOrquesta {

	public static void main(String[] args) {

		HombreOrquesta hombreOrquesta = new HombreOrquesta();
		Instrumento tambor = new Instrumento("apom, pommmm, pom");
		Instrumento trompeta = new Instrumento("btuuu, tuuu, tuuu");
		Instrumento guitarra = new Instrumento("ctlan, tlan, tlan");
		hombreOrquesta.setInstrumentos(new ArrayList<Instrumento>());
		hombreOrquesta.getInstrumentos().add(trompeta);
		hombreOrquesta.getInstrumentos().add(tambor);
		hombreOrquesta.getInstrumentos().add(guitarra);
		hombreOrquesta.tocar();
		System.out.println();
		System.err.println(hombreOrquesta.hashCode());
		System.err.println(tambor.hashCode());
	}

}
