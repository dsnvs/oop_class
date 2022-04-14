

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
	
	public CartaLacaio(int id, String nome, int mana) {
		this.ID = id;
		this.nome = nome;
		this.custoMana = mana;
	}
	
	public CartaLacaio(CartaLacaio original) {
		this.ID = original.getID();
		this.nome = original.getNome();
		this.ataque = original.getAtaque();
		this.vidaAtual = original.getVidaAtual();
		this.vidaMaxima = original.getVidaMaxima();
		this.custoMana = original.getCustoMana();
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
	
	public void alteraNomeFortalecido() {
		this.nome = this.nome + " Buffed";
	}
	
	public void buffar(int buff) {
		/* Será que esse método deveria utilizar os getters and setters para modificar os atributos? */
		if (buff > 0) {
			alteraNomeFortalecido();
			this.ataque += buff;
			this.vidaAtual += buff;
			this.vidaMaxima += buff;
		}
		/* Em dúvida de se o buff deve afetar a vidaMaxima e a vidaAtual, ou só a vidaMaxima. */
	}
	
	public void buffar(int buffAtaque, int buffVida) {
		if (buffAtaque > 0 || buffVida > 0 ) {
			alteraNomeFortalecido();
			this.ataque += buffAtaque;
			this.vidaAtual += buffVida;
			this.vidaMaxima += buffVida;
		}
		
	}
	
	
	@Override
		public String toString() {
		String out = String.format("%s (ID: %d)\nAtaque = %d\nVida Atual = %d\nVida Máxima = %d\nCusto de Mana = %d",
				getNome(),
				getID(),
				getAtaque(),
				getVidaAtual(),
				getVidaMaxima(),
				getCustoMana());
		return out;
	}
	
}
