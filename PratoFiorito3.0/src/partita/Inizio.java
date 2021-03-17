package partita;


import java.util.Scanner;

import prato.StampaPrato;

public class Inizio {
	
	private Partita partita;
	private final static String MESSAGGIO_INIZIO = "ciao! prima di tutto seleziona la dimensione che preferisci per il campo" +
												   "(ti suggerisco 9)";

	public static int mossa() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
	}
	
	public static int risposta(){
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
		
	}
	
	public Inizio(int dimensione) {
		this.partita = new Partita(dimensione);	
		StampaPrato S = new StampaPrato(this.partita.getPrato());
		S.stampa();
		while ( !partita.isFinita() ) {
			System.out.println("inserire cordinate:");
			int x = mossa();
			int y = mossa();
			System.out.println( x + " " + y);
			partita.azione( x , y );
			S.stampa();		
			this.partita.finita();
		}
		if ( this.partita.getPersa() ) {
			System.out.println("SEI UN PO' SCARSO EH... HAI PERSO!");
			S.stampaScoperto();
		}
		
		if ( this.partita.getVinta() )
			System.out.println("HAI VINTOOOOO!!");
		System.out.println("PARTITA TERMINATA");
		nuovaPartita();
		
	}
	
	public void nuovaPartita(){
		System.out.println("vuoi giocare ancora?");
		Scanner sc = new Scanner(System.in);
		String risp = sc.next();
		
		if ( risp.equals("si")) {
			System.out.println(MESSAGGIO_INIZIO);
			new Inizio( risposta() );
		}
		else
			System.out.println("bene ciao");
			
	}
	
	public static void main(String[] args) {
		System.out.println(MESSAGGIO_INIZIO);
		new Inizio( risposta() );
	}

}
