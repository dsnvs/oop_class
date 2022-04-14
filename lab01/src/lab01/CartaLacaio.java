package lab01;

public class CartaLacaio {
	private String nome;
	private int ID, ataque, vidaAtual, vidaMaxima, custoMana;
	
	public CartaLacaio(int id, String nome, int ataque, int vidaInicial, int mana) {
		this.ID = id;
		this.nome = nome;
		this.ataque = ataque;
		this.vidaAtual = vidaInicial;
		this.vidaMaxima = vidaInicial;
		this.custoMana = mana;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	
	public int getVidaAtual() {
		return this.vidaAtual;
	}
	
	public int getVidaMaxima() {
		return this.vidaMaxima;
	}
	
	public int getCustoMana() {
		return this.custoMana;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public void setVidaAtual(int vidaAtual) {
		this.vidaAtual = vidaAtual;
	}
	
	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}
	
	public void setCustoMana(int custoMana) {
		this.custoMana = custoMana;
	}
	
	
	@Override
		public String toString() {
		String out = String.format("%s (ID: %o)\nAtaque = %o\nVida Atual = %o\nVida Máxima = %o\nCusto de Mana = %o",
				getNome(),
				getID(),
				getAtaque(),
				getVidaAtual(),
				getVidaMaxima(),
				getCustoMana());
		return out;
	}
	
}
