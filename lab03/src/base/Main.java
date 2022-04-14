package base;

import util.Util;

public class Main {

	public static void main(String[] args) {
		CartaLacaio lac1 = new CartaLacaio(1, "Frodo Bolseiro", 2, 1, 1);
		CartaLacaio lac2 = new CartaLacaio(2, "Aragorn", 5, 7, 6);
		CartaLacaio lac3 = new CartaLacaio(3, "Legolas", 8, 4, 6);
		
		Baralho baralho1 = new Baralho();
		
		baralho1.adicionarCarta(lac1);
		baralho1.adicionarCarta(lac2);
		baralho1.adicionarCarta(lac3);
				
		baralho1.embaralhar();
		System.out.println("\n");
		baralho1.embaralhar();
		System.out.println("\n");
		baralho1.embaralhar();
		
		// ArrayList
		System.out.println("\n\n\n");
		
		BaralhoArrayList baralho2 = new BaralhoArrayList();
		
		baralho2.adicionarCarta(lac1);
		baralho2.adicionarCarta(lac2);
		baralho2.adicionarCarta(lac3);
				
		baralho2.embaralhar();
		System.out.println("\n");
		baralho2.embaralhar();
		System.out.println("\n");
		baralho2.embaralhar();
		
		// comprarCarta
		System.out.println("\n\n\n");		
		
		System.out.println(baralho2.comprarCarta());
		
		// Buffs
		System.out.println("\n\n\n");
		
		Util.buffar(lac2, 1);
		Util.buffar(lac3, 5, 5);
		
		System.out.println(lac2 + "\n\n" + lac3);
		
		// test
		
		baralho1.comprarCarta();
		baralho1.comprarCarta();
		baralho1.comprarCarta();
		baralho1.comprarCarta();



	}

}
