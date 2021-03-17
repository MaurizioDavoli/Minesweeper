package prato;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GeneraNumeriTest {
	private GeneraNumeri gen;

	@Before
	public void setUp() throws Exception {
		gen = new GeneraNumeri(9);
	}

	@Test
	public void test() {
		assertTrue(10==gen.getNumeroMine());
	}
	
	@Test
	public void testPosizioneCasuale(){
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9);
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
		assertTrue( 0<gen.posizioneCasuale().getX() && gen.posizioneCasuale().getX()<9 );
	}

}
