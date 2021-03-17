package prato;

import oggetti.*;

public class Cella {
	
	private boolean coperta;
	private Posizione posizione;
	private Oggetto oggetto;
	
	public Cella( Posizione p ) {
		this.coperta = true;
		this.posizione = p;
		this.oggetto = null;
	}	
	
	public Posizione getPosizione(){
		return this.posizione;
	}
	
	public boolean isCoperta() {
		return this.coperta;
	}
	
	public void scopri(){
		this.coperta = false;
	}
	
	public void addOggetto( Oggetto o ) {
		this.oggetto = o;
	}
	
	public void removeOggetto( Oggetto o ) {
		this.oggetto = null;
	}
	
	public boolean hasOggetto( Oggetto o ){
		if (this.oggetto!=null)
			return this.oggetto.getNome().equals(o.getNome());
		else 
			return false;	
	}
	
	public Oggetto getOggetto(){
		if (this.oggetto!=null)
			return this.oggetto;
		else
			return null;
	}
	
	public boolean isVuota() {
		if (this.oggetto!=null)
			return false;
		else
			return true;
	}
	
}
