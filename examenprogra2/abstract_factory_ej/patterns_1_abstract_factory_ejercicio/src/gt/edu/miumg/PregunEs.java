package gt.edu.miumg;

public class PregunEs implements FabricAbs{

	@Override
	public Saludos getSaludos() {
		return new SaludosEs();
	}

	@Override
	public Preguntas getPreguntas() {
		return new PreguntasEs();
	}


}
