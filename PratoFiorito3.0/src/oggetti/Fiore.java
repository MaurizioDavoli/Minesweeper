package oggetti;

public class Fiore extends Oggetto {
	
	private static final String NOME_OGGETTO = "FIORE";
	private int petali;
	
	public Fiore(int petali){
		super(NOME_OGGETTO);
		this.petali=petali;
	}
	
	public char getSimbolo(){
		if (this.petali == 8) 
			return '8';
		if (this.petali == 7) 
			return '7';
		if (this.petali == 6) 
			return '6';
		if (this.petali == 5) 
			return '5';
		if (this.petali == 4) 
			return '4';
		if (this.petali == 3) 
			return '3';
		if (this.petali == 2) 
			return '2';
		if (this.petali == 1) 
			return '1';
		else 
			return 'E';
	}

}
