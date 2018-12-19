package pe.com.dyd.curso.junit.aserciones;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesTest {
	
	private Utilidades utils;
	
	@Before
	public void setUp() throws Exception {
		utils = new Utilidades();
	}

	@Test
	public void testGetArrayStrings() throws Exception {
		//given
		String[] esperado = {"uno", "dos", "tres"};
		
		//when
		String[] resultado = utils.getArrayStrings("uno", "dos", "tres");
		
		//then
		assertArrayEquals(esperado, resultado);
		assertEquals(3, resultado.length);
		assertEquals(esperado.length, resultado.length);
		
		assertEquals(esperado[0], resultado[0]);
		assertEquals(esperado[1], resultado[1]);
		assertEquals(esperado[2], resultado[2]);
		
		assertNotEquals(esperado[0], resultado[1]);
		assertNotEquals(esperado[0], resultado[2]);
	}

}
