package gt.edu.miumg;

public class PregunEn implements FabricAbs{

	@Override
	public Saludos getSaludos() {
		return new SaludosEn();
	}

	@Override
	public Preguntas getPreguntas() {
		return new PreguntasEn(); 
	}
	
}