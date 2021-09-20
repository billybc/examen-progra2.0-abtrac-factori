package gt.edu.miumg;

public class Idiomas {

	public static FabricAbs getFabrica(String idioma) {
		if(idioma == "es") {
			return new PregunEn();
		}
		else if(idioma == "en") {
			return new PregunEn();
		}
		else {
			return null;
		}
	}
	
}
