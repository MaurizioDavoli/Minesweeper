package prato;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import oggetti.*;

public class Prato {
	
	private int dimensione;
	private List<Cella> campo;
	
	public Prato(int dimensione) {
		this.dimensione = dimensione;
		this.campo = new ArrayList<>();
		inizializza();
	}
	
	private void inizializza(){
		
		generaCelle();
		
		aggiungiMine();
		
		aggiungiFiori();
		
	}
	
	private void generaCelle(){
		for ( int x = 0 ; x<this.dimensione ; x++ ) {
			for ( int y = 0 ; y<this.dimensione ; y++ ) {
				Posizione p = new Posizione( x , y );
				Cella cella = new Cella( p );
				this.campo.add(cella);	
			}
		}
	}
	
	private void aggiungiMine() {	
		
		GeneraNumeri gen = new GeneraNumeri(this.dimensione);
		int numMine = gen.getNumeroMine()+1;
		Oggetto o = new Mina();

		while ( numMine > 1 ){
			Posizione casuale = gen.posizioneCasuale();
			for ( Cella c : this.campo ) {	
				if (c.getPosizione().equals(casuale)) {
					if(!c.hasOggetto(o)) {
						numMine = numMine-1;
						c.addOggetto(o);
					}
				}
			}
		}
	}
	
	private void aggiungiFiori() {
		for ( int x = 0 ; x<this.dimensione ; x++ ) {
			for ( int y = 0 ; y<this.dimensione ; y++ ) {
				Oggetto mina = new Mina();
				Posizione pos = new Posizione( x , y );
				if ( numeroMineVicino(pos)>0 && !getCella(pos).hasOggetto(mina) ) {
					Oggetto fiore = new Fiore(this.numeroMineVicino(pos));
					getCella(pos).addOggetto(fiore);
				}					
			}
		}
		
	}
	
	private int numeroMineVicino( Posizione p ) {
		Set<Posizione> adiacenti = new HashSet<>( p.getPosizioniAdiacenti() );
		Oggetto mina = new Mina();
		int mine = 0;
		for ( Posizione pos : adiacenti ) {
			if ( getCella(pos) != null ) {
				if  ( getCella(pos).hasOggetto(mina) )
					mine++;
			}	
		}
		return mine;
	}
	
	public Set<Posizione> getBiancheVicino( Posizione p ) {
		Set<Posizione> adiacenti = new HashSet<>( p.getPosizioniAdiacenti() );
		Set<Posizione> bianche = new HashSet<>( p.getPosizioniAdiacenti() );
		for ( Posizione pos : adiacenti ) {
			if ( getCella(pos) != null ) {
				if  ( getCella(pos).isVuota() )
					bianche.add(pos);
			}	
		}
		return bianche;
	}
	
	public Set<Posizione> getFioriVicino( Posizione p ) {
		Oggetto fiore = new Fiore(0);
		Set<Posizione> adiacenti = new HashSet<>( p.getPosizioniAdiacenti() );
		Set<Posizione> fiori = new HashSet<>( p.getPosizioniAdiacenti() );
		for ( Posizione pos : adiacenti ) {
			if ( getCella(pos) != null ) {
				if  ( getCella(pos).hasOggetto(fiore) )
					fiori.add(pos);
			}	
		}
		return fiori;
	}
		
	public Cella getCella( Posizione p ) {		
			for ( Cella c : this.campo ) {
				if ( c.getPosizione().equals(p) )
					return c;	
			}
			return null;
	}
	
	public int getCoperte(){
		int coperte = 0;
		for ( Cella c : this.campo ){
			if (c.isCoperta())
				coperte++;
		}
		return coperte;
	}
	
	public List<Cella> getPrato(){
		return this.campo;
	}

	public int getDimensione(){
		return this.dimensione;
	}
	
	public void scopriTutto(){
		for (Cella c : this.campo)
			c.scopri();
	}
	
}





























