package musicos;

public class Solista extends Musico {

	@Override
	public void tocar() {
		System.out.println(getInstrumetro().sonar());

	}
	
	public Solista() {
	}
	
	

}
