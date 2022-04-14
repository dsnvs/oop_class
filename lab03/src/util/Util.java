package util;

import base.CartaLacaio;

public class Util {
	public static final int MAX_CARDS = 30;
	
	private static void alteraNomeFortalecido(CartaLacaio lac) {
		lac.setNome(lac.getNome() + " Buffed");
	}
	
	public static void buffar(CartaLacaio lac, int buff) {
		if (buff > 0) {
			alteraNomeFortalecido(lac);
			lac.setAtaque(lac.getAtaque() + buff);
			lac.setVidaAtual(lac.getVidaAtual() + buff);
			lac.setVidaMaxima(lac.getVidaMaxima() + buff);
		}
	}
	
	public static void buffar(CartaLacaio lac, int buffAtaque, int buffVida) {
		if (buffAtaque > 0 || buffVida > 0 ) {
			alteraNomeFortalecido(lac);
			lac.setAtaque(lac.getAtaque() + buffAtaque);
			lac.setVidaAtual(lac.getVidaAtual() + buffVida);
			lac.setVidaMaxima(lac.getVidaMaxima() + buffVida);
		}
	}

}
