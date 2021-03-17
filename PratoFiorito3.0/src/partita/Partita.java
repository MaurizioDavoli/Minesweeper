package partita;

import java.util.HashSet;
import java.util.Set;

import oggetti.*;
import prato.*;

public class Partita {

	private Prato prato;
	private boolean finita;
	private boolean persa;
	private boolean vinta;

	public Partita(int dimensione){	
		this.prato = new Prato(dimensione);
		this.finita = false;
		this.persa = false;
		this.vinta = false;
	}

	public Prato getPrato() {
		return this.prato;
	}

	public boolean isFinita(){
		return this.finita;
	}

	private void setFinita(){
		this.finita=true;
	}

	private void setPersa(){
		this.persa=true;
	}
	
	private void setVinta(){
		this.vinta=true;
	}
	
	public boolean getVinta(){
		return this.vinta;
	}
	
	public boolean getPersa(){
		return this.persa;
	}

	public void azione( int a , int b ) {
		Posizione selezionata = new Posizione(a-1,b-1);
		Oggetto mina = new Mina();
		Oggetto fiore = new Fiore(0);

		if ( prato.getCella(selezionata).hasOggetto(mina) ){
			setFinita();
			setPersa();
			prato.getCella(selezionata).scopri();
		}

		if ( prato.getCella(selezionata).hasOggetto(fiore) ) {
			prato.getCella(selezionata).scopri();
		}

		if ( prato.getCella(selezionata).isVuota() ) {
			this.scopriCasellePartendoDaUnaBianca(selezionata);
		}
		
		
	}

	public void scopriCasellePartendoDaUnaBianca( Posizione p ){
		Oggetto fiore = new Fiore(0);
		prato.getCella(p).scopri();
		Set<Posizione> circostanti = new HashSet<>();
		circostanti = p.getPosizioniAdiacenti();
		for ( Posizione po : circostanti ) {
			if ( this.prato.getCella(po) != null ) {
				if ( this.prato.getCella(po).isCoperta() ) {
					if ( this.prato.getCella(po).hasOggetto(fiore) ) 
						prato.getCella(po).scopri();
					if ( this.prato.getCella(po).isVuota() ) 
						scopriCasellePartendoDaUnaBianca(po);
				}
			}
		}
		
	}
	
	public void finita() {
		
		GeneraNumeri gen = new GeneraNumeri( this.prato.getDimensione() );
		int mine = gen.getNumeroMine();
		int coperte = this.prato.getCoperte();
		if ( coperte == mine ) {	
			setFinita();
			setVinta();
		}
	}



}
