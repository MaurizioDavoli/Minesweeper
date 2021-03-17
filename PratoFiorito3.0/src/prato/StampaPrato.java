package prato;

public class StampaPrato {
	
	private Prato campo;
	
	public StampaPrato(Prato campo){
		this.campo=campo;
	}
	
	public void stampa() {
		int dim = this.campo.getDimensione();		
		int contY = 0;
		System.out.println("x  y->");
		System.out.println("|");
		
		System.out.println("v");
		for ( int x = -1 ; x<dim ; x++ ) {
			int contX = 0;
			for ( int y = -1 ; y<dim ; y++ ) {
				if ( y<0 && x<0) 
					System.out.print(" ");
				else if ( x<0 ) 
					System.out.print(contX);
				else if ( y<0 )
					System.out.print(contY);
				else {
					Posizione p = new Posizione(x,y);
					if (this.campo.getCella(p).isCoperta()) 
						System.out.print("@");
					else if (this.campo.getCella(p).getOggetto()==null) 
						System.out.print("°");
					else 
						System.out.print(this.campo.getCella(p).getOggetto().getSimbolo());
				}
				System.out.print(" ");
				contX++;
			}
			contY++;
			System.out.println("");
		}
	}
	
	public void stampaScoperto() {
		campo.scopriTutto();
		stampa();
	}
}
