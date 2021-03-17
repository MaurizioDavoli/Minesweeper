package prato;

import java.util.HashSet;
import java.util.Set;

public class Posizione {
	
	private int x;
	private int y;
	
	public Posizione( int x , int y ) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	@Override
	public boolean equals(Object o) {
		Posizione p = (Posizione)o;
		return (p.getX()==this.x && p.getY()==this.y);
	}
	
	@Override
	public int hashCode(){
		return x + y;
	}
	
	public Set<Posizione> getPosizioniAdiacenti() {
		Set<Posizione> circostanti = new HashSet<>();
		circostanti.add(new Posizione ( this.x-1 , this.y ));
		circostanti.add(new Posizione ( this.x-1 , this.y-1 ));
		circostanti.add(new Posizione ( this.x , this.y-1 ));
		circostanti.add(new Posizione ( this.x+1 , this.y-1 ));
		circostanti.add(new Posizione ( this.x+1 , this.y ));
		circostanti.add(new Posizione ( this.x+1 , this.y+1 ));
		circostanti.add(new Posizione ( this.x , this.y+1 ));
		circostanti.add(new Posizione ( this.x-1 , this.y+1 ));
		return circostanti;	
	}
	

}
