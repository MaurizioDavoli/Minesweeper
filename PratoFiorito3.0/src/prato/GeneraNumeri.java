package prato;

import java.util.Random;

public class GeneraNumeri {
	
	private int numeroMine;
	private int lato;
	
	public GeneraNumeri(int lato) {
		this.lato=lato;
		this.numeroMine = genera(lato);
	}

	private int genera(int lato) {	
		
		if ( lato <= 9 && lato > 4) 
			return 10;
		else if (lato <4 )
			return 0;
		else if (lato == 4)
			return 1;
		else 
			return 20;
		
	}
	
	public int getNumeroMine(){
		return this.numeroMine;
	}
	
	public Posizione posizioneCasuale() {
		Random randomGenerator = new Random();
		int x = 0 + randomGenerator.nextInt(this.lato);
		int y = 0 + randomGenerator.nextInt(this.lato);
		Posizione casuale = new Posizione ( x , y );
		return casuale ;
	}

}
