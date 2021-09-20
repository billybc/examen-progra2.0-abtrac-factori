package gt.edu.miumg;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestMultiIdioma {
	@Test
	public void test_es() {
		
		FabricaAbstracta fabricaEs = FabricaProductor.getFabrica("es");
		
		
		Preguntas preguntas = fabricaEs.getPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = fabricaEs.getSaludos();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		
		FabricaAbstracta fabricaEn = FabricaProductor.getFabrica("en");
		
		
		Preguntas preguntas = fabricaEn.getPreguntas();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		
		Saludos saludos = fabricaEn.getSaludos();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
