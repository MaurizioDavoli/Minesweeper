package oggetti;

public class Oggetto {
	
	private String nome;
	
	public Oggetto( String nome ) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object o){
		Oggetto a = (Oggetto)o;
		return a.getNome().equals(this.nome);
	}
	
	@Override 
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public char getSimbolo() {
		return 'E';
	}

}
