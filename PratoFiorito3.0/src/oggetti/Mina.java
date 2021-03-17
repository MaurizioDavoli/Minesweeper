package oggetti;

public class Mina extends Oggetto {
	
	private static final String NOME_OGGETTO = "Mina";
	
	public Mina(){
		super(NOME_OGGETTO);
	}
	
	@Override
	public char getSimbolo(){
		return '&';
	}
	


}
