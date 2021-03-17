package prato;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import oggetti.*;

public class PratoTest {
	
	private Prato campo;
	private Prato campoGrande;
	private Cella unoUno;
	private Cella dueDue;
	private Posizione pos;
	private Posizione posi;
	private Posizione posiz;
	private Posizione posizi;
	private Oggetto mina;
	private List<Cella> celle;
	private List<Cella> celleGrandi;
	

	@Before
	public void setUp(){
		campo = new Prato(9);
		campoGrande = new Prato(15);
		unoUno = new Cella(pos);
		dueDue = new Cella(posi);
		pos = new Posizione(0,0);
		posi = new Posizione(8,8);
		posiz = new Posizione(88,88);
		posizi = new Posizione(3,4);
		mina = new Mina();	
		celle = campo.getPrato();
		celleGrandi = campoGrande.getPrato();
		
	}

	@Test
	public void testPrimaCasella() {
		assertEquals( campo.getCella(pos).getPosizione() , unoUno.getPosizione() );	
	}
	
	@Test
	public void testUltimaCasella() {
		assertEquals( campo.getCella(posi).getPosizione() , dueDue.getPosizione() );		
	}
	
	@Test
	public void testConteggioMine9() {
		int cont=0;
		for ( Cella a : celle ) {
			if (a.hasOggetto(mina))	cont++;
		}
		assertTrue(cont==10);
	}
	
	@Test
	public void testConteggioMine15() {
		int cont=0;
		for ( Cella a : celleGrandi ) {
			if (a.hasOggetto(mina))	cont++;
		}
		assertTrue(cont==20);
	}
	
	@Test
	public void testGetCella() {
		assertTrue(campo.getCella(pos).getPosizione().equals(pos));
		assertFalse(campo.getCella(pos).getPosizione().equals(posi));
		assertNull(campo.getCella(posiz));
		assertTrue(campo.getCella(posizi).getPosizione().equals(posizi));
		
	}
	
	@Test
	public void testProblema() {
		Oggetto c = new Mina();
		Prato campo = new Prato(9);
		List<Cella> a = new ArrayList<>();
		a = campo.getPrato();
		for (Cella b : a) {
			b.addOggetto(c);
		}
		assertTrue(a.get(1).hasOggetto(c));	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
