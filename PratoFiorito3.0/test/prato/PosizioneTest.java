package prato;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PosizioneTest {
	private Posizione uno;
	private Posizione due;
	private Posizione tre;
	private Posizione qua;

	@Before
	public void setUp() {
		uno = new Posizione(0,0);
		due = new Posizione(0,0);
		tre = new Posizione(1,0);
		qua = new Posizione(0,91);
	}

	@Test
	public void testEquals() {
		assertTrue(uno.equals(due));
	}
	
	@Test
	public void testNoEquals() {
		assertFalse(uno.equals(tre));
	}
	
	@Test 
	public void testGetX(){
		assertEquals(uno.getX(),0);
		assertEquals(due.getX(),0);
		assertEquals(tre.getX(),1);
		assertEquals(qua.getX(),0);
	}
	
	@Test 
	public void testGetY(){
		assertEquals(uno.getY(),0);
		assertEquals(due.getY(),0);
		assertEquals(tre.getY(),0);
		assertEquals(qua.getY(),91);
	}

}
