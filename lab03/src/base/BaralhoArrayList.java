package base;

import java.util.ArrayList;
import java.util.Collections;

public class BaralhoArrayList {
	private static final int MAX_CARDS = 30;
	private ArrayList<CartaLacaio> vetorCartas;
	
	public BaralhoArrayList() {
		vetorCartas = new ArrayList<CartaLacaio>();
	}
	
	public void adicionarCarta (CartaLacaio card) {
		if (vetorCartas.size() < MAX_CARDS) {
			vetorCartas.add(card);
		}
	}
	
	public CartaLacaio comprarCarta() {
		if (vetorCartas.size() > 0) {
			return vetorCartas.remove(vetorCartas.size() - 1);
		} else {
			return null;
		}
	}
	
	public void embaralhar() {
		Collections.shuffle(vetorCartas);
		final ArrayList<CartaLacaio> reversedVetorCartas =  new ArrayList<CartaLacaio>(vetorCartas);
		Collections.reverse(reversedVetorCartas);
		for (int i = 0; i < reversedVetorCartas.size(); i++) {
			System.out.println(reversedVetorCartas.get(i));
		}
	}
}
