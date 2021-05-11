package musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import instrumentos.Instrumento;

@Component
public class Solista extends Musico {

	@Override
	public void tocar() {
		System.out.println(getInstrumento().sonar());

	}
	
	@Override
	@Autowired
	@Qualifier("tambor")

	public void setInstrumento(Instrumento instrumento) {
		super.setInstrumento(instrumento);
	}
	
	public Solista() {
	}

	public Solista(Instrumento instrumento) {
		super(instrumento);
	}

	

}
