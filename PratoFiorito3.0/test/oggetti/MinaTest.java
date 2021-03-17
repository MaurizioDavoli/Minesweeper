package oggetti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinaTest {
	private Oggetto a;
	private Oggetto b;
	private Oggetto c;
	private Oggetto d;

	@Before
	public void setUp() {
		a = new Mina();
		b = new Mina();
		c = new Mina();
		d = new Fiore(0);
	}

	@Test
	public void test() {
		assertTrue(a.equals(a));
		assertTrue(a.equals(b));
		assertTrue(a.equals(c));
		assertTrue(b.equals(a));
		assertTrue(b.equals(b));
		assertTrue(b.equals(c));
		assertTrue(c.equals(a));
		assertTrue(c.equals(b));
		assertTrue(c.equals(c));
		assertFalse(a==null);
		assertFalse(a.equals(d));
		assertFalse(b.equals(d));
		assertFalse(c.equals(d));
		assertTrue(d.equals(d));
		
	}

}
