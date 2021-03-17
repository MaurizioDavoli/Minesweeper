package prato;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import oggetti.*;

public class CellaTest {
	private Cella uno;
	private Cella due;
	private Cella tre;
	private Cella qua;
	private Posizione a;
	private Posizione b;
	private Posizione c;
	private Oggetto o;
	private Oggetto og;
	

	@Before
	public void setUp() throws Exception {
		a = new Posizione(0,0);
		b = new Posizione(1,0);
		c = new Posizione(0,91);
		uno = new Cella(a);
		due = new Cella(a);
		tre = new Cella(b);
		qua = new Cella(c);
		o = new Mina();
		og = new Mina();
	}

	@Test
	public void testCoperte() {
		assertTrue(uno.isCoperta());
		assertTrue(due.isCoperta());
		assertTrue(tre.isCoperta());
		assertTrue(qua.isCoperta());
	}
	
	@Test 
	public void testScopri() {
		uno.scopri();
		assertFalse(uno.isCoperta());
		due.scopri();
		assertFalse(due.isCoperta());
		tre.scopri();
		assertFalse(tre.isCoperta());
		qua.scopri();
		assertFalse(qua.isCoperta());
	}
	
	@Test
	public void testGetPosizione() {
		assertEquals(uno.getPosizione(),due.getPosizione());
		assertEquals(uno.getPosizione(),a);
		assertEquals(due.getPosizione(),a);
		assertEquals(tre.getPosizione(),b);
		assertEquals(qua.getPosizione(),c);
	}
	
	@Test
	public void testAddHasOggetto(){
		assertFalse(uno.hasOggetto(o));
		assertFalse(uno.hasOggetto(og));
		uno.addOggetto(o);
		assertTrue(uno.hasOggetto(o));
		assertTrue(uno.hasOggetto(og));
		uno.addOggetto(og);
		assertTrue(uno.hasOggetto(o));
		assertTrue(uno.hasOggetto(og));
	}

}
